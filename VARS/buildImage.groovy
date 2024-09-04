#!/usr/bin/env groovy

def call(){
    echo "Building the docker image..."
    withCredentials([usernamePassword(credentialsId: 'docker-hub-repo', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
    sh 'docker build -t ritucs/demo-project:V2.0 .'
    sh 'echo $PASS | docker login -u $USER --password-stdin'
    sh 'docker push ritucs/demo-project:V2.0'
    }
}