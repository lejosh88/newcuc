package hellocucumber;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class AirAsia {
	 WebDriver driver;
	 @BeforeTest
	  public void beforeTest() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\mindtree443\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 
		 driver = new ChromeDriver();
		  
	      WebDriverWait wait = new WebDriverWait(driver, 1000);
	      driver.manage().window().maximize();
	      driver.get("https://www.airasia.com/en/home.page?cid=1");
	      System.out.println(driver.getCurrentUrl());
	      Assert.assertEquals(driver.getCurrentUrl(),"https://www.airasia.com/en/gb?cid=1");
	  }

  @Test
  public void verifyTitle() throws InterruptedException {
	  System.out.println(driver.getTitle());
	 // Assert.assertEquals(driver.getTitle(),"Book Flights, Hotels, Deals & Activities Online | AirAsia");
     
  }
  @Test
  public void search() throws InterruptedException{
	  Thread.sleep(5000);
	  driver.findElement(By.id("product-tile-flight")).click();
	  driver.findElement(By.id("home-origin-autocomplete-heatmap")).clear();
	  driver.findElement(By.id("home-origin-autocomplete-heatmap")).sendKeys("Bengaluru");
	  driver.findElement(By.cssSelector("#home-origin-autocomplete-heatmaplist-0 > span:nth-child(2)")).click();
	  driver.findElement(By.id("home-destination-autocomplete-heatmap")).sendKeys("Pune");
	  
	  driver.findElement(By.cssSelector("#home-destination-autocomplete-heatmaplist-0 > span:nth-child(2)")).click();
	 
	  driver.findElement(By.cssSelector(" div.radiobuttons:nth-child(2) > label:nth-child(2)")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.id("home-depart-date-heatmap")).clear();
	  driver.findElement(By.id("home-depart-date-heatmap")).sendKeys("31-12-2019");
	  //driver.findElement(By.xpath("//*[@id=home-depart-date-heatmap]")).sendKeys("20-12-2019");
	  driver.findElement(By.id("home-flight-search-airasia-button-inner-button-select-flight-heatmap")).click();
	 }
  /*
  @Test
  public void login() throws InterruptedException
  {       Thread.sleep(5000);
	    driver.findElement(By.id("loginModal")).click();
	    driver.findElement(By.id("sso-login-email-input")).click();
	    driver.findElement(By.id("sso-login-email-input")).sendKeys("a@gmail.com");
	    driver.findElement(By.id("sso-login-password-input")).click();
	    driver.findElement(By.id("sso-login-password-input")).sendKeys("India1234");
	    driver.findElement(By.cssSelector(".sso-button:nth-child(4)")).click();
	    Thread.sleep(5000);
	    WebElement msg=driver.findElement(By.cssSelector(".sso-error-message > div:nth-child(2)"));
	    String text = msg.getText();
	    System.out.println(text);
	    Assert.assertEquals(text,"Your log in attempts has been unsuccessful. As a security measure, we’ve locked your account and you’re required to reset your password.");
  }
  */
  @AfterTest
  public void afterTest() {
  }

}
