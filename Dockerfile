FROM openjdk:11

WORKDIR /app

COPY . /app

RUN ./mvnw clean install

EXPOSE 8080

CMD ["java", "-jar", "target/demo.jar"]