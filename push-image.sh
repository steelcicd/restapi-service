REGION=$1
REGISTRY_URI=$2

echo 'Building image...'
# build image
docker build -t $REGISTRY_URI:latest .

# login to ecr
echo 'Logging in to ECR...'
aws ecr get-login-password --region $REGION | docker login --username AWS --password-stdin $REGISTRY_URI
# push image
echo 'Pushing image...'
docker push REGISTRY_URI:latest
echo 'Image pushed successfully!'