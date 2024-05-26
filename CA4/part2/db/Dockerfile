FROM openjdk:17-slim AS base

FROM base AS build
WORKDIR /app
RUN apt-get update && apt-get install -y wget
RUN wget https://repo1.maven.org/maven2/com/h2database/h2/2.2.224/h2-2.2.224.jar

FROM base AS final
EXPOSE 8082
EXPOSE 9092
COPY --from=build /app/h2-2.2.224.jar h2-2.2.224.jar

ENTRYPOINT java -cp h2-2.2.224.jar org.h2.tools.Server -web -webAllowOthers -tcp -tcpAllowOthers -ifNotExists