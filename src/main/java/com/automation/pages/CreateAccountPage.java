package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(CreateAccountPage.class.getName());

    public CreateAccountPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='customer_firstname']")
    WebElement firstNameLink;
    @FindBy(xpath = "//input[@id='customer_lastname']")
    WebElement lastNameLink;
    @FindBy(xpath = "//input[@id='passwd']")
    WebElement passwordLink;
    @FindBy(xpath = "//input[@id='address1']")
    WebElement addressLink;
    @FindBy(xpath = "//input[@id='city']")
    WebElement cityLink;
    @FindBy(xpath = "//select[@id='id_state']")
    WebElement stateLink;
    @FindBy(xpath = "//input[@id='postcode']")
    WebElement zipPostalLink;
    @FindBy(xpath = "//select[@id='id_country']")
    WebElement countryLink;
    @FindBy(xpath = "//input[@id='phone_mobile']")
    WebElement mobilePhoneLink;
    @FindBy(xpath = "//button[@id='submitAccount']")
    WebElement registerLink;
    @FindBy(xpath = "//input[@id='email_create']")
    WebElement emailCreateAccLink;
    @FindBy(xpath = "//button[@id='SubmitCreate']")
    WebElement createAccountLink;
    @FindBy(xpath = "//h1[contains(text(),'My account')]")
    WebElement myAccountTextLink;

    public void fillMandetoryFields() {

        pmSendTextToElement(firstNameLink, "James");
        log.info("Entering firstname :" + firstNameLink.toString());

        pmSendTextToElement(lastNameLink, "Bond");
        log.info("Entering lastname :" + lastNameLink.toString());

        pmSendTextToElement(passwordLink, "Prime123");
        log.info("Entering password :" + passwordLink.toString());

        pmSendTextToElement(addressLink, "999 Prime Road");
        log.info("Entering address :" + addressLink.toString());

        pmSendTextToElement(cityLink, "London");
        log.info("Entering city name :" + cityLink.toString());

        pmSelectByVisibleTextFromDropDown(stateLink, "Florida");
        log.info("Selecting the state :" + stateLink.toString());

        pmSendTextToElement(zipPostalLink, "12345");
        log.info("Entering postalcode :" + zipPostalLink.toString());

        pmSendTextToElement(mobilePhoneLink, "01234567891");
        log.info("Entering contact number :" + mobilePhoneLink.toString());
    }

    public void clickOnRegister() {
        pmClickOnElement(registerLink);
        log.info("Clicking on register link :" + registerLink.toString());
    }

    public void verifyMyAccountText() {
        pmVerifyElements(myAccountTextLink, "MY ACCOUNT", "Message is not displayed correctly");
        log.info("Verifying the message :" + myAccountTextLink.toString());
    }
}
