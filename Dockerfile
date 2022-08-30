FROM openjdk:8-jdk-alpine
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-Dspring.profiles.active=prod", "-DFORUM_DATABASE_URL=jdbc:mysql://db:3306/forum", "-DFORUM_DATABASE_USERNAME=root", "-DFORUM_DATABASE_PASSWORD=15491549", "-DFORUM_JWT_SECRET=123456 forum.jar", "-jar", "/app.jar"]
