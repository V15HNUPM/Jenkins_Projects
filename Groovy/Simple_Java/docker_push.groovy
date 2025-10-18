def call(String project, String imageTag, String dockerhubuser) {    
    withCredentials([usernamePassword(
        credentialsId: 'dockerhub',
        usernameVariable: 'DOCKERHUB_USER',
        passwordVariable: 'DOCKERHUB_PASS'
    )]) {
        sh "docker login -u ${DOCKERHUB_USER} -p ${DOCKERHUB_PASS}"
    }
    sh "docker push ${dockerhubuser}/${project}:${imageTag}"
}