package org.example.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioSteps {
    ElectronicsSteps electronicsSteps = new ElectronicsSteps();
    FilterAdvancedModeSteps filterAdvancedModeSteps = new FilterAdvancedModeSteps();
    MainPageSteps mainPageSteps = new MainPageSteps();
    TVsSteps tVsSteps = new TVsSteps();
    YandexMarketSteps yandexMarketSteps = new YandexMarketSteps();

    @When("^нажимается на кнопку Яндекс.Маркет$")
    public void clickYaMarket() {
        mainPageSteps.stepClickButtonYandexMarket();
    }

    @When("^нажимается на кнопку Телевизоры$")
    public void clickTV() throws InterruptedException {
        electronicsSteps.stepClickButtonTVs();
    }

    @When("^нажимается на кнопку Электроника$")
    public void clickEl() throws InterruptedException {
        yandexMarketSteps.stepClickButtonElectronics();
    }

    @When("^нажимается на кнопку Все фильтры$")
    public void clickAllF() throws InterruptedException {
        tVsSteps.stepClickButtonAllFilters();
    }

    @When("^поле \"(.+)\" заполняется значением \"(.+)\"$")
    public void fillOneField(String field, String value) {
        filterAdvancedModeSteps.fillField(field, value);
    }

    @When("^выбирается производитель \"(.+)\"$")
    public void selectLabel(String field) {
        filterAdvancedModeSteps.fillField(field);
    }

    @When("^нажимается на кнопку Показать предложения$")
    public void showOffers() throws InterruptedException {
        filterAdvancedModeSteps.stepClickButtonShowOffers();
    }

    @When("^нажимается на кнопку Найти$")
    public void findButtonClick() throws InterruptedException {
        filterAdvancedModeSteps.stepClickButtonSearch();
    }

    @Then("^в поле \"(.+)\" присутствует сообщение об ошибке \"(.+)\"$")
    public void checkErrorMessageNew(String field, String errorMessage) {
        filterAdvancedModeSteps.checkErrorMessageField(field, errorMessage);
    }

    @Then("^поле \"(.+)\" заполнено значением: \"(.+)\"$")
    public void checkFields(String field, String errorMessage) {
        filterAdvancedModeSteps.checkFillField(field, errorMessage);
    }
}
