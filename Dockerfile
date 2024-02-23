# Start with a base image containing Java runtime
FROM openjdk:8

# Make port 8080 available to the world outside this container
EXPOSE 8080

ADD target/dks-spring-boot-github-actions.jar dks-spring-boot-github-actions.jar

# Run the jar file 
ENTRYPOINT ["java","-jar","dks-spring-boot-github-actions.jar"]