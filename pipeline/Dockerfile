FROM adoptopenjdk/openjdk11:ubi
ADD /target/sample-api.jar sample-api.jar
ADD /src/main/resources/dg/dd-java-agent-0.80.0.jar dd-java-agent.jar
ENV JAVA_OPTS="-Dspring.profiles.active=env"
ENTRYPOINT java $JAVA_OPTS -Duser.timezone=America/Sao_Paulo -javaagent:dd-java-agent.jar -jar sample-api.jar
