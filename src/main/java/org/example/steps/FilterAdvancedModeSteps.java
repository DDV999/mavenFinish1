package org.example.steps;

import io.qameta.allure.Step;
import org.example.pages.FilterAdvancedModePage;

public class FilterAdvancedModeSteps {

    @Step("для поля {0} задать параметр поиска {1}")
    public void fillField(String field, String value) {
        new FilterAdvancedModePage().fillField(field, value);
    }

    @Step("выбрать производителя {0}")
    public void chooseManufacturers(String field) {
        new FilterAdvancedModePage().selectManufacturer(field);
    }

    @Step("нажать кнопку Показать предложения")
    public void stepClickButtonShowOffers() {
        new FilterAdvancedModePage().buttonShowOffers.click();
    }

    @Step("нажимается на кнопку Найти")
    public void stepClickButtonSearch() {
        new FilterAdvancedModePage().buttonSearch.click();
    }

    @Step("запомнить первый элемент в списке")
    public String getTitleMessageField() {
        return new FilterAdvancedModePage().getFieldFirstTitle();
    }

    @Step("ввести запомненное значение в {0}")
    public void addValueToSearchField(String field) {
        new FilterAdvancedModePage().fillField(field);
    }

    @Step("проверить, что наименование товара соответствует запомненному значению.")
    public void checkName() {
        new FilterAdvancedModePage().checkNameTVInSearch();
    }

    @Step("проверить, что элементов на странице 48")
    public void checkElementsCount() {
        new FilterAdvancedModePage().checkCountElements();
    }
}