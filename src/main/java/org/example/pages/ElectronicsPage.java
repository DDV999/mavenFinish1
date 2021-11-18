package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.example.steps.BaseSteps;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElectronicsPage extends BasePageObject {

    @FindBy(xpath = "//a[text()='Телевизоры']")
    public WebElement buttonTVs;

    public ElectronicsPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
        (new WebDriverWait(BaseSteps.getDriver(), 5))
                .until(ExpectedConditions.visibilityOf(buttonTVs));
    }
}