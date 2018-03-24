FROM openjdk:8-jdk-alpine
MAINTAINER Alexander Sparkowsky <info@roamingthings.de>

ENV JAVA_OPTS=""
ENV SPRING_PROFILE="default"
ENV PG_PASSWORD=""

VOLUME /tmp
ARG JAR_FILE
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dspring.datasource.password=${PG_PASSWORD}","-Dspring.profiles.active=${SPRING_PROFILE}","-jar","/app.jar"]
