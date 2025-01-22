package PageObjects;

public class LoginPageObjects {

	public String createAnAccountLinkXpath() {
		return "//div[@class='panel header']//a[text()='Create an Account']";
		
	}
	
	public String firstNameXpath() {
		return "//input[@id='firstname']";
	}
	
	public String lastNameXpath() {
		return "//input[@id='lastname']";
	}
	
	public String emailXpath() {
		return "//input[@id='email_address'] | //input[@id='email']";
	}
	
	public String passwordXpath() {
		return "//input[@id='password'] | //input[@name='login[password]']";
	}
	
	public String confirmPasswordXpath() {
		return "//input[@id='password-confirmation']";
	}
	
	public String createAccountButtonXpath() {
		return "//button[@title='Create an Account']";
	}
	
	public String registrationSuccessMessageXpath() {
		return "(//div[@role='alert']//child::div)[2]";
	}
	
	public String signoutDropdownXpath() {
		return "(//span[@data-toggle='dropdown'])[1]//preceding::button[@class='action switch']";
	}
	
	public String signoutButtonXpath() {
		return "(//ul//a[contains(text(),'Sign Out')])[1]";
	}
	
	public String signInLinkXpath() {
		return "//div[@class='panel header']//a[contains(text(),'Sign In')]";
	}
	
	public String signInButtonXpath() {
		return "(//button[@id='send2'])[1]";
	}
	
	public String signInTextXpath() {
		return "//span[text()='My Account']";
	}
}
