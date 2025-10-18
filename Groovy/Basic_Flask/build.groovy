def call(){
    sh "python -m pip install --upgrade pip"
    sh "pip install flake8 pytest"
    sh "if [ -f requirements.txt ]; then pip install -r requirements.txt; fi"
    sh "flake8 . --count --select=E9,F63,F7,F82 --show-source --statistics"
    sh "flake8 . --count --exit-zero --max-complexity=10 --max-line-length=127 --statistics"
}