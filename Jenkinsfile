#!/usr/bin/env groovy

def gcProject = 'macro-thinker-867'
def gcrCredentials = "gcr:${gcProject}"

node {

    try {
        wrap([$class: 'AnsiColorBuildWrapper']) {
            stage 'Prepare Build'

        		checkout scm

            stage 'Package'

                def jdk = tool 'Java 1.8'
                def mvnHome = tool 'Maven 3.0.5'

                withEnv([
                   "PATH+MVN=${mvnHome}/bin",
                   "PATH+JDK=${jdk}/bin",
                   "JAVA_HOME=${jdk}",
                   "MAVEN_HOME=${mvnHome}"
                   ]) {

                       sh "${mvnHome}/bin/mvn clean"
                       sh "${mvnHome}/bin/mvn package"
                }


            stage 'Run Automation'

                withEnv([
                   "PATH+MVN=${mvnHome}/bin",
                   "PATH+JDK=${jdk}/bin",
                   "JAVA_HOME=${jdk}",
                   "MAVEN_HOME=${mvnHome}"
                   ]) {

                       sh "${mvnHome}/bin/mvn test"
                }


            stage 'Notify Build Status'

                slackSend color: 'good', message: "Automation ${env.BRANCH_NAME} - Build # ${env.BUILD_NUMBER} - Successful (<${env.BUILD_URL}|Open>)"
        }

    } catch (Exception e) {
        slackSend color: 'danger', message: "Automation ${env.BRANCH_NAME} - Build # ${env.BUILD_NUMBER} - FAILURE! (<${env.BUILD_URL}|Open>)"
        throw e
    }

}
