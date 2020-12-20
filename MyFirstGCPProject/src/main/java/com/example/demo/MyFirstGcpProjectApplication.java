package com.example.demo;

/* step by step :-
 * use spring boot with profiles locally
 * then run the application as :- 
 * right-click -> run as -> run configurations -> and type the following -
 * mvn spring-boot:run -Dspring-boot.run.profiles=local
 * OR
 * mvn clean package appengine:deploy -P gcp
 * OR
 * then follow the steps in the below link :-
 * https://stackoverflow.com/questions/47908312/create-war-file-from-springboot-project-in-eclipse/47912809
 * then go to google cloud platform 
 * first create project then configure it as necessary
 * then follow the instruction :-
 * https://stackoverflow.com/questions/41179549/unable-to-deploy-java-project-on-google-app-engine
 * then follow the instruction :-
 * https://cloud.google.com/eclipse/docs/deploy-flex-jar
 * connect to cloud sql mysql using vm instance :-
 * https://medium.com/google-cloud/cloud-sql-private-ip-proxy-83e85456571f
 *  https://stackoverflow.com/questions/50549063/problems-installing-cloud-sql-proxy-on-windows-64-bit
 * */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
   
@SpringBootApplication
public class MyFirstGcpProjectApplication extends SpringBootServletInitializer{
 
	public static void main(String[] args) {
		SpringApplication.run(MyFirstGcpProjectApplication.class, args);
	}
}