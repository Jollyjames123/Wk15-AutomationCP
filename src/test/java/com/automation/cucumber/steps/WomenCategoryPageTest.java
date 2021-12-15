package com.automation.cucumber.steps;

import com.automation.pages.HomePage;
import com.automation.pages.ProductPage;
import com.automation.pages.WomenCategoryPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class WomenCategoryPageTest {
    @And("^I click on 'WOMEN' tab$")
    public void iClickOnWOMENTab() {
        new HomePage().clickOnWomenTab();
    }

    @And("^click on the product name \"([^\"]*)\"$")
    public void clickOnTheProductName(String product)  {
        new ProductPage().clickOnTheProduct(product);
         }

    @And("^change the quantity \"([^\"]*)\"$")
    public void changeTheQuantity(String qty)  {
new ProductPage().changeQty(qty);
    }

    @And("^select the size \"([^\"]*)\"$")
    public void selectTheSize(String size)  {
new ProductPage().selectSize(size);
    }

    @And("^select the colour \"([^\"]*)\"$")
    public void selectTheColour(String colour)  {
new ProductPage().selectColour(colour);
    }

    @And("^click on add to cart button$")
    public void clickOnAddToCartButton() throws InterruptedException {
    new ProductPage().addToCart();
    }

    @And("^verify the pop up message$")
    public void verifyThePopUpMessage() throws InterruptedException {
        new ProductPage().verifyPopUpMessage();
    }

    @And("^click on x button to close the popup$")
    public void clickOnXButtonToCloseThePopup() {
        new ProductPage().closeThePopUpMessage();
    }

    @Then("^the products should be added to cart successfully$")
    public void theProductsShouldBeAddedToCartSuccessfully() {
    }

    @And("^verify 'WOMEN' text on the page$")
    public void verifyWOMENTextOnThePage() {
        new WomenCategoryPage().verifyWomenText();
    }

    @Then("^I should be able to navigate to women category page successfully$")
    public void iShouldBeAbleToNavigateToWomenCategoryPageSuccessfully() {
    }
}
