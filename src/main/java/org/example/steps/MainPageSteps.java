package org.example.steps;

import io.qameta.allure.Step;
import org.example.pages.MainPage;

public class MainPageSteps {
    @Step("Нажать на кнопку Яндекс.Маркет {0}")
    public void stepClickButtonYandexMarket() {
        new MainPage().buttonYandexMarket.click();
    }
}
