package org.example.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.example.steps.BaseSteps;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FilterAdvancedModePage extends BasePageObject {

    @FindBy(xpath = "//*[@data-zone-name='all-filters-page']//h1")
    public WebElement fieldTitle;

    @FindBy(xpath = "//*[@id='153061']")
    public WebElement checkboxManufacturerSamsung;

    @FindBy(xpath = "//*[@id='153074']")
    public WebElement checkboxManufacturerLG;

    @FindBy(xpath = "//*[@class='_2qvOO _3qN-v _1Rc6L']")
    public WebElement buttonShowOffers;

    @FindBy(xpath = "//*[@data-filter-id='glprice']//*[@data-prefix='от']/input")
    public WebElement fieldPriceFrom;

    @FindBy(xpath = "//*[@data-apiary-widget-name='@MarketNode/SearchPartition']")
    public WebElement sections;

    @FindBy(xpath = "//*[@itemprop='query-input']")
    public WebElement queryInput;

    @FindBy(xpath = "//*[@data-r='search-button']")
    public WebElement buttonSearch;

    @FindBy(xpath = "(//h3[@data-zone-name='title'])[1]/a[@title]")
    public WebElement firstTitleInList;

    public FilterAdvancedModePage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void fillField(String fieldName, String value) {
        switch (fieldName) {
            case "Цена От":
                fillField(fieldPriceFrom, value);
                break;
            case "Строка поиска":
                fillField(queryInput, value);
                break;
            default:
                throw new AssertionError("Поле '" + fieldName + "' не объявлено на странице");
        }
    }

    public void selectManufacturer(String fieldName) {
        switch (fieldName) {
            case "Samsung":
                checkboxManufacturerSamsung.click();
                break;
            case "LG":
                checkboxManufacturerLG.click();
                break;
            default:
                throw new AssertionError("Чекбокс '" + fieldName + "' не объявлен на странице");
        }
    }

    public void checkFieldErrorMessage(String field, String savedTitle){
        String xpath = "(//h3[@data-zone-name='title'])[1]/a[@title]";
        WebDriverWait wait = new WebDriverWait(BaseSteps.getDriver(),5);
        String actualValue = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath))).getAttribute("title");
        Assert.assertTrue(String.format("Получено значение [%s]. Ожидалось [%s]", actualValue, savedTitle),
                actualValue.contains(savedTitle));
    }

    public String getFieldFirstTitle() {
        String xpath = "(//h3[@data-zone-name='title'])[1]/a[@title]";
        return BaseSteps.getDriver().findElement(By.xpath(xpath)).getAttribute("title");
    }
}
