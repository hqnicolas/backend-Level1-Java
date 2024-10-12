FROM openjdk:23-jdk-oracle
EXPOSE 8080
WORKDIR /app
COPY . /app
COPY application.yml /app/src/main/resources/
RUN chmod 755 /app/src/main/resources/application.yml
RUN chmod +x ./mvnw
CMD ["./mvnw", "spring-boot:run"]
