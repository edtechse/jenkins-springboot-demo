pipeline{
    agent any
    stages{
        stage("Build") {
            steps {
                 echo 'testing the application...'
                 sh "mvn -version"
                 sh "mvn clean install"
            }
        }
        stage("Test") {
            steps {
                echo 'testing the application...'
            }
        }
        stage("Deploy") {
            steps {
                echo 'deploying the application...'
            }
        }
    }

    post{
        always{
            cleanWs()
        }
    }
}
