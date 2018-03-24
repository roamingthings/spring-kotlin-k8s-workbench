#!/bin/sh

echo "Setup usage of Minikube docker"
eval $(minikube docker-env)

echo "Building"
./gradlew clean build buildImage

echo "Deploying"
kubectl delete -f Deployment.yml
kubectl apply -f Deployment.yml
