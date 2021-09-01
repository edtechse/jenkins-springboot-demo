def gv

pipeline{
    agent any
    tools {
        maven 'Maven'
    }
    parameters {
        choice(name: 'VERSION', choices: ['1.1.0', '1.2.0', '1.3.0'], description: '')
        booleanParam(name: 'executeTests', defaultValue: true, description: '')
    }

    environment {
        NEW_VERSION = '1.0.0'
        SERVER_CREDENTIALS = credentials ('mygithub-creds')
    }
    stages{
         stage("init") {
            steps {
                script {
                   gv = load "script.groovy" 
                }
            }
        }
        stage("Build") {
            steps {
                 script {
                    gv.buildApp()
                }

            }
        }
        stage("Test") {
            when {
                expression {
                    params.executeTests
                }
            }
            steps {
                script {
                    gv.testApp()
                }
            }
        }
        stage("Deploy") {
            script {
                    gv.deployApp()
                }
        }
    }

    post{
        always{
            cleanWs()
        }
    }
}
