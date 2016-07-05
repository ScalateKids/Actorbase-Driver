[![Build Status](https://travis-ci.org/ScalateKids/Actorbase-Driver.svg?branch=master)](https://travis-ci.org/ScalateKids/Actorbase-Client)

# Actorbase-Driver

Actorbase is essentially an actor system built upon a server component that
exposes some API forming a REST- ful web service. To facilitate the use from
inside a Scala source, a driver has been developed in order to allow the usage
of all features that Actorbase provides.

The driver is the best way to interact with Actorbase for developers.

It returns navigable collections in which is possible to make operations that
will have instantly effect on the server.

The library it isn't published on Maven central yet, so in order to add it as a
depencency just clone the repository and publish-local on your computer:
```sh
$ git clone https://github.com/ScalateKids/Actorbase-Driver.git
$ cd Actorbase-Driver
$ sbt publish-local
```
After these steps the usage of the driver become trivial, just add to your
project as a depencency in build.sbt:
```scala
libraryDependencies += "com.actorbase" %% "actorbase-driver" % "1.0"
```

