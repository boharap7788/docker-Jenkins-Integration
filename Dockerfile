FROM openjdk

EXPOSE 8090

ADD /target/docker-jenkins-integeration.jar docker-jenkins-integeration.jar

ENTRYPOINT [ "java","-jar","/docker-jenkins-integeration.jar" ]