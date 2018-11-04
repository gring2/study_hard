import pytest
from flaskr.db import get_db


def test_index(client, auth):
    resp = client.get('/')
    assert b'Log In' in resp.data
    assert b'Register' in resp.data

    auth.login()
    resp = client.get('/')
    assert b'Log Out' in resp.data
    assert b'test title' in resp.data
    assert b'by test on 2018-01-01' in resp.data
    assert b'test\nbody' in resp.data
    assert b'href="/1/update"' in resp.data


@pytest.mark.parametrize('path', (
    '/create',
    '/1/update',
    '/1/delete'
))
def test_login_required(client, path):
    resp = client.post(path)
    assert resp.headers['Location'] == 'http://localhost/auth/login'


def test_author_required(app, client, auth):
    # change the post author to another user
    with app.app_context():
        db = get_db()
        db.execute('UPDATE post SET author_id = 2 WHERE id = 1')
        db.commit()

    auth.login()
    # current user can't modify other user's post
    assert client.post('/1/update').status_code == 403
    assert client.post('/1/delete').status_code == 403
    # current user doesn't see edit link
    assert b'href="/1/update"' not in client.get('/').data


@pytest.mark.parametrize('path', (
    '/2/update',
    '/2/delete',
))
def test_exists_required(client, auth, path):
    auth.login()
    assert client.post(path).status_code == 404


def test_delete(client, auth, app):
    auth.login()
    response = client.post('/1/delete')
    assert response.headers['Location'] == 'http://localhost/'

    with app.app_context():
        db = get_db()
        post = db.execute('SELECT * FROM post WHERE id = 1').fetchone()
        assert post is None
