#!/bin/bash
docker run --name pgadmin \
  --network pg-network \
  -e PGADMIN_DEFAULT_EMAIL=test@test.com \
  -e PGADMIN_DEFAULT_PASSWORD=password \
  -p 8080:80 \
  -d dpage/pgadmin4

