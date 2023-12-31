# Help Desk
 🅰 Angular + 🍃 Spring Boot  - HELP DESK APP

## Prints
<img src="https://github.com/petscaramussi/helpDesk/blob/main/prints/1.jpeg" width="48%"> <img src="https://github.com/petscaramussi/helpDesk/blob/main/prints/2.jpeg" width="48%">

<img src="https://github.com/petscaramussi/helpDesk/blob/main/prints/3.jpeg" width="32%"> <img src="https://github.com/petscaramussi/helpDesk/blob/main/prints/4.jpeg" width="32%"> <img src="https://github.com/petscaramussi/helpDesk/blob/main/prints/5.jpeg" width="32%">

<img src="https://github.com/petscaramussi/helpDesk/blob/main/prints/6.jpeg" width="32%"> <img src="https://github.com/petscaramussi/helpDesk/blob/main/prints/7.jpeg" width="32%">  <img src="https://github.com/petscaramussi/helpDesk/blob/main/prints/8.jpeg" width="32%">


## Build

### Angular

1. Go to project folder 'client' then 'angular-frontend' and install dependencies:
 ```bash
 npm install
 ```
 
2. Launch development server, and open `localhost:4200` in your browser:
 ```bash
 npm start
 ```
 
 ### Spring
 
 1. You don’t need to build from source to use Spring Data (binaries in repo.spring.io), but if you want to try out the latest and greatest, Spring Data can be easily built with the maven wrapper. You also need JDK 17 or above.
  ```bash
    ./mvnw clean install
 ```
 
 2. run the following command in a terminal window (in the complete) directory: src/main/java/net/javaguides/springbootbackend/Application.java
 ```bash
   ./mvnw spring-boot:run
 ```
 
 3. Gradle and Maven

The code samples in the book use Apache Maven as the build tool. If you prefer Gradle over Maven, here's a table mapping Maven commands to Gradle:

| Maven                            | Gradle                     |
| -------------------------------- | -------------------------- |
| `./mvnw clean`                   | `./gradlew clean`          |
| `./mvnw install`                 | `./gradlew build`          |
| `./mvnw test`                    | `./gradlew test`           |
| `./mvnw repackage`               | `./gradlew bootJar`        |
| `./mvnw spring-boot:run`         | `./gradlew bootRun`        |
| `./mvnw spring-boot:build-image` | `./gradlew bootBuildImage` |

