package xpaths;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Xpaths {

	// Tag with a single attribute

	@FindBy(xpath = "//input[@aria-labelledby='c']")
	WebElement password01;

	@FindBy(xpath = "//input[@type='password']")
	WebElement password02;

	@FindBy(xpath = "//input[@name='onlineId1']")
	WebElement password03;

	@FindBy(xpath = "//input[@maxlength='32']")
	WebElement password04;

	@FindBy(xpath = "//a[@id='enroll']")
	WebElement enroll;

	// Tag with multiple attribute with "or" logic

	@FindBy(xpath = "//a[@id='finCenterLocator' or @ class='fin-center-locator']")
	WebElement find01;

	@FindBy(xpath = "//a[@id='security' or @ class='spa-ui-layer-link spa-fn spa-ui-layer-modal-linkr']")
	WebElement security01;

	@FindBy(xpath = "//label[@for='saveOnlineId' or @ class='spa-input-option-label']")
	WebElement saveUserId01;

	@FindBy(xpath = "//a[@id='checkingOpenAccountStickyBarEbCta' or @ class='engagement-banner-link']")
	WebElement getStartNow01;

	@FindBy(xpath = "//div[@id='engagementBannerModulea' or @ class='banner-partial-container banner-icon-text-link']]")
	WebElement openCheckingAccount01;

	// tag with multiple attribute with "and" logic

	@FindBy(xpath = "//a[@id='finCenterLocator' and @ class='fin-center-locator']")
	WebElement find02;

	@FindBy(xpath = "//a[@id='security' and @ class='spa-ui-layer-link spa-fn spa-ui-layer-modal-linkr']")
	WebElement security02;

	@FindBy(xpath = "//label[@for='saveOnlineId' and @ class='spa-input-option-label']")
	WebElement saveUserId02;

	@FindBy(xpath = "//a[@id='checkingOpenAccountStickyBarEbCta' and @ class='engagement-banner-link']")
	WebElement getStartNow02;

	@FindBy(xpath = "//div[@id='engagementBannerModulea' and @ class='banner-partial-container banner-icon-text-link']]")
	WebElement openCheckingAccount02;

	// Tag with innerText

	@FindBy(xpath = "//p[text()='Better insurance starts here']")
	WebElement id01;

	@FindBy(xpath = "//h2[text()='Choose from over 30 other products ']")
	WebElement id02;

	@FindBy(xpath = "//span[text()='Holiday Deals']]")
	WebElement holidayDeals;

	@FindBy(xpath = "//a[text()='Gift Cards']")
	WebElement giftCards;

	@FindBy(xpath = "//a[text()='Deal of the Day']")
	WebElement dealOfTheDay;

	// Tag with partial inner text

	@FindBy(xpath = "//p[contains(text(),'Better insurance star')]")
	WebElement id03;

	@FindBy(xpath = "//h2[contains(text(),'Choose from over 30')]")
	WebElement id04;

	@FindBy(xpath = "//span[contains(text(),'Holiday Deals')]")
	WebElement holidayDeals01;

	@FindBy(xpath = "//a[contains(text(),='Gift Cards')]")
	WebElement giftCards01;

	@FindBy(xpath = "//a[contains(text(),'Deal of the Day')]")
	WebElement dealOfTheDay01;

}
