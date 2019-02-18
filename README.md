Buil artifact using Maven

Maven

```
mvn clean install
```

Create Image
```
docker build  -t neosuniversity/demo-microserv .
```

Run image
```
docker run -d -p 8080:8080 neosuniversity/demo-microserv
```

in case you want to push your images
```
docker login --username=yourusername   
```

docker images
docker tag ImageID neossoftware/microservices:latest
docker push neossoftware/microservices


To run docker image in a client machine
```
docker run -d  -p 8080:8080 neossoftware/microservices
```
I