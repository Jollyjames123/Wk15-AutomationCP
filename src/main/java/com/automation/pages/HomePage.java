package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]")
    WebElement womenLink;
    @FindBy(xpath = "")
    WebElement dressesLink;
    @FindBy(xpath = "")
    WebElement tShirtLink;
    @FindBy(xpath = "//a[contains(text(),'Sign in')]")
    WebElement signInLink;
    @FindBy(xpath = "")
    WebElement logoLink;

    public void clickOnSignIn() {
        pmClickOnElement(signInLink);
        log.info("Clicking on SignIn :" + signInLink.toString());
    }

    public void clickOnWomenTab() {
        pmClickOnElement(womenLink);
        log.info("Clicking on WOMEN tab :" + womenLink.toString());
    }
}
