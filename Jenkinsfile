node {
    docker.image("gradle:latest").inside() {
        
        stage('Checkout') {
            git 'https://github.com/platymatt/RestaurantWeb.git'
        }
        
        stage('Build') {
            sh 'gradle clean build'
        }
        
        stage('Code Quality') {
            sh 'gradle sonarqube -Dsonar.projectName=SimplePipelineRestaurantWeb -Dsonar.projectKey=SimplePipelineRestaurantWeb -Dsonar.host.url=http://192.168.70.149:9090 -Dsonar.login=a6bc974ce6c0f6465f3a86c4dec35404a5421d61'
        }
    }
}