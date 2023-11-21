FROM eclipse-temurin:17
COPY target/devjenkins.jar devjenkins.jar
CMD [ "java","-jar","devjenkins.jar" ]