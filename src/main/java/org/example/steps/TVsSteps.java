package org.example.steps;

import io.qameta.allure.Step;
import org.example.pages.TVsPage;

public class TVsSteps {

    @Step("зайти в расширенный поиск (кнопка \"Все фильтры\")")
    public void stepClickButtonAllFilters() {
        new TVsPage().buttonAllFilters.click();
    }
}
