## Launch Java application with **MongoDB** in container  
This is the MongoDB demo repository with  <br>
Please see configuration, which is stored in folder:
```/container/docker/mongo_server```
1. Build image with the command: <br>
```$ docker image build -f .\mongo_server -t local/mongo:6.0.3 . ``` <br>
2. Create container and launch it: <br>
``` $ docker container run --name mongo_container -p 27017:27017 --rm -d local/mongo:6.0.3 ``` <br>
3. Launch application as usual

## Launch Java application with **MongoDB** via docker-compose
1. Install `docker-compose` instructions:
    - install via chocolately package manager
      `$ choco install docker-compose`
2. Create Dockerfiles for images (one file per one image) in the separate folder, for instance "docker". <br>
  (See container/docker/application, container/docker/mongo_server for examples)
3. Create docker compose script. (See container/docker-compose.yml for example)
   - it is needed to use at least one persistent storage place for database (**bind mount** or **volume**)
4. Launch your *.jar application and **MongoDB** (or other database server), simultaneously via **docker-compose**

## docker-compose launch instructions:
1. Create and launch docker-compose:
`$ docker-compose -p mongo-service -f docker-compose.yml up -d --build`
2. Shut down docker-compose and free all resources
`$ docker-compose -p mongo-service -f docker-compose.yml down`
Options list:
- -p -- set prefix (containers names will be specified with it)
- -f -- set custom docker-compose.yml name
- up -- docker-compose launch command
- -d -- detached mode (free console from supported info). Launch docker-compose in background mode
--build -- build images from Dockerfiles inside of docker-compose when it launches

