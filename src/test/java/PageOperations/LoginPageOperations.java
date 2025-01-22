package PageOperations;

import org.testng.Assert;
import CoreLogic.CommonLogics;
import PageObjects.LoginPageObjects;

public class LoginPageOperations {
	LoginPageObjects loginPageObjects;
	
	public LoginPageOperations(){
		loginPageObjects=new LoginPageObjects();
	}
	
	
	public void clickonCreateAccountLink()
	{
		CommonLogics.waitForElementToBeClickable(loginPageObjects.createAnAccountLinkXpath());
		CommonLogics.clickElement(loginPageObjects.createAnAccountLinkXpath());
	}
	
	public void enterFirstName(String firstName) {
		CommonLogics.waitForElementToBeClickable(loginPageObjects.firstNameXpath());
		CommonLogics.enterText(loginPageObjects.firstNameXpath(), firstName);
	}
	
	public void enterLastName(String lastName) {
		CommonLogics.waitForElementToBeClickable(loginPageObjects.lastNameXpath());
		CommonLogics.enterText(loginPageObjects.lastNameXpath(), lastName);
	}
	
	public void enterEmail(String email) throws InterruptedException {
		CommonLogics.scrollByElement();
		CommonLogics.waitForElementToBeVisible(loginPageObjects.emailXpath());
		CommonLogics.enterText(loginPageObjects.emailXpath(), email);
	}
	
	public void enterPassword(String password) {
		CommonLogics.waitForElementToBeClickable(loginPageObjects.passwordXpath());
		CommonLogics.enterText(loginPageObjects.passwordXpath(), password);
	}
	
	public void confirmPassword(String password) {
		CommonLogics.waitForElementToBeClickable(loginPageObjects.passwordXpath());
		CommonLogics.enterText(loginPageObjects.confirmPasswordXpath(), password);
	}
	
	public void clickCreateAccountButton()
	{
		CommonLogics.waitForElementToBeClickable(loginPageObjects.createAccountButtonXpath());
		CommonLogics.clickElement(loginPageObjects.createAccountButtonXpath());
	}
	
	public void verifyRegistrationsuccessMessage()
	{
		CommonLogics.waitForElementToBeVisible(loginPageObjects.registrationSuccessMessageXpath());
		String actual=CommonLogics.getText(loginPageObjects.registrationSuccessMessageXpath());
		String expected="Thank you for registering with Main Website Store.";
		Assert.assertEquals(actual,expected);
	}
	
	public void clickOnSignouttButton()
	{
		CommonLogics.waitForElementToBeVisible(loginPageObjects.signoutDropdownXpath());
		CommonLogics.clickElement(loginPageObjects.signoutDropdownXpath());
		CommonLogics.waitForElementToBeVisible(loginPageObjects.signoutDropdownXpath());
		CommonLogics.clickElement(loginPageObjects.signoutButtonXpath());
		System.out.println("Successfully Signed out");
	}
	
	public void clickOnSignInLink()
	{
		CommonLogics.waitForElementToBeVisible(loginPageObjects.signInLinkXpath());
		CommonLogics.clickElement(loginPageObjects.signInLinkXpath());
	}
	
	public void clickOnSignInButton()
	{
		CommonLogics.waitForElementToBeVisible(loginPageObjects.signInButtonXpath());
		CommonLogics.clickElement(loginPageObjects.signInButtonXpath());
	}
	
	public void verifySignInPageText()
	{
		CommonLogics.waitForElementToBeVisible(loginPageObjects.signInTextXpath());
		String actual=CommonLogics.getText(loginPageObjects.signInTextXpath());
		String expected="My Account";
		Assert.assertEquals(actual,expected);
	}
}
