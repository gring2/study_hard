from django.contrib import auth
from django.contrib.auth.models import User
from django.http import HttpResponse
from django.shortcuts import render, redirect
# Create your views here.
from django.urls import reverse

from user_manager.forms import *


def login(request):
    template = 'login_form.html'
    context = {'login_form': LoginForm()}

    return render(request, template, context)


def login_validate(request):
    login_form_data = LoginForm(request.POST)

    if login_form_data.is_valid():
        user = auth.authenticate(username=login_form_data.cleaned_data['id'],
                                 password=login_form_data.cleaned_data['password'])
        if user is not None:
            if user.is_active:
                auth.login(request, user)

                return redirect(reverse('board:board'))

        else:
            return HttpResponse('No user or invalid password')
    else:
        return HttpResponse('Login Form is not valid')

    return HttpResponse('Unknow Error')


def join_page(request):
    if request.method == 'POST':
        form_data = JoinForm(request.POST)

        if form_data.is_valid():
            username = form_data.cleaned_data['id']
            password = form_data.cleaned_data['password']
            User.objects.create_user(username=username, password=password)

            return redirect(reverse('user_manager:login'))
    else:
        form_data = JoinForm()
    template = 'join_page.html'

    context = {'join_form': JoinForm()}
    return render(request, template, context)
