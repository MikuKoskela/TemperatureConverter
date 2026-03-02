# Use official Maven with Java 17
FROM maven:3.9.3-eclipse-temurin-17

WORKDIR /app

# Copy pom.xml first (for caching dependencies)
COPY pom.xml .

# Download dependencies
RUN mvn dependency:go-offline

# Copy all source code and tests
COPY src ./src

# Run tests when container starts
CMD ["mvn", "test"]