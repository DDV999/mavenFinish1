package org.example.steps;

import io.qameta.allure.Step;
import org.example.pages.YandexMarketPage;
import java.util.ArrayList;
import static java.lang.Thread.sleep;
import static org.example.steps.BaseSteps.driver;

public class YandexMarketSteps {

    @Step("Нажать на кнопку Электроника {0}")
    public void stepClickButtonElectronics() throws InterruptedException {
        sleep(5000);
        ArrayList tabs2 = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window(String.valueOf(tabs2.get(1)));
        new YandexMarketPage().buttonElectronics.click();
    }
}