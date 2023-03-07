def call() {
    node {
      sh '''
       git version
       java -version
       echo "M2_HOME = ${M2_HOME}"
       ${M2_HOME}/bin/mvn --version
      '''
    }
}
