#!/bin/sh

echo "Undeploying"
kubectl delete -f conf/Deployment_database.yml
kubectl delete -f Deployment.yml
