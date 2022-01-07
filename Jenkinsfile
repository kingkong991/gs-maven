node {
  stage('SCM') {
    checkout scm
  }
  stage('SonarQube Analysis') {
    def mvn = tool 'Maven1';
    withSonarQubeEnv() {
      sh "${mvn}/bin/mvn clean verify sonar:sonar 
      {-Dsonar.projectKey=testbuild 
       -Dsonar.host.url=http://http://192.168.64.46:9001/
       }"
    }
  }
}
stage("Quality Gate") {
  timeout(time: 1, unit: 'HOURS') { 
    def qg = waitForQualityGate() 
    if (qg.status != 'OK') {
      error "Pipeline aborted due to quality gate failure: ${qg.status}"
    }
  }
}
