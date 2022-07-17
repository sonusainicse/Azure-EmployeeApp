FROM openjdk:8
ADD target/Azure_Employee_app-0.0.1-SNAPSHOT.jar myapp.jar
ENTRYPOINT ["java","-jar","/myapp.jar"]