package com.abuShl123.pages;

import com.abuShl123.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ClothingAndShoesPage {
    public ClothingAndShoesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (css = "button#search-filter-button")
    public WebElement all_filter_button;

    @FindBy (xpath = "//input[@name='free_shipping']")
    public WebElement free_shipping_filter;

    @FindBy (css = "input#price-input-1")
    public WebElement under_usd_25_filter;

    @FindBy (css = "input#price-input-custom")
    public WebElement custom_price_filter;

    @FindBy (css = "input#search-filter-min-price-input")
    public WebElement from_low_price;

    @FindBy (css = "input#search-filter-max-price-input")
    public WebElement to_max_price;

    @FindBy (css = "button[aria-label='Apply'] ")
    public WebElement apply_button;

    @FindBy (xpath = "//ul[starts-with(@class, 'wt-grid')]/li")
    public List<WebElement> allProducts;
}
