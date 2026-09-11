# Official OpenJDK 21 image
FROM eclipse-temurin:21-jdk

WORKDIR /app

# Copy source and compile inside the image
COPY src/main/java ./src
RUN javac -d out $(find src -name "*.java")

# Run the CLI
ENTRYPOINT ["java", "-cp", "out", "cli.App"]
