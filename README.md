# gradleBasics
This repo is for notes and practice of the Gradle fundamentals course from Plurasight. 

## What is Gradle?
* Convention based build tool 
* DSL(Domain Specific Language) to describe the build
* Supports multi-project builds
* Easily customizable
* Builds many languages
* Supports dependencies

## How is gradle used?

1. Create a build script
   - Kotlin or Groovy DSL
3. This defines tasks
   - Build, clean, etc..
5. Run the appropriate task
   - From the command line or an IDE

## Gradle mostly consists of 
- Projects
- Tasks

* build has one or more projects
* Project has one or more tasks
* Plugins extend project

### What is in a project
* There will be a build file
  * `build.gradle`
  * `build.gradle.kts`
* Optional settings file

### What is in the build file?
* Build file defines the tasks
  * Either pre-defined
  * Or directly
  * Or indirectly through plugin

## Build Phases

1. Initialization
2. Configuration
3. Execution

A given task will have multiple phases of execution
1. doFirst
2. doLast

## Task Dependencies

Ex:

Task A depends on Task B and Task C
Task C depends on Task E


