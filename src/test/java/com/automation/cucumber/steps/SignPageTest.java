package com.automation.cucumber.steps;

import com.automation.pages.HomePage;
import com.automation.pages.SignInPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignPageTest {

    @When("^I click on sign in link$")
    public void iClickOnSignInLink() {
        new HomePage().clickOnSignIn();

    }

    @And("^I verify the message$")
    public void iVerifyTheMessage() {

        new SignInPage().verifyAuthMessage();
    }

    @Then("^I should navigate to sign in page successfully$")
    public void iShouldNavigateToSignInPageSuccessfully() {
    }


    @Given("^I am on Homepage$")
    public void iAmOnHomepage() {

    }

    @And("^I enter username \"([^\"]*)\"$")
    public void iEnterUsername(String username) {
        new SignInPage().enterUsername(username);
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password) {
        new SignInPage().enterPassword(password);
    }

    @And("^I click on sign button$")
    public void iClickOnSignButton() {
        new SignInPage().clickOnSigninButton();
    }

    @And("^I verify the sign out link is displayed$")
    public void iVerifyTheSignOutLinkIsDisplayed() {
        new SignInPage().verifySignOutLink();
    }

    @Then("^User should log in successfully$")
    public void userShouldLogInSuccessfully() {
    }


    @And("^I click on sign out link$")
    public void iClickOnSignOutLink() {
        new SignInPage().clickOnSignOut();
    }

    @And("^I verify sign in link is displayed$")
    public void iVerifySignInLinkIsDisplayed() {
        new SignInPage().verifySignInLink();
    }

    @Then("^I should be able to log out successfully$")
    public void iShouldBeAbleToLogOutSuccessfully() {
    }

    @And("^I enter username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void iEnterUsernameAndPassword(String username, String password) {
        new SignInPage().loginToApplication(username, password);
    }

    @And("^I click on sign in button$")
    public void iClickOnSignInButton() {
        new SignInPage().clickOnSigninButton();
    }

    @And("^I verify the error message \"([^\"]*)\"$")
    public void iVerifyTheErrorMessage(String errormessage) {
        new SignInPage().verifyErrorMessage();
    }


}
