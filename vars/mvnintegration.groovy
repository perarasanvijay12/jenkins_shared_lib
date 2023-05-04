def call(){
    
    sh 'maven verify -DskipUnitTests'
}