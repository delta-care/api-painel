FROM openjdk:11.0.9.1-jre
ADD /target/api-painel-*.jar api-painel.jar
ENTRYPOINT ["java", "-jar", "api-painel.jar"]
