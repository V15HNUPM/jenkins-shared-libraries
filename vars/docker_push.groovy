def call(String Project,String ImageTag,String dockerhubuser) {    
    withCredentials([usernamePassword(
        credentialsId: 'dockerhub',
        usernameVariable: 'dockerhubUser',
        passwordVariable: 'dockerhubPass'
    )]) {
        sh "docker login -u ${dockerhubUser} -p  ${dockerhubPass}"
    }
        sh "docker push ${dockerhubuser}/${Project}:${ImageTag}
           
}
