#!/bin/sh

echo "Setup usage of Minikube docker"
eval $(minikube docker-env)

echo "Building"
./gradlew clean build buildImage

echo "Deploying"
## TODO update build script to add a specific tag
kubectl set image deployment/kuberspring-app-deployment kuberspring-app=roamingthings/kuberspring:latest
kubectl set image deployment/kuberspring-app-deployment kuberspring-app=roamingthings/kuberspring
