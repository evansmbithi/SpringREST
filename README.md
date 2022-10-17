# SpringREST

A service that will accept HTTP GET requests at http://localhost:8080/greeting.

It will respond with a JSON representation of a greeting, as the following listing shows:

<pre>{
    "id": 1,
    "content": "Hello, World!"
}</pre>

You can customize the greeting with an optional name parameter in the query string, as the following listing shows:

http://localhost:8080/greeting?name=User

The name parameter value overrides the default value of World and is reflected in the response, as the following listing shows:

<pre>{
    "id": 1,
    "content": "Hello, User!"
}</pre>

<br>

## Build and Run

You can run the application from the command line with Gradle or Maven. You can also build a single executable JAR file that contains all the necessary dependencies, classes, and resources and run that. Building an executable jar makes it easy to ship, version, and deploy the service as an application throughout the development lifecycle, across different environments, and so forth.

If you use Gradle, you can run the application by using ./gradlew bootRun. Alternatively, you can build the JAR file by using ./gradlew build and then run the JAR file, as follows:

> java -jar build/libs/gs-rest-service-0.1.0.jar

If you use Maven, you can run the application by using ./mvnw spring-boot:run. Alternatively, you can build the JAR file with ./mvnw clean package and then run the JAR file, as follows:

> java -jar target/gs-rest-service-0.1.0.jar