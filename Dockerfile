FROM openjdk:8-jre-alpine
MAINTAINER Neven Cvetkovic <nevenc@pivotal.io>
ARG JAR_FILE
ADD ./target/${JAR_FILE} /customer-service.jar
RUN sh -c 'touch /customer-service.jar'
ENTRYPOINT ["/usr/bin/java", "-jar", "/customer-service.jar"]
