package mavencucu.mavencucmber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;

public class Cscucu2 {
	
	WebDriver driver;
	@Given("user enters the home page")
	
	public void user_enters_the_home_page() {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.04.29\\eclipse-wokspace\\Nishith\\chromedriver_win32\\chromedriver.exe");
		    driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		    System.out.println("User Enters in the Homepage");
	    
	}

	@Given("user clicks on login")
	public void user_clicks_on_login() {
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	   
	}
	@Given("user enters the username {string}")
	public void user_enters_the_username(String string) {
		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys(string);
		
	   
	}

	@Given("user enters the password {string}")
	public void user_enters_the_password(String string) {
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(string);
	   
	}

	@Given("clicks on login")
	public void clicks_on_login() {
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	}

	@Given("Homepage is displayed")
	public void homepage_is_displayed() throws InterruptedException {
		Thread.sleep(4000);
	    driver.close();
	}

}



