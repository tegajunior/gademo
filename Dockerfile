FROM bellsoft/liberica-openjdk-alpine:21.0.8
RUN apk upgrade --no-cache
RUN addgroup -S appgroup && adduser -S appuser -G appgroup
RUN mkdir /app
COPY --chown=appuser:appgroup target/gademo-0.0.1-SNAPSHOT.jar /app/
USER appuser
ENTRYPOINT ["java", "-jar", "/app/gademo-0.0.1-SNAPSHOT.jar"]
EXPOSE 6767
