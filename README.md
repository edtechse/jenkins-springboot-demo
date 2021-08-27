Commands to build and run the docker file

1. To build a docker image from the Dockerfile,
   goto dir where Dockerfile is present,
      docker build -t niyaaniyan/springboot-docker . 
2. To run the docker image in container
      docker run -d -p 8080:8080 niyaaniyan/springboot-docker
3.To see all running docker images
      docker images 
3. Tag the springboot web image
      docker tag <docker ps image id> <your dockerhub userid>/subsdevices:v1

4. Push the tagged image to the docker hub
     docker push <your dockerhub userid>/subsdevices:v1
