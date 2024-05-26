FROM gradle:7.4.1-jdk17 AS builder
FROM openjdk:17-slim AS runner

FROM builder AS build
WORKDIR /app
COPY CA2/part1/gradle_basic_demo/build.gradle CA2/part1/gradle_basic_demo/settings.gradle /app/
COPY CA2/part1/gradle_basic_demo/src /app/src/
RUN gradle build --no-daemon

FROM runner AS final
EXPOSE 59001
WORKDIR /app
COPY --from=build /app/build/libs/basic_demo-0.1.0.jar basic_demo-0.1.0.jar

ENTRYPOINT java -cp basic_demo-0.1.0.jar basic_demo.ChatServerApp 59001
