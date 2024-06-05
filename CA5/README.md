# CA5 - CI/CD Pipelines with Jenkins

## Table of Contents

1. [CA5 - Technical Report: Analysis and Implementation](#technical-report)
    - [Jenkins](#jenkins)
    - [Jenkins Initial Configurations](#jenkins-initial-configurations)
    - [Gradle Basic Demo - Pipeline](#gradle-basic-demo---pipeline)
    - [Gradle React and Spring Data Rest Basic - Pipeline](#gradle-react-and-spring-data-rest-basic---pipeline)
    - [Conclusion](#conclusion)

## Technical Report

### Jenkins

Jenkins is an open-source automation server widely used for continuous integration (CI) and continuous delivery (CD).
It supports building, deploying, and automating software development projects, allowing teams to integrate changes more
frequently and deliver products faster and more reliably.

Jenkins provides a web-based user interface that allows users to configure and manage the automation server, create and
manage jobs, and view build logs and reports. It also supports a wide range of plugins that extend its functionality and
integrate with other tools and services.

- **Installation:**
    - Jenkins can be installed on various operating systems, including Windows, macOS, and Linux.
    - The installation process involves downloading the Jenkins WAR file and running it using Java.
    - Jenkins can also be installed using Docker, which simplifies the installation process and provides a more
      consistent environment.

- **Configuration:**
    - Jenkins can be configured using the web-based user interface, which allows users to set up global configurations,
      manage users and permissions, and install plugins.

- **Jobs:**
    - Jenkins jobs are used to define the steps that Jenkins will execute to build, test, and deploy software projects.
    - Jobs can be configured to run on specific triggers, such as code commits, time-based schedules, or manual
      execution.

- **Pipelines:**
    - Jenkins pipelines are used to define the entire build process as code, allowing users to version control and
      automate the build, test, and deployment steps. Pipelines are defined using a Jenkinsfile, which can be stored
      in the project repository or loaded from an external source.

- **Jenkinsfile:**
    - A Jenkinsfile is a text file that defines the entire build process as code. It includes the stages, steps, and
      configurations necessary to build, test, and deploy the project.
    - Jenkinsfiles can be written in declarative or scripted syntax, depending on the complexity and requirements of
      the build process.

### Jenkins Initial Configurations

Jenkins can be installed and run using Docker. The following command can be used to run Jenkins in a Docker container:

```bash
docker run -d -p 8080:8080 -p 50000:50000 -v jenkins-data:/var/jenkins_home --name=jenkins jenkins/jenkins:lts-jdk17
```

![Docker Jenkins Image](readme-images/docker-image.png)
![Docker Jenkins Container](readme-images/docker-container.png)

After running the Jenkins container, the Jenkins web interface can be accessed at `http://localhost:8080`. The initial
setup involves retrieving the initial admin password from the container logs and installing the necessary plugins.
After the setup is complete, Jenkins is ready to create and manage jobs and pipelines.

![Docker Jenkins Image](readme-images/login.png)

You can also configure the necessary credentials to allow Jenkins to access external services and repositories.
In most cases, Jenkins will need credentials to access source code repositories, build artifacts, and deployment
environments. You can create tokens, SSH keys, or passwords to authenticate Jenkins with these services.

![Docker Jenkins Image](readme-images/credentials.png)

### Gradle Basic Demo - Pipeline

### Analysis and Implementation

### Analysis

Create a Jenkins pipeline to automate the build, test, and deployment processes for the Gradle-Basic-Demo project.

**Pipeline Overview:**

- **Stages:**
    - **Checkout:** Retrieve the source code from a Git repository.
    - **Assemble:** Compile and package the application.
    - **Test:** Execute unit tests to ensure code quality.
    - **Archive:** Save build artifacts for further use or deployment.

**Components:**

- **Jenkinsfile:** A script that defines the Jenkins pipeline as code. This file will include all the stages and steps
  necessary for the pipeline execution.
- **Git Repository:** The source control repository where the project's source code is maintained.
- **Gradle:** The build tool used for compiling, testing, and packaging the application.

**Pipeline Stages:**

- **Checkout:**
    - Retrieve the source code from the specified Git repository.
    - Ensure the correct branch is checked out.
- **Assemble:**
    - Run Gradle tasks to clean and assemble the project.
    - Ensure all dependencies are resolved and the project is compiled.
- **Test:**
    - Execute unit tests using Gradle.
    - Publish test results to Jenkins for visibility.
- **Archive:**
    - Save the build artifacts (e.g., JAR/WAR files) to be available for future steps like deployment.

2. **Implementation:**

```groovy
pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                echo 'Checking out...'
                git branch: 'main', credentialsId: 'jenkins', url: 'https://github.com/Pedro-M-S/devops-23-24-JPE-PSM-1231853.git'
            }
        }
        stage('Assemble') {
            steps {
                dir('CA2/part1/gradle_basic_demo') {
                    echo 'Assembling...'
                    sh 'chmod +x gradlew'
                    sh './gradlew clean assemble'
                }
            }
        }
        stage('Test') {
            steps {
                dir('CA2/part1/gradle_basic_demo') {
                    echo 'Testing...'
                    sh './gradlew test'
                    junit 'build/test-results/test/*.xml'
                }
            }
        }
        stage('Archive') {
            steps {
                dir('CA2/part1/gradle_basic_demo') {
                    echo 'Archiving...'
                    archiveArtifacts 'build/distributions/*'
                }
            }
        }
    }
}
```

![Gradle Basic Demo Dashboard 1](readme-images/dashboard-demo-1.png)
![Gradle Basic Demo Dashboard 2](readme-images/dashboard-demo-2.png)
![Gradle Basic Demo Dashboard 3](readme-images/dashboard-demo-3.png)
![Gradle Basic Demo Dashboard 4](readme-images/dashboard-demo-4.png)
![Gradle Basic Demo Dashboard 5](readme-images/dashboard-demo-5.png)

### Gradle React and Spring Data Rest Basic - Pipeline

### Analysis and Implementation

### Analysis

### Conclusion


