FROM adoptopenjdk/openjdk11:alpine-slim
COPY build/libs/*.jar application.jar
CMD ["java", "-jar", "/application.jar", "-Xms256m", "-Xmx256m"]