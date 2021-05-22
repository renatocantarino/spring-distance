# spring-distance


docker run --name cities-db -d -p 5432:5432 -e POSTGRES_USER=postgres_user_city -e POSTGRES_PASSWORD=super_password -e POSTGRES_DB=cities postgres

git dados => https://github.com/chinnonsantos/sql-paises-estados-cidades/tree/master/PostgreSQL


docker run -it --rm --net=host -v  ${PWD}:/tmp postgres /bin/bash

psql -h localhost -U postgres_user_city cities -f /tmp/pais.sql
psql -h localhost -U postgres_user_city cities -f /tmp/estado.sql
psql -h localhost -U postgres_user_city cities -f /tmp/cidade.sql

para ativar o geolocation no postgres
psql -h localhost -U postgres_user_city cities

CREATE EXTENSION cube; 
CREATE EXTENSION earthdistance;



pageable ?page=0&size=15&sort=name
