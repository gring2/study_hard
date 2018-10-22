from django.conf.urls import url

from user_manager.views import *

app_name='user_manager'
urlpatterns = [
    url(r'^login/$', login, name='login'),
    url(r'^login/validate/$', login_validate, name='validate'),
    url(r'^join/$', join_page),
]