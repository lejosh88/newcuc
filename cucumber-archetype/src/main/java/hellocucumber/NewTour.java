package hellocucumber;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import java.util.concurrent.TimeUnit; 
import org.openqa.selenium.By;
import  org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.support.ui.Select;
public class NewTour {
	public static WebDriver driver;
  @Test
  public void registeration() throws InterruptedException {
	  
	  driver.manage().window().maximize();
	    
	    //Implicit wait, wait for at least some time (10 sec) to identify an element, //if can't find the element with in 10  sec, throw exception 
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	 
	    //open the url or AUT 
	    driver.get("http://newtours.demoaut.com/");
	 
	    //Click on the register link: 
	    WebElement lnk_register = driver.findElement(By.linkText("REGISTER"));
	    lnk_register.click();
	 
	    //Enter details on the provided text boxes by using sendkeys method. 
	    WebElement txtBox_firstname = driver.findElement(By.name("firstName")); 
	    txtBox_firstname.sendKeys("John"); 
	    
	    //or directly we can identify element and act on that in one line 
	    driver.findElement(By.name("lastName")).sendKeys("Clark"); 
	    driver.findElement(By.name("phone")).sendKeys("2342342341"); 
	    driver.findElement(By.name("userName")).sendKeys("sunilpatro1985@gmail.com"); 
	 Thread.sleep(5000);
	    //Enter mailing information as above //Select the country, create a select object and then work on that object
	    Select s = new  Select(driver.findElement(By.name("country"))); 
	    s.selectByVisibleText("INDIA"); 
	 
	    //Enter user name and password 
	    driver.findElement(By.name("email")).sendKeys("Ask@ask.com"); 
	    driver.findElement(By.name("password")).sendKeys("12345"); 
	    driver.findElement(By.name("confirmPassword")).sendKeys("12345"); 
	    
	    //click on submit 
	    driver.findElement(By.xpath("//input[@name='register']")).click();
	 driver.close();
  }
  
  @Test
  public void registeration_Login() throws InterruptedException
  {
	  Thread.sleep(5000);
	  driver.findElement(By.linkText("Home")).click();
		 
	    //Enter the username and password and click on the submit button. 
	    driver.findElement(By.name("userName")).sendKeys("Ask@ask.com"); 
	    driver.findElement(By.name("password")).sendKeys("12345"); 
	    driver.findElement(By.xpath("//input[@name='login']")).click();
	 
	    //verify if login successful
	    WebElement form_findflight = driver.findElement(By.xpath("//form[@name='findflight']")); 
	  
	    if(form_findflight.isDisplayed()) 
	    { 
	       System.out.println("Login successful!");
	       } 
	    driver.close();
	    } 
 
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\mindtree443\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 
		 driver = new ChromeDriver();
		  
	      WebDriverWait wait = new WebDriverWait(driver, 1000);
	      driver.manage().window().maximize();
	      driver.get("http://newtours.demoaut.com/");
	      System.out.println(driver.getCurrentUrl());
	      Assert.assertEquals(driver.getCurrentUrl(),"http://newtours.demoaut.com/");
  }

  @AfterTest
  public void afterTest() {
	  
  }

}
