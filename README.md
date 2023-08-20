# docker-Jenkins-Integration ON LOCAL MACHINE WINDOWS
This is simple project about GIT+Docker+Jenkins Integration

COMMANDS :::::::::::

To identify which process using port 8080 ::: sudo lsof-i:8080

JENKINS COMMAND USED :::
java -jar jenkins.war --httpPort=define port no ( else used default port 8080)

GIT COMMANDS USED :::
git init 
git add .
git commit -m "any commit message"
git remote add origin (git repositoryname)[ i.e end with .git]
git push origin master

TO RUN DOCKER IMAGES INSTALL PLUGIN :::

docker pipeline
docker plugin
docker build step
cloudbees dockerbuild & publish plugin
