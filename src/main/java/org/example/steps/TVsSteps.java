package org.example.steps;

import io.qameta.allure.Step;
import org.example.pages.TVsPage;

import java.util.ArrayList;
import static java.lang.Thread.sleep;
import static org.example.steps.BaseSteps.driver;

public class TVsSteps {

    @Step("Нажать на кнопку Все фильтры {0}")
    public void stepClickButtonAllFilters() throws InterruptedException {
        sleep(5000);
        ArrayList tabs2 = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window(String.valueOf(tabs2.get(1)));
        new TVsPage().buttonAllFilters.click();
    }
}
