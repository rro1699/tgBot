#!/bin/bash

# Add environment variables
export BOT_NAME=$1
export BOT_TOKEN=$2

# Start new deployment
docker-compose up --build