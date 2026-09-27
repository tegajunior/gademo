FROM bellsoft/liberica-openjdk-alpine:21.0.6
RUN addgroup -S appgroup && adduser -S appuser -G appgroup
RUN mkdir /app
COPY --chown=appuser:appgroup target/gademo-0.0.1-SNAPSHOT.jar /app/
USER appuser
ENTRYPOINT ["java", "-jar", "/app/gademo-0.0.1-SNAPSHOT.jar"]
EXPOSE 6767
