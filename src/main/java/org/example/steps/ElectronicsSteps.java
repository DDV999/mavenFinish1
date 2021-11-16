package org.example.steps;

import io.qameta.allure.Step;
import org.example.pages.ElectronicsPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElectronicsSteps {

    @Step("Нажать на кнопку Телевизоры {0}")
    public void stepClickButtonTVs() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(BaseSteps.getDriver(), 5);
        String actualTitle = wait.until(ExpectedConditions.visibilityOf(new ElectronicsPage().title)).getText();
        new ElectronicsPage().buttonTVs.click();
    }
}
