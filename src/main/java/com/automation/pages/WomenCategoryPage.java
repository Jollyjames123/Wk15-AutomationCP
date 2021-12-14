package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenCategoryPage extends Utility {
    private static final Logger log = LogManager.getLogger(WomenCategoryPage.class.getName());

    public WomenCategoryPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h2[contains(text(),'Women')]")
    WebElement womenTitleTextLink;

    public void verifyWomenText() {
        //Reporter.log("Verifying WOMEN text"+womenTitleTextLink.toString()+"<br>");
        pmVerifyElements(womenTitleTextLink, "WOMEN", "Page is not displayed correctly");
        log.info("Verifying WOMEN text :" + womenTitleTextLink.toString());
    }
}
