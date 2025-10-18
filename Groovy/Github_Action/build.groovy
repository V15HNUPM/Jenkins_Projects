def call(){
    sh "mvn -B package --file Github-Actions-Project/pom.xml"
    sh " mvn com.github.ferstl:depgraph-maven-plugin:4.0.1:graph --file Github-Actions-Project/pom.xml"
}