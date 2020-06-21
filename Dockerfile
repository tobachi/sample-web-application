FROM openjdk:11-alpine
COPY build/libs/*.jar application.jar
CMD ["java", "-jar", "/application.jar", "-Xms256m", "-Xmx256m"]