#Compile
FROM gradle:jdk15 AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build -x test --no-daemon

#Run
FROM openjdk:latest
EXPOSE 8080 5005
RUN mkdir /app
COPY --from=build /home/gradle/src/build/libs/*.jar /app/application.jar
RUN echo Build succesful
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app/application.jar"]