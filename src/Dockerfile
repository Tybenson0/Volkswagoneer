# Use an official OpenJDK runtime as a parent image
FROM openjdk:11-jre-slim

# Set the working directory in the container
WORKDIR /src

# Copy the executable jar file from the target directory to the container
COPY target/demo-0.0.1-SNAPSHOT.jar /src/app.jar


# Expose the port the application runs on
EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java", "-jar", "app.jar"]
#idk anymore