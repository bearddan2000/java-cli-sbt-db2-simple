# java-cli-buildr-db2-join

## Description
Creates a small database table
called `dog`. This table, `dog`, has 2 non-clustered
index and has been normalized to 3NF.

Two new tables have been added, `breedLookup` and `colorLookup`.
Creates a new table `dog_expanded` that joins
`dog`, `breedLookup` and `colorLookup`.

All output normally
seen in a terminal will be in `java-srv/log` which will dump to the screen. The project may seem to hang but the logs from the container must be written to the project this can take up to 3 min.

## Tech stack
- docker-wait
- java
- buildr
  - log4j
  - db2 driver

## Docker stack
- vanto/apache-buildr:latest-jruby-jdk8
- ibmcom/db2

## To run
`sudo ./install.sh -u`
Creates java-srv/log

## To stop
`sudo ./install.sh -d`
Removes java-srv/log

## For help
`sudo ./install.sh -h`
