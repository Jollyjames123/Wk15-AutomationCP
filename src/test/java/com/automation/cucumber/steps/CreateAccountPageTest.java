package com.automation.cucumber.steps;

import com.automation.pages.CreateAccountPage;
import com.automation.pages.HomePage;
import com.automation.pages.SignInPage;
import com.automation.utility.Utility;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class CreateAccountPageTest extends Utility {
    @And("^I click on Sign in Link$")
    public void iClickOnSignInLink() {
        new HomePage().clickOnSignIn();
    }

    @And("^I enter email address$")
    public void iEnterEmailAddress() {
        new SignInPage().enterEmail(emailString()+"@gmail.com");
    }

    @And("^I click on Create an Account button$")
    public void iClickOnCreateAnAccountButton() {
        new SignInPage().clickOnCreateAcc();
    }

    @And("^I fill all mandatory fields$")
    public void iFillAllMandatoryFields() {
new CreateAccountPage().fillMandetoryFields();
    }

    @And("^I click on Register button$")
    public void iClickOnRegisterButton() {
        new CreateAccountPage().clickOnRegister();
    }

    @And("^I verify the message 'My Account'$")
    public void iVerifyTheMessageMyAccount() {
new CreateAccountPage().verifyMyAccountText();
    }

    @Then("^I can create account successfully$")
    public void iCanCreateAccountSuccessfully() {
    }

}
