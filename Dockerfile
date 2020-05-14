FROM gradle:jdk10 AS builder
COPY --chown=gradle:gradle . /app
WORKDIR /app
RUN gradle bootJar
FROM openjdk:8-jdk-alpine
EXPOSE 9001
VOLUME /tmp
ARG LIBS=app/build/libs
COPY --from=builder ${LIBS}/RestaurantList*.jar /app/lib/RestaurantList.jar
ENTRYPOINT ["java","-jar","./app/lib/RestaurantList.jar"]