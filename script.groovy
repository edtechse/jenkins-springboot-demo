def buildApp() {
    echo 'building the application...'
    sh "mvn clean install"
} 

def testApp() {
    echo 'testing the application...'
} 

def deployApp() {
    echo 'deplying the application...'
    echo "deploying version ${params.VERSION}"
    sh "mvn sprint-boot:run"
} 

return this
