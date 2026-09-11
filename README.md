# Containerized Java CLI

Small command-line Java program for Advanced Java. It prints my name.

## What it does

Runs `cli.App`, which uses `NameGreeter` to print:

```
Hello, my name is ProCodingLegend.
```

Change the name in `src/main/java/cli/App.java` if you want a different display name.

## Requirements

- JDK 21+ (or IntelliJ IDEA / Eclipse with JDK 21)
- Docker Desktop (for the container steps)
- Optional: Maven 3.9+ to run unit tests from the command line

## Run in an IDE

1. Open this folder as a Maven project in **IntelliJ IDEA** or **Eclipse**.
2. Wait for Maven to import.
3. Run `cli.App`.
4. Run `cli.NameGreeterTest` (or `mvn test`) to execute the unit tests.

Expected program output:

```
Hello, my name is ProCodingLegend.
```

## Build and run with Docker

From the project root (the folder that contains this README and the Dockerfile):

```bash
docker build -t your-name-java-cli .
docker run --rm your-name-java-cli
```

Example:

```text
$ docker build -t your-name-java-cli .
[+] Building ...
$ docker run --rm your-name-java-cli
Hello, my name is ProCodingLegend.
```

That output should match what you see when you run `App` inside the IDE.

## Project layout

```
src/main/java/cli/App.java           # main method
src/main/java/cli/NameGreeter.java   # greeting logic
src/test/java/cli/NameGreeterTest.java
Dockerfile
pom.xml
```
