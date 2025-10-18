# DevOps Learning Projects - Jenkins CI/CD

This repository contains a collection of projects demonstrating Continuous Integration and Continuous Deployment (CI/CD) workflows using Jenkins. Each project showcases different aspects of automated testing, building, and deployment pipelines with both Jenkinsfile and Groovy script implementations.

## Projects Structure

```
├── Groovy/                    # Groovy pipeline scripts
│   ├── Basic_Flask/
│   ├── CI_CD_Pipeline/
│   ├── Django_Notes/
│   ├── Github_Action/
│   ├── Node_Express/
│   └── Simple_Java/
├── Jenkins/                   # Jenkinsfile configurations
│   ├── Basic_Flask/
│   ├── CI_CD_Pipeline/
│   ├── Django_Notes/
│   ├── Github_Action/
│   ├── Node_Express/
│   └── Simple_Java/
├── BasicFlaskApplication/     # Flask web application
├── CI-CD-Pipeline-tutorial/   # React Vite project
├── django-notes-app/          # Django notes application
├── Github-Actions-Project/    # Java Maven project
├── node-express-mongodb/      # Node.js Express with MongoDB
└── simple-java-docker/        # Java application with Docker
```

## Projects List

| Project Name | Description | Jenkins Files | Groovy Scripts |
|-------------|-------------|---------------|----------------|
| **BasicFlaskApplication** | A simple Flask web application | `Jenkins/Basic_Flask/Jenkins` | `Groovy/Basic_Flask/` |
| **django-notes-app** | Django-based notes application | `Jenkins/Django_Notes/Jenkins` | `Groovy/Django_Notes/` |
| **simple-java-docker** | Java application with Docker configuration | `Jenkins/Simple_Java/Jenkins` | `Groovy/Simple_Java/` |
| **CI-CD-Pipeline-tutorial** | React Vite project with CI/CD pipeline | `Jenkins/CI_CD_Pipeline/Jenkins` | `Groovy/CI_CD_Pipeline/` |
| **Github-Actions-Project** | Simple Java project with Maven | `Jenkins/Github_Action/Jenkins` | `Groovy/Github_Action/` |
| **node-express-mongodb** | Node.js Express application with MongoDB | `Jenkins/Node_Express/Jenkins` | `Groovy/Node_Express/` |

## Purpose

This repository serves as a demonstration of my learning progress in DevOps CI/CD practices using Jenkins, including:

- **Jenkins Pipelines**: Declarative and scripted pipeline configurations
- **Groovy Scripts**: Reusable build, test, and deployment scripts
- **Continuous Integration**: Automated testing and building of applications
- **Continuous Deployment**: Automated deployment to various environments
- **Multi-language Support**: CI/CD for Python, Java, JavaScript, and React applications
- **Container Integration**: Docker builds and container registry management
- **Pipeline Orchestration**: Complex workflow dependencies and stages

## Technologies Demonstrated

- **Jenkins** - CI/CD pipeline automation
- **Groovy** - Pipeline scripting and automation
- **Docker** - Containerization and image building
- **Python/Flask/Django** - Python web applications
- **Java** - Maven and Gradle builds
- **Node.js** - JavaScript backend applications
- **React/Vite** - Modern frontend development

## Pipeline Components

### Groovy Scripts Structure
Each project contains modular Groovy scripts for different pipeline stages:
- `build.groovy` - Application build and testing
- `docker_build.groovy` - Docker image building
- `docker_push.groovy` - Container registry operations

### Jenkinsfile Structure
Each Jenkinsfile demonstrates:
- Multi-stage pipeline definitions
- Environment-specific configurations
- Parallel execution where applicable
- Post-build actions and notifications

## Usage

### For Jenkins Pipelines:
1. Navigate to the specific project's Jenkinsfile in the `Jenkins/` directory
2. Use in Jenkins by pointing to the Jenkinsfile path or copy the content
3. Configure necessary credentials and environment variables in Jenkins

### For Groovy Scripts:
1. Use the modular Groovy scripts from the `Groovy/` directory
2. Load scripts in Jenkins using `load` command or use in scripted pipelines
3. Customize parameters as needed for your environment

## Key Features Demonstrated

- **Multi-branch Pipeline** support
- **Docker Agent** usage in pipelines
- **Parallel Test Execution**
- **Artifact Management**
- **Environment Deployment** (Dev/Staging/Production)
- **Notification Systems**
- **Build Status Reporting**

## Getting Started

1. **Setup Jenkins**: Ensure Jenkins is installed with necessary plugins (Docker, Git, Pipeline, etc.)
2. **Configure Credentials**: Set up Docker Hub, GitHub, and other service credentials in Jenkins
3. **Create Pipeline**: Use the provided Jenkinsfiles or Groovy scripts to create new pipeline jobs
4. **Customize**: Modify environment variables and parameters according to your setup

Refer to individual project directories and pipeline files for specific implementation details and configuration requirements.

---

*Note: This repository focuses on Jenkins CI/CD implementations. Each project includes both declarative Jenkinsfile and modular Groovy script approaches for flexibility in different Jenkins environments.*
