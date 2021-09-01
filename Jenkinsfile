pipeline{
    agent any
    stages{
        stage("Build") {
            steps {
                 echo 'testing the application...'
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
