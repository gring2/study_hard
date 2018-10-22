from django.db import models

# Create your models here.


class Video(models.Model):
    title = models.CharField(max_length=255, blank=True)
    file = models.FileField(upload_to='videos/')
    uploaded_at = models.DateTimeField(auto_now_add=True)


