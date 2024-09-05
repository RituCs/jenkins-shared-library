#!/usr/bin/env groovy

import com.exmaple.Docker
def call(){
     return new Docker(this).dockerLogin()
}
