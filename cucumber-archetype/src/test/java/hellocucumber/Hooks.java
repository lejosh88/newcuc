package hellocucumber;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import hellocucumber.Air;
import hellocucumber.AutomationPracticeOne;
import hellocucumber.Tour;
public class Hooks {
 @Before("@airasia")
    public void beforeFirst(){
        System.out.println("This will run only before the First Scenario");
        Air.launch();
    } 
 
 @Before("@Travel")
    public void beforeSecond(){
        System.out.println("This will run only before the Second Scenario");
        Tour.browserlaunch();
    } 
 
 @Before("@AutomationPractice")
    public void beforeThird(){
        System.out.println("This will run only before the Third Scenario");
        AutomationPracticeOne.browserlaunch();
    }
 
 @After("@airasia")
    public void afterFirst(){
        System.out.println("Execution Ends");      
    } 

 @After("@Travel")
    public void afterSecond(){
        
    } 
 @After("@AutomationPractice")
    public void afterThird(){
        
    } 
}

