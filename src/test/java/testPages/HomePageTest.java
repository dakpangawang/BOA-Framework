package testPages;

import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class HomePageTest extends BaseClass {

	@Test(enabled = true)
	public void clickloginButtonTest() throws InterruptedException {
		homePage.clickloginButton();
	}

	@Test(enabled = true)
	public void clickFindYourClosestAtmTest() throws InterruptedException {
		homePage.clickFindYourClosestAtm();
	}

	@Test(enabled = true)
	public void clickFindYourClosestAtmPTest() throws InterruptedException {
		homePage.clickFindYourClosestAtmP();
	}

	@Test(enabled = true)
	public void clickAndInputUserIdTest() throws InterruptedException {
		homePage.clickAndInputUserId();
	}

	@Test(enabled = true)
	public void inputPassworkTest() throws InterruptedException {
		homePage.inputPassword();
	}

}
