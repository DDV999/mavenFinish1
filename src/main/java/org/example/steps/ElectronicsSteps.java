package org.example.steps;

import io.qameta.allure.Step;
import org.example.pages.ElectronicsPage;

public class ElectronicsSteps {

    @Step("выбрать раздел \"Телевизоры\"")
    public void stepClickButtonTVs() {
        new ElectronicsPage().buttonTVs.click();
    }
}
