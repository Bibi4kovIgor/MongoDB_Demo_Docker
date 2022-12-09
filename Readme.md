## Launch Java application with **MongoDB** in container  
This is the MongoDB demo repository with  <br>
Please see configuration, which is stored in folder:
```/container/docker/mongo_server```
1. Build image with the command: <br>
```$ docker image build -f .\mongo_server -t local/mongo:6.0.3 . ``` <br>
2. Create container and launch it: <br>
``` $ docker container run --name mongo_container -p 27017:27017 --rm -d local/mongo:6.0.3 ``` <br>
3. Launch application as usual

## Launch Java application with **MongoDB** in docker-container
``
