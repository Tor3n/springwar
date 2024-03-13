### Relevant Articles:

- [Generate a WAR File in Maven](https://www.baeldung.com/maven-generate-war-file)

This has to be uncommented to deploy tom to server.

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-tomcat</artifactId>
            <version>2.6.4</version>
            <!--UNCOMMENT PROVIDED TO BE ABLE TO DEPLOY WAR TO TOM IN SRV-->
            <scope>provided</scope>
        </dependency>


To build -> mvn clean -> mvn compile -> mvn war

java versions have to be the same on srv and dev
19.0.2+7-Ubuntu-0ubuntu322.04
Apache Tomcat/9.0.58 (Ubuntu)