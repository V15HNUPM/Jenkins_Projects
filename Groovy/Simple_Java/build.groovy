def call(){
    sh "javac src/Main.java -d bin"
    sh "java -cp bin Main"
}