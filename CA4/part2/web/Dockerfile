FROM gradle:8.7-jdk17 AS builder
FROM tomcat:10-jdk17 AS runner

FROM builder AS build
WORKDIR /app
COPY CA3/part2/react-and-spring-data-rest-basic/build.gradle /app/
COPY CA3/part2/react-and-spring-data-rest-basic/settings.gradle /app/
COPY CA3/part2/react-and-spring-data-rest-basic/package.json /app/
COPY CA3/part2/react-and-spring-data-rest-basic/webpack.config.js /app/
COPY CA3/part2/react-and-spring-data-rest-basic/src /app/src/
RUN gradle build --no-daemon

FROM runner AS final
EXPOSE 8080
WORKDIR /app
COPY --from=build /app/build/libs/react-and-spring-data-rest-basic-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/


