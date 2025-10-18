def call(){
    sh "python -m pip install --upgrade pip"
    sh "pip install -r requirements.txt"
}