#!/usr/bin/env groovy

import com.exmaple.Docker
def call(String imageName){
      script.withCredentials([script.usernamePassword(credentialsId: 'docker-hub-repo', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
      script.sh "echo '${script.PASS}' | docker login -u ${script.USER} --password-stdin"
    }
     return new Docker(this).dockerPush(imageName)
}
