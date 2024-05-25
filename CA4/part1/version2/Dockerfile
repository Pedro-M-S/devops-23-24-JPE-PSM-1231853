FROM openjdk:21-slim AS base

FROM base AS final
WORKDIR /app
COPY CA2/part1/gradle_basic_demo/build/libs/basic_demo-0.1.0.jar basic_demo-0.1.0.jar
EXPOSE 59001

ENTRYPOINT java -cp basic_demo-0.1.0.jar basic_demo.ChatServerApp 59001