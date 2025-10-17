def call(String ProjectNameString ImageTag,String DockerHubUser){
  sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
}
