# CA2(Part 1) - Build Tools with Gradle
## Table of Contents

1. [CA2(Part 1) - Technical Report: Analysis and Implementation](#technical-report)
    - [Gradle Basic Demo Application](#gradle-basic-demo-application---analysis)
    - [Add New Task to Execute the Server](#add-new-task-to-execute-the-server)
    - [Add Simple Unit Test and Update Dependencies](#part-2B)
    - [Add New Task of Type Copy (backup sources)](#part-2A)
    - [Add New Task of Type Zip (backup sources)](#part-2A)
    - [Conclusion](#part-2A)


## Technical Report

### Gradle Basic Demo Application
#### Analysis
Work in Progress



### Add New Task to Execute the Server
#### Analysis and Implementation

1. **Analysis:**
    - A new task `runServer` was created to execute the server.
    - The task was added to the `build.gradle` script configuration file.
    - The task was given the group `DevOps` and the description `Launches a chat server on localhost:59001`.
    - A command-line argument was also added to specify the port number `59001` to match the one in the `runClient` task.
    - The task was tested by running the command  `/gradlew runServer`.

 
2. **Implementation:**
```gradle
task runServer(type:JavaExec, dependsOn: classes) {
    group = "DevOps"
    description = "Launches a chat server on localhost:59001 "
    classpath = sourceSets.main.runtimeClasspath
    mainClass = 'basic_demo.ChatServerApp'
    args '59001'
}
```
![Run Server Task](readme-images/run-server.png)

### Add Simple Unit Test and Update Dependencies
#### Analysis and Implementation

1. **Analysis:**
   - A new test class `src/test/java/basic_demo/AppTest.java` was created to implement the provided test code.
   - The provided test code was implemented in the previous test class.
   - The necessary dependency was added to the `build.gradle` script configuration file.
   - This step was tested by running the command `/gradlew build` and `/gradlew test`.


2. **Implementation:**
```gradle
dependencies {
    // Use JUnit test framework
    testImplementation group: 'junit', name: 'junit', version: '4.12'
}
```
![Run Test](readme-images/test.png)

### Add New Task of Type Copy (backup sources)
#### Analysis and Implementation

1. **Analysis:**
   - A new task `backupSource` was created to copy the source files to a backup directory.
   - The task was added to the `build.gradle` script configuration file.
   - The task was given the group `DevOps` and the description `Copies the source files to a backup directory`.
   - The task was tested by running the command  `/gradlew backupSource`.


2. **Implementation:**
```gradle
task backupSource(type: Copy) {
    group = "DevOps"
    description = "Copies the source files to a backup directory"

    from 'src'
    into 'backup'
}
```
![Backup Task](readme-images/backup.png)

### Add New Task of Type Zip (backup sources)
#### Analysis and Implementation

1. **Analysis:**
   - A new task `backupZip` was created to copy and compress the source files to a backup directory.
   - The task was added to the `build.gradle` script configuration file.
   - The task was given the group `DevOps` and the description `Copies and compresses the source files to a backup directory`.
   - The task was tested by running the command  `/gradlew backupZip`.


2. **Implementation:**
```gradle
task backupZip(type: Zip) {
    group = "DevOps"
    description = "Copies and compresses the source files to a backup directory"

    from 'src'
    archiveFileName = "sources.zip"
    destinationDirectory = file("backup_zip")
}
```
![Backup Zip Task](readme-images/backup-zip.png)

### Conclusion
Work in Progress
