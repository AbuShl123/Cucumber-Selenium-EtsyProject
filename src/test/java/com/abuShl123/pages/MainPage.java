package com.abuShl123.pages;

import com.abuShl123.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    public MainPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "#catnav-primary-link-10923")
    public WebElement clothing_and_shoes;
}
