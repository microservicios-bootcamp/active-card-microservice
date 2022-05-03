FROM openjdk:11
EXPOSE 8032
ADD target/microservicio-active-card.jar microservicio-active-card.jar
ENTRYPOINT ["java","-jar","/microservicio-active-card.jar"]