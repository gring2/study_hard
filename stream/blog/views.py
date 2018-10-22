from django.shortcuts import render
from django.http.response import HttpResponse
# Create your views here.
from blog.models import Post
from rest_framework.generics import GenericAPIView
from rest_framework import serializers, mixins


def blog_page(reqeust):
    post_list = Post.objects.all()

    return HttpResponse('Hello' + post_list[0].title)


class PostSerializer(serializers.ModelSerializer):
    class Meta:
        model = Post
        exclude = ('id',)


class blog_api(GenericAPIView, mixins.ListModelMixin):
    queryset = Post.objects.all()
    serializer_class = PostSerializer

    def get(self, request, *args, **kwargs):
        return self.list(request, *args, *kwargs)
