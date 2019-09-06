package mavencucu.mavencucmber;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;

public class Cscucu3 {

	WebDriver driver;
	@Given("alex enters the home page")
	public void alex_enters_the_home_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.04.29\\eclipse-wokspace\\Nishith\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    System.out.println("User Enters in the Homepage");
	}

	@Given("alex clicks on login button")
	public void alex_clicks_on_login_button() {
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	   
	}

	@Given("alex enter the username {string}")
	public void alex_enter_the_username(String string) {
		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys(string);
	   
	}

	@Given("alex enter the password {string}")
	public void alex_enter_the_password(String string) {
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(string);
	  
	}

	@Given("alex click on login button")
	public void alex_click_on_login_button() {
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	   
	}

	@Given("Homepage is displayed for alex")
	public void homepage_is_displayed_for_alex() {
	  
	}

	@Given("alex searches for headphones in the search box {string}")
	public void alex_searches_for_headphones_in_the_search_box(String string) {
		driver.findElement(By.xpath("//*[@id=\"myInput\"]")).sendKeys(string);
	   
	}

	/*@Given("alex selects the headphone option from drop down")
	public void alex_selects_the_headphone_option_from_drop_down() {
		driver.findElement(By.xpath("//*[@id=\"myInputautocomplete-list\"]/div")).click();
	   
	}*/

	@Given("alex click find details button")
	public void alex_click_find_details_button() {
		driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	   
	}

	@Given("alex adds the item to cart")
	public void alex_adds_the_item_to_cart() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
		//Thread.sleep(4000);
		//driver.close();
	   
	}
	@Given("alex clicks on cart option")
	public void alex_clicks_on_cart_option() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
	Thread.sleep(4000);
	//driver.close();
	}
	
	@Given("alex Removes the quantity")
	public void alex_Removes_the_quantity() {
		
		driver.findElement(By.xpath("//*[@id=\"cart\"]/tbody/tr/td[5]/form/input[2]")).click();
		Assert.assertEquals("http://10.232.237.143:443/TestMeApp/removeCartItem.htm?prodId=1", driver.getCurrentUrl());
		driver.close();
	   
	}




}



