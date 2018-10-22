from django.conf.urls import *

from post_service.views import *

app_name = 'board'
urlpatterns = [
    url(r'^$', post_list, name='board'),

]