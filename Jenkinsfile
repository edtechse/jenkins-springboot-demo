pipeline{
    agent any
    tools {
        maven 'Maven'
    }
    environment {
        NEW_VERSION = '1.0.0'
        SERVER_CREDENTIALS = credentials ('mygithub-creds')
    }
    stages{
        stage("Build") {
            steps {
                 echo 'building the application...'
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
                echo "credentials ${SERVER_CREDENTIALS}"
                sh "mvn spring-boot:run"
            }
        }
    }

    post{
        always{
            cleanWs()
        }
    }
}
