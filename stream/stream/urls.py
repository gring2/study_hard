"""stream URL Configuration

The `urlpatterns` list routes URLs to views. For more information please see:
    https://docs.djangoproject.com/en/1.11/topics/http/urls/
Examples:
Function views
    1. Add an import:  from my_app import views
    2. Add a URL to urlpatterns:  url(r'^$', views.home, name='home')
Class-based views
    1. Add an import:  from other_app.views import Home
    2. Add a URL to urlpatterns:  url(r'^$', Home.as_view(), name='home')
Including another URLconf
    1. Import the include() function: from django.conf.urls import url, include
    2. Add a URL to urlpatterns:  url(r'^blog/', include('blog.urls'))
"""
from django.conf.urls import *
from django.contrib import admin
from django.conf.urls.static import *
from rest_framework_swagger.views import get_swagger_view
from rest_framework.routers import DefaultRouter
from blog.views import *

router = DefaultRouter()
schema_view = get_swagger_view(title='Pastebin API')
urlpatterns = [
    url(r'^admin/', admin.site.urls),
    url(r'^board/', include('post_service.urls')),
    url(r'user/', include('user_manager.url')),
    url(r'^stream/', include('streaming.urls')),
     url(r'^api/blog/', blog_api.as_view()),
]+ static(settings.MEDIA_URL, document_root=settings.MEDIA_ROOT)
