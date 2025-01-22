package StepDefinitions;

import CoreLogic.CommonLogics;
import PageOperations.LoginPageOperations;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginStepDefinitions {
	LoginPageOperations loginPageOperations;
	
	public LoginStepDefinitions(){
	loginPageOperations=new LoginPageOperations();
	}
	
	@Given("user is on Homepage")
	public void user_is_on_homepage() {
		CommonLogics.hitUrl();
	}
	@Then("click on Create an account link")
	public void click_on_create_an_account_link() {
		loginPageOperations.clickonCreateAccountLink();
	}
	@And("enter First Name in textbox as {string}")
	public void enter_first_name_in_textbox_as(String firstname) {
		loginPageOperations.enterFirstName(firstname);
	}
	@And("enter Last Name in textbox as {string}")
	public void enter_last_name_in_textbox_as(String lastname) {
		loginPageOperations.enterLastName(lastname);
	}
	@And("enter Email in textbox as {string}")
	public void enter_email_in_textbox_as(String email) throws InterruptedException {
		loginPageOperations.enterEmail(email);
	}
	@Then("enter Password in textbox as {string}")
	public void enter_password_in_textbox_as(String password) {
		loginPageOperations.enterPassword(password);
	}
	@Then("enter Confirm Password in textbox as {string}")
	public void enter_confirm_password_in_textbox_as(String password) {
		loginPageOperations.confirmPassword(password);
	}
	@Then("click on Create an account button")
	public void click_on_create_an_account_button() {
		loginPageOperations.clickCreateAccountButton();
	}
	
	@Then("verify registration success message")
	public void verify_registration_success_message() {
		loginPageOperations.verifyRegistrationsuccessMessage();
	}

	@Then("click on signout button")
	public void click_on_signout_button() {
		loginPageOperations.clickOnSignouttButton();
	}
	
	@Then("click on Sign In link")
	public void click_on_sign_in_link() {
		loginPageOperations.clickOnSignInLink();
	}

	@Then("click on Sign In button")
	public void click_on_sign_in_button() {
		loginPageOperations.clickOnSignInButton();
	}

	@Then("Verify welcome text on Homepage")
	public void verify_welcome_text_on_homepage() {
		loginPageOperations.verifySignInPageText();
	}
}
