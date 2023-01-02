package testPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class HomePageTest extends BaseClass {

	@Test(enabled = false)
	public void clickloginButtonTest() throws InterruptedException {
		homePage.clickloginButton();
	}

	@Test(enabled = false)
	public void clickFindYourClosestAtmTest() throws InterruptedException {
		homePage.clickFindYourClosestAtm();
	}

	@Test(enabled = false)
	public void clickFindYourClosestAtmPTest() throws InterruptedException {
		homePage.clickFindYourClosestAtmP();
	}

	@Test(enabled = false)
	public void clickAndInputUserIdTest() throws InterruptedException {
		homePage.clickAndInputUserId();
	}

	@Test(enabled = false)
	public void inputPassworkTest() throws InterruptedException {
		homePage.inputPassword();
	}
	
	// Using 3 different css selector to locate web elements
	
	@ Test (enabled = false)
	public void clickScheduleAppiontment01 () throws InterruptedException {
		driver.findElement(By.cssSelector("a#apptScheduler")).click();
		Thread.sleep(3000);
	}
	
	@Test (enabled = false)
	public void clickScheduleAppointment02 () throws InterruptedException {
		driver.findElement(By.cssSelector("a.appt-scheduler")).click();;
		Thread.sleep(3000);
	}
	
	@Test (enabled = false)
	public void clickScheduleAppointment03 () throws InterruptedException {
		driver.findElement(By.cssSelector("a.appt-scheduler[id='apptScheduler']")).click();
        Thread.sleep(3000);	
	}
	
	@Test (enabled = false)
	public void use_of_isEnabled_in_openNewAccount () {
		boolean openNewAccEnabled = driver.findElement(By.xpath("//a[text()='Open an Account']")).isEnabled();
	    System.out.println("Is Open New Account button enabled? "+openNewAccEnabled);
	}
	
	@Test (enabled = false)
	public void use_of_isDisplayed_in_logo () {
		boolean logoIsDisplayed = driver.findElement(By.xpath("//img[@itemprop='logo']")).isDisplayed();
        System.out.println("Is logo button displayed?"+logoIsDisplayed);	
	}
	
	@Test (enabled = false)
	public void use_of_isSelected () {
		driver.findElement(By.xpath("//input[@type='checkbox' and @id='saveOnlineId']")).click();
		boolean check_box_isSelected = driver.findElement(By.xpath("//input[@type='checkbox' and @id='saveOnlineId']")).isSelected();
	    System.out.println("Is save userId checkBox selected? "+check_box_isSelected);
	}
	
	@Test (enabled = false)
	public void use_of_getTitle () {
		System.out.println("Title of the page is: "+driver.getTitle());
	}
	
	@Test (enabled = false)
	public void use_of_getCurrentURL () {
		System.out.println("URL of current page: "+driver.getCurrentUrl());
	}
	
	@Test (enabled = false)
	public void use_of_getText() {
		WebElement homePageText = driver.findElement(By.cssSelector("h2.cnx-regular.headline"));
		System.out.println("it contains text: "+ homePageText.getText()); 
	}
	
	@Test (enabled = false)
	public void use_of_getAttribute () {
		String nameAttributeValue = driver.findElement(By.cssSelector("input.cs-onlineId1.spa-input-text")).getAttribute("name");
	    System.out.println("name attribute value: "+nameAttributeValue);
	}
	
	@Test (enabled = false)
	public void use_of_clear () throws InterruptedException {
		Thread.sleep(3000);
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Hdmi cables");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).clear();
	    Thread.sleep(3000);
	}
	
	@Test (enabled = false)
	public void userIdAndEnter () throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='onlineId1']")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
	}
	
	@Test (enabled = false)
	public void use_of_navigate_method() throws InterruptedException{
		Thread.sleep(5000);
		driver.navigate().to("https://www.amazon.com");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
	}
}




























