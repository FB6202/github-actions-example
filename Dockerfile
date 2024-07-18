FROM eclipse-temurin:17
EXPOSE 8080
ADD target/github-actions-example.jar github-actions-example.jar
ENTRYPOINT ["java", ".jar", "/github-actions-example.jar"]