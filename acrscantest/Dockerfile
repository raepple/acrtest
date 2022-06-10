FROM openjdk:11-jre-slim

ENTRYPOINT ["java", "-jar", "/usr/share/helloworld/helloworld.jar"]

# Add Maven dependencies (not shaded into the artifact; Docker-cached)
ADD target/libs /usr/share/helloworld/libs

ARG JAR_FILE
ADD target/${JAR_FILE} /usr/share/helloworld/helloworld.jar