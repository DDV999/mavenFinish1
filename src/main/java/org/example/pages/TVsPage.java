package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.example.steps.BaseSteps;

public class TVsPage extends BasePageObject{

    @FindBy(xpath = "//*[text()='Все фильтры']")
    public WebElement buttonAllFilters;

    public TVsPage(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }
}
