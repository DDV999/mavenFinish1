package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.example.steps.BaseSteps;

public class ElectronicsPage extends BasePageObject{

    @FindBy(xpath = "//a[text()='Телевизоры']")
    public WebElement buttonTVs;

    @FindBy(xpath = "//*[@id='logoPartMarket']")
    public WebElement title;

    public ElectronicsPage(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }
}