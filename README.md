```
aws ecr get-login-password | docker login --username AWS --password-stdin ${registry}
docker build -t sample-web-application .
docker tag sample-web-application ${registry}/${repository}:${tag}
docker push ${registry}/${repository}:${tag}
```