#!/usr/bin/env groovy

import com.exmaple.Docker
def call(String imageName){
     return new Docker(this).dockerPush(imageName)
}
