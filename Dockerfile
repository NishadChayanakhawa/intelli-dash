ARG JAVA_VERSION=17
FROM openjdk:${JAVA_VERSION}
COPY intelli-dash-webapp/target/*.jar intelli-dash-webapp.jar
EXPOSE 8999
CMD ["java","-jar","/intelli-dash-webapp.jar"]
