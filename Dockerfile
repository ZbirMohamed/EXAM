FROM openjdk:17-oracle

VOLUME /tmp

RUN ./mvnw clean -DskipTests

COPY target/*.jar app.jar

ENTRYPOINT ["java", "-jar","app.jar"]