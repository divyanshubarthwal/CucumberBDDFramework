package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
 @Before("@RegTest1")
 public void beforevalidation(){
	 System.out.println("Hooks Before execution");
 }
 
 @After("@RegTest1")
 public void aftervalidation(){
	 System.out.println("Hooks after execution");
 }
 
}
