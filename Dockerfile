FROM openjdk:11
EXPOSE 8889
ADD target/StaffService-0.0.1-SNAPSHOT.jar StaffService-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","StaffService-0.0.1-SNAPSHOT.jar"]