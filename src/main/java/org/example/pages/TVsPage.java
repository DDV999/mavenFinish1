package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.example.steps.BaseSteps;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TVsPage extends BasePageObject {

    @FindBy(xpath = "//*[text()='Все фильтры']")
    public WebElement buttonAllFilters;

    public TVsPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
        (new WebDriverWait(BaseSteps.getDriver(), 5))
                .until(ExpectedConditions.visibilityOf(buttonAllFilters));
    }
}
