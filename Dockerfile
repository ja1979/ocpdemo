FROM registry.access.redhat.com/ubi8/openjdk-8

ADD ./target/ocpdemo-0.0.1-SNAPSHOT.jar /app.jar

EXPOSE 8080

CMD ["java", "-jar", "/app.jar"]
