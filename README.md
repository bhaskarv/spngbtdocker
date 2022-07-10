# Spring boot application with Docker
Sample Spring boot application with Docker. 
Appplicaion war file is present in the docker folder. Build an imange from the docker folder and start a ontainer with it and you are all set.

### Command examples
>java -Dspring.profiles.active=default -jar target/spring-boot-ops.war   - To run the program 

Run below command from the docker folder to build a docker image of the application
>docker build -t spring-boot-app:latest .

List all the docker images
>docker image ls

Create a docker container
>docker run -d  -p 8080:8080 spring-boot-app:latest

- d run as a daemon process and detach from the console
- p map port 8080 on the host machine to port 8080 in the container
- spring-boot-app:latest name:tag of the image to run

List all the running containers
>docker ps






