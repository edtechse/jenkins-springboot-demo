pipeline{
    agent any
    environment {
        NEW_VERSION = '1.0.0'
        SERVER_CREDENTIALS = credentials ('mygithub-creds')
    }
    stages{
        stage("Build") {
            steps {
                 echo 'building the application...'
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
            }
        }
    }

    post{
        always{
            cleanWs()
        }
    }
}
