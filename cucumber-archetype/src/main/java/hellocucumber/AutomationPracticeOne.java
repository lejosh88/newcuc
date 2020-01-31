package hellocucumber;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomationPracticeOne {
	public static WebDriver driver;
	public static void browserlaunch(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mindtree443\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
	      WebDriverWait wait = new WebDriverWait(driver, 1000);
	      driver.manage().window().maximize();	
	}
	public static void navigate(String url)
	{

		 driver.get(url);	      
	}
	public static void createAnAccount(String email) throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
		  Thread.sleep(5000);
		  
		  driver.findElement(By.xpath("//*[@id='email_create']")).sendKeys(email);
		  driver.findElement(By.xpath("//*[@id='SubmitCreate']")).click();	 
		  
			
			
		 
	}
	public static void registerationFieldEntry(String firstName, String lastName, String password, String FnameInAddr, String LnameinAddr, String company, String addressone, String addresstwo,String city,String state,String postcode,String Country,String Otherinfo,String Phone,String Mobile,String alias) throws InterruptedException{
		 //Select Radio Button
		  String valueOfGender = "2"; //in this case, value is integer, it can be String in most of the cases.
		  Thread.sleep(5000);
		  List<WebElement> RadioButtonList = driver.findElements(By.name("id_gender"));  
		  System.out.println("Total numer of Radio Buttons for gender field is: " +RadioButtonList.size());  
		  for (int i = 0; i < RadioButtonList.size(); i++){
		   String gend = RadioButtonList.get(i).getAttribute("value");
		   if (gend.equalsIgnoreCase((valueOfGender))){
		    RadioButtonList.get(i).click();
		    break;
		   }
		  }		  
		  //Enter customer details
		  driver.findElement(By.xpath("//*[@id='customer_firstname']")).sendKeys(firstName);
		  driver.findElement(By.xpath("//*[@id='customer_lastname']")).sendKeys(lastName);
		  driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys(password);		  
		  //Select date of Birth
		  Select sDate = new Select(driver.findElement(By.xpath("//*[@id='days']")));
		  sDate.selectByVisibleText("2  ");		  
		  Select sMonth = new Select(driver.findElement(By.xpath("//*[@id='months']")));
		  sMonth.selectByVisibleText("May "); 
		  Select sYear = new Select(driver.findElement(By.xpath("//*[@id='years']")));
		  sYear.selectByVisibleText("2015  ");	  
		  //select required check boxes
		  String newsLetterReq = "Yes";
		  if (newsLetterReq.equalsIgnoreCase(newsLetterReq)){
		  driver.findElement(By.xpath(".//*[@id='newsletter']")).click();
		  }  
		  String reciveSpclOffer = "Yes";
		  if (reciveSpclOffer.equalsIgnoreCase(reciveSpclOffer)){
		   driver.findElement(By.xpath("//*[@id='optin']")).click();	   
		  //Fill address related details
		  driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys(FnameInAddr);
		  driver.findElement(By.xpath("//*[@id='lastname']")).sendKeys(LnameinAddr);
		  driver.findElement(By.xpath("//*[@id='company']")).sendKeys(company);
		  driver.findElement(By.xpath("//*[@id='address1']")).sendKeys(addressone);
		  driver.findElement(By.xpath("//*[@id='address2']")).sendKeys(addresstwo);
		  driver.findElement(By.xpath("//*[@id='city']")).sendKeys(city);	  
		  Select sState = new Select(driver.findElement(By.xpath("//*[@id='id_state']")));
		  sState.selectByVisibleText(state);
		  driver.findElement(By.xpath("//*[@id='postcode']")).sendKeys(postcode);	  
		  Select sCountry = new Select(driver.findElement(By.xpath("//*[@id='id_country']")));
		  sCountry.selectByVisibleText(Country);		  
		  driver.findElement(By.xpath("//*[@id='other']")).sendKeys(Otherinfo);
		  driver.findElement(By.xpath("//*[@id='phone']")).sendKeys(Phone);
		  driver.findElement(By.xpath("//*[@id='phone_mobile']")).sendKeys(Mobile);
		  driver.findElement(By.xpath("//*[@id='alias']")).sendKeys(alias);
		  Thread.sleep(5000);       
		  }
	}
	public static void registerationSubmission(){
		 //click on submit 
		 driver.findElement(By.id("submitAccount")).click();
	}
	 public static void a_validation() throws InterruptedException{
		 Thread.sleep(5000);
		 WebElement Ele =driver.findElement(By.xpath("//p[contains(text(), \"Welcome to your account.\")]"));
		 Thread.sleep(5000);
		   System.out.println(Ele.getText());
		  if(Ele.isDisplayed())
		  {
			  System.out.println("login Succssfull"+ Ele);
		  }
		 driver.close();
	 }
	 public static void error_validation(String error) throws InterruptedException{
		 Thread.sleep(5000);
		 WebElement Ele= driver.findElement(By.cssSelector("#create_account_error"));
		 Thread.sleep(5000);
		   System.out.println(Ele.getText());
		   System.out.println(error);
		  if(Ele.isDisplayed())
		  {
			  System.out.println("login Succssfull"+ Ele);
			  Assert.assertEquals(Ele.getText(),error);
		  }
		 driver.close();
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
