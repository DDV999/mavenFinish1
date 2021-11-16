package org.example.steps;

import io.qameta.allure.Step;
import org.example.pages.FilterAdvancedModePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.assertTrue;

public class FilterAdvancedModeSteps {

    @Step("нажимается на поле Заголовок {0}")
    public void stepClickFieldTitle() {
        WebDriverWait wait = new WebDriverWait(BaseSteps.getDriver(),5);
        String actualTitle =wait.until(ExpectedConditions.visibilityOf(new FilterAdvancedModePage().fieldTitle)).getText();
        new FilterAdvancedModePage().fieldTitle.click();
    }

    @Step("поле {0} заполняется значением {1}")
    public void fillField(String field, String value) {
        new FilterAdvancedModePage().fillField(field, value);
    }

    @Step("выбирается производитель {0}")
    public void fillField(String field) {
        new FilterAdvancedModePage().selectManufacturer(field);
    }

    @Step("нажимается на кнопку Показать предложения {0}")
    public void stepClickButtonShowOffers() {
        new FilterAdvancedModePage().buttonShowOffers.click();
    }

    @Step("нажимается на кнопку Найти {0}")
    public void stepClickButtonSearch() {
        new FilterAdvancedModePage().buttonSearch.click();
    }

    @Step("в поле {0} присутствует сообщение об ошибке {1}")
    public void checkErrorMessageField(String field, String value){
        new FilterAdvancedModePage().checkFieldErrorMessage(field, value);
    }

    @Step("поле {0} заполнено значением {1}")
    public void checkFillField(String field, String value){
        String actual = getTitleMessageField();
        assertTrue(String.format("Значение поля [%s] равно [%s]. Ожидалось - [%s]", field, actual, value),
                actual.equals(value));
    }

    @Step
    public String getTitleMessageField() {
        return new FilterAdvancedModePage().getFieldFirstTitle();
    }

}
