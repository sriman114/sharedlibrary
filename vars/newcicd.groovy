def git1(path)
{
    git "https://github.com/intelliqittrainings/${path}.git"
}

def pkg()
{
    sh "mvn package"
}
