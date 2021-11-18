package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.example.steps.BaseSteps;

public class MainPage extends BasePageObject {

    @FindBy(xpath = "//*[text()='Маркет']")
    public WebElement buttonYandexMarket;

    public MainPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }
}



