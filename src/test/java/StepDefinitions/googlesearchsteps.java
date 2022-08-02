package StepDefinitions;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.*;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;


import io.github.bonigarcia.wdm.WebDriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class googlesearchsteps {
	WebDriver driver = null;
	
	
@SuppressWarnings("deprecation")
@Given("browser is open")
public void browser_is_open() {


   System.out.print("inside");
  // String projectpath = System.getProperty("user.dir");
//System.out.println("project path " +projectpath);
  //System.setProperty("webdriver.chrome.driver", projectpath+"/src/test/resources/drivers/chromedriver.exe");
   
  //// System.setProperty("webdriver.edge.driver", projectpath+"/src/test/resources/drivers/msedgedriver.exe");
WebDriverManager.chromedriver().setup();
   
   driver = new ChromeDriver();
   //// driver = new EdgeDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.manage().timeouts().pageLoadTimeout(10 , TimeUnit.SECONDS);
}

@Given("user is on saucelabs pag")
public void user_is_on_saucelabs_pag() {
	System.out.print("inside");
	driver.navigate().to("https://www.saucedemo.com/");
}

@When("text in login creds with {string} and {string}")
public void text_in_login_creds_with_and(String username, String password) {

	System.out.print("inside");
	driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
	


}

@When("hits submit")
public void hits_submit() {
	System.out.print("inside");
	driver.findElement(By.xpath("//input[@id='login-button']")).click();
	
}
@Then("user is navigated with logincreds")
public void user_is_navigated_with_logincreds() {

	System.out.print("inside");
	driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
	driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
	//driver.findElement(By.xpath("//a[@id='shopping_cart_container']")).click();
	driver.findElement(By.xpath("//button[@id='checkout']")).click();
	driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("santosh");
	driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("b");
	driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("500049");
	driver.findElement(By.xpath("//input[@id='continue']")).click();
	driver.findElement(By.xpath("//button[@name='finish']")).click();
	driver.getPageSource().contains("CHECKOUT: COMPLETE!");
	String text = driver.findElement(By.xpath("//span[@class='title']")).getText();
	System.out.print(text);
	driver.close();
	driver.quit();
}




}
