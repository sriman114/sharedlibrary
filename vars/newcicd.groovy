def git1(path)
{
    git "https://github.com/intelliqittrainings/${path}.git"
}

def pkg()
{
    sh "mvn package"
}

def dply(jobname, ip, contextpath)
{
    sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${contextpath}.war"
}

def tst(jobname)
{
    sh "java -jar /var/lib/jenkins/workspace/${jobname}/testing.jar"
}
        

