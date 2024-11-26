# Use openjdk 11 as base image
From openjdk:11

# Set working directory inside the container
WORKDIR /app

# Copy the jar file from the host to the container
COPY . /app

# Install Maven
RUN apt-get update && apt-get install -y maven

# Set the command to run tests automatically
CMD ["mvn", "clean", "test", "-Dsuite="]

