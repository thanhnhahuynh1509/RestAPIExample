#Server
tomcat 9

#IDE
eclipse

#Database
PostgreSQL

#docker tomcat
A basic setup to running Simple Rest API using Docker

#steps
* install Docker (https://docs.docker.com/engine/install/)
* To pull and run Docker image of PostgreSQL. Enter these command on CMD
    -> docker pull thanhnhahuynh1509/myrepo
    -> docker run --name postgres -e POSTGRES_USER=postgres -e POSTGRES_PASSWORD=postgrespw -p 49156:5432 -v /data:/var/lib/postgresql/data -d thanhnhahuynh1509/myrepo

* After that you're able to pull and run Docker image of Rest API
    -> docker pull thanhnhahuynh1509/myrest
    -> docker run -p 8082:8080 thanhnhahuynh1509/myrest

* Open your browser and type localhost:8082/restExample you will see the Swagger which will be show all the Rest API link.
