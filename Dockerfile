FROM openjdk:17-jdk-alpine3.14

COPY "./target/nye-progkorny.jar" "/application/nye-progkorny.jar"

CMD ["java", "-jar", "/application/nye-progkorny.jar"]
