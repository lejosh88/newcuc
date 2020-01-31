package hellocucumber;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Tour {
	public static WebDriver driver;
	public static void browserlaunch(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mindtree443\\Downloads\\chromedriver_win32\\chromedriver.exe");	 
	}
	public static void navigate(String url)
	{
		driver = new ChromeDriver(); 
    WebDriverWait wait = new WebDriverWait(driver, 1000);
    driver.manage().window().maximize();
		 driver.get(url);      
	}
	public static void registerationLink()
	{
		WebElement lnk_register = driver.findElement(By.linkText("REGISTER"));
	    lnk_register.click();
	}
	public static void registerationFieldEntry(String firstName, String lastName, String phone, String userName, String country, String email, String password, String confrimPassword) throws InterruptedException{
		//Enter details on the provided text boxes by using sendkeys method. 
	    WebElement txtBox_firstname = driver.findElement(By.name("firstName")); 
	    txtBox_firstname.sendKeys(firstName);  
	    //or directly we can identify element and act on that in one line 
	    driver.findElement(By.name("lastName")).sendKeys(lastName); 
	    driver.findElement(By.name("phone")).sendKeys(phone); 
	    driver.findElement(By.name("userName")).sendKeys(userName); 
	 Thread.sleep(9000);
	    //Enter mailing information as above //Select the country, create a select object and then work on that object
	    Select s = new  Select(driver.findElement(By.name("country"))); 
	    s.selectByVisibleText(country);  
	    //Enter user name and password 
	    driver.findElement(By.name("email")).sendKeys(email); 
	    driver.findElement(By.name("password")).sendKeys(password); 
	    driver.findElement(By.name("confirmPassword")).sendKeys(confrimPassword); 	   
	}
	public static void registerationSubmission(){
		 //click on submit 
	    driver.findElement(By.xpath("//input[@name='register']")).click();	
	}
	
	public static void tourLogin(String username, String password) throws InterruptedException{
		Thread.sleep(5000);
		 driver.findElement(By.linkText("Home")).click();		 
		    //Enter the username and password and click on the submit button. 
		    driver.findElement(By.name("userName")).sendKeys(username); 
		    driver.findElement(By.name("password")).sendKeys(password); 
		    Thread.sleep(5000);
		  driver.findElement(By.xpath("//input[@name='login']")).click();		    
	}
	public static void loginValidation(){
		WebElement form_findflight = driver.findElement(By.xpath("//form[@name='findflight']")); 
		    if(form_findflight.isDisplayed()) 
		   
		       System.out.println("Login successful!"); 
		       driver.close();
		      
		    } 
	public static void close()
    {
    	//driver.close();
    }	
	public static void main(String[] args) {		
	}
	

}
