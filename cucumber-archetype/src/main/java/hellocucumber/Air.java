package hellocucumber;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Air {
	public static WebDriver driver;
	public static void launch(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mindtree443\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
	      WebDriverWait wait = new WebDriverWait(driver, 1000);
	      driver.manage().window().maximize();	
	}
	    public static void navigatetoAirAsia(String url)  throws InterruptedException {   	
		      driver.get(url);
		      System.out.println(driver.getCurrentUrl());
		      Assert.assertEquals(driver.getCurrentUrl(),"https://www.airasia.com/en/gb?cid=1");
	    } 
	    public static void  verifyTitle() {
	    	System.out.println(driver.getTitle());
	    	// Assert.assertEquals(driver.getTitle(),"Book Flights, Hotels, Deals & Activities Online | AirAsia");
	    }
	    public static void search(String Source, String Destination, String Date) throws InterruptedException{
	    	Thread.sleep(5000);
	  	  driver.findElement(By.id("product-tile-flight")).click();
	  	  driver.findElement(By.id("home-origin-autocomplete-heatmap")).clear();
	  	  driver.findElement(By.id("home-origin-autocomplete-heatmap")).sendKeys(Source);
	  	  driver.findElement(By.cssSelector("#home-origin-autocomplete-heatmaplist-0 > span:nth-child(2)")).click();
	  	  Thread.sleep(5000);
	  	  driver.findElement(By.id("home-destination-autocomplete-heatmap")).sendKeys(Destination);
	  	  driver.findElement(By.cssSelector("#home-destination-autocomplete-heatmaplist-0 > span:nth-child(2)")).click();
	  	 Thread.sleep(5000);
	  	  driver.findElement(By.cssSelector(" div.radiobuttons:nth-child(2) > label:nth-child(2)")).click();
	  	  Thread.sleep(5000);
	  	  driver.findElement(By.id("home-depart-date-heatmap")).clear();
	  	  driver.findElement(By.id("home-depart-date-heatmap")).sendKeys(Date);
	  	  //driver.findElement(By.xpath("//*[@id=home-depart-date-heatmap]")).sendKeys("20-12-2019");
	  	  driver.findElement(By.id("home-flight-search-airasia-button-inner-button-select-flight-heatmap")).click();
	    }
	    public static void login(String Username, String Password) throws InterruptedException{
	    	 Thread.sleep(5000);
	 	    driver.findElement(By.id("loginModal")).click();
	 	    driver.findElement(By.id("sso-login-email-input")).click();
	 	    driver.findElement(By.id("sso-login-email-input")).sendKeys(Username);
	 	    driver.findElement(By.id("sso-login-password-input")).click();
	 	    driver.findElement(By.id("sso-login-password-input")).sendKeys(Password);
	 	    driver.findElement(By.cssSelector(".sso-button:nth-child(4)")).click();
	 	    Thread.sleep(5000);
	 	    WebElement msg=driver.findElement(By.cssSelector(".sso-error-message > div:nth-child(2)"));
	 	    String text = msg.getText();
	 	    System.out.println(text);
	 	    Assert.assertEquals(text,"Your log in attempts has been unsuccessful. As a security measure, we’ve locked your account and you’re required to reset your password.");
	 	   driver.close();
	    }	    
	    public static void main(String[] args) throws InterruptedException{
	    	
}
}
