#!/bin/sh

echo "Setup usage of Minikube docker"
eval $(minikube docker-env)

echo "Building"
./gradlew clean build buildImage

echo "Deploying"
kubectl apply -f conf/Deployment_persistence.yml
kubectl apply -f conf/Deployment_database.yml
kubectl apply -f Deployment.yml
