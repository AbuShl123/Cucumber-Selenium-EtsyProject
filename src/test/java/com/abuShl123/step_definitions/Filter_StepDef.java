package com.abuShl123.step_definitions;

import com.abuShl123.pages.ClothingAndShoesPage;
import com.abuShl123.pages.MainPage;
import com.abuShl123.utilities.ConfigurationReader;
import com.abuShl123.utilities.Driver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class Filter_StepDef {
    private static final MainPage mainPage = new MainPage();
    private static final ClothingAndShoesPage clothingAndShoesPage = new ClothingAndShoesPage();

    @Given("^user is on home page$")
    public void user_is_on_home_page() {
        Driver.getDriver().navigate().to(ConfigurationReader.getProperty("env"));
    }

    @When("^user clicks on clothing & shoes$")
    public void user_clicks_on_clothing_shoes() {
        mainPage.clothing_and_shoes.click();
    }

    @When("^user clicks on All Filters button$")
    public void user_clicks_on_All_Filters_button() {
        clothingAndShoesPage.all_filter_button.click();
    }

    @When("^user selects FREE shipping option$")
    public void user_selects_FREE_shipping_option() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();", clothingAndShoesPage.free_shipping_filter);
    }

    @And("^user clicks on apply button$")
    public void userClicksOnApplyButton() {
        clothingAndShoesPage.apply_button.click();
    }

    @Then("^all products on the page appear with \"([^\"]*)\" label$")
    public void all_products_on_the_page_appear_with_label(String arg1) {
        String product_locator = "//ul[starts-with(@class, 'wt-grid')]/li";
        String label_locator = "//span[@class='wt-badge wt-badge--small wt-badge--sale-01']";
        int allProductsNumber = clothingAndShoesPage.allProducts.size();

        int productsWithFreeShipping_amount = Driver.getDriver().findElements(By.xpath(product_locator+label_locator)).size();
        Assert.assertTrue(allProductsNumber-productsWithFreeShipping_amount <= 15);
    }
}
