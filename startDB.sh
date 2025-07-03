#!/bin/bash
docker run --name 470DB \
  --network pg-network \
  -e POSTGRES_USER=jeffro \
  -e POSTGRES_PASSWORD=beene4 \
  -e POSTGRES_DB=470DB \
  -v pgdata:/var/lib/postgresql/data \
  -p 5432:5432 \
  -d postgres
