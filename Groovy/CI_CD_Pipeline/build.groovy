def call(){
    sh "npm install"
    sh "npm run build"
    sh "npm run test"
}