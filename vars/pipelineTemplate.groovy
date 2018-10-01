
def call(Map pipelineParams) {

  pipeline {
    agent any
    stages {
      stage('Build') {
        steps {
          echo "Building application"
        }
      } 
      stage('Deploy') {
        steps {
          echo "Deploy application"
        }
      }
      stage('Test') {
        steps {
          echo "Testing application"
        }
      }
    }
  }

}
