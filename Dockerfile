FROM eclipse-temurin:21-jre
COPY target/unify-java-svc-1.0.0.jar /app/app.jar
USER 1000
CMD ["java", "-cp", "/app/app.jar", "com.igsl.unify.Greeter"]
