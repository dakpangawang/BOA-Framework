package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static common.CommonActions.*;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img[@src='https://www1.bac-assets.com/homepage/spa-assets/images/assets-images-global-logos-bac-logo-v2-CSX3648cbbb.svg']")
	WebElement logo;

	@FindBy(linkText = ("Find your closest financial center or ATM"))
	WebElement findYourClosesetAtm;

	@FindBy(partialLinkText = ("Find y"))
	WebElement findYourClosesetAtmP;

	@FindBy(xpath = "//input[@name='onlineId1']")
	WebElement userId;

	@FindBy(css = "input.tl-private.cs-passcode1.spa-input-text")
	WebElement password;

	public void clickloginButton() throws InterruptedException {
		clickElement(logo);
		Thread.sleep(3000);
	}

	public void clickFindYourClosestAtm() throws InterruptedException {
		clickElement(findYourClosesetAtm);
		Thread.sleep(3000);
	}

	public void clickFindYourClosestAtmP() throws InterruptedException {
		clickElement(findYourClosesetAtmP);
		Thread.sleep(3000);
	}

	public void clickAndInputUserId() throws InterruptedException {
		clickElement(userId);
		inputText(userId, "Enthrall_It");
		Thread.sleep(3000);
	}

	public void inputPassword() throws InterruptedException {
		inputText(password, "123456789");
		Thread.sleep(3000);
	}

}
