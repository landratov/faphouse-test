package pages.registration.business;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;
import static common.Utils.generateRandomString;

public class BusinessDetailsPage {
    private static final String country = "Uganda";
    private static final SelenideElement producerBrandInput = $(By.xpath("//input[@data-testid='field-element-producerName']"));
    private static final SelenideElement contactFirstNameInput = $(By.xpath("//input[@data-testid='field-element-contactFirstname']"));
    private static final SelenideElement contactLastNameInput = $(By.xpath("//input[@data-testid='field-element-contactLastname']"));
    private static final SelenideElement directorFirstNameInput = $(By.xpath("//input[@data-testid='field-element-directorFirstname']"));
    private static final SelenideElement directorLastNameInput = $(By.xpath("//input[@data-testid='field-element-directorLastname']"));
    private static final SelenideElement companyNameInput = $(By.xpath("//input[@data-testid='field-element-companyName']"));
    private static final SelenideElement registrationNumberInput = $(By.xpath("//input[@data-testid='field-element-registrationNumber']"));
    private static final SelenideElement countrySelect = $(By.xpath("//input[@data-testid='field-element-addressCountryCode']"));
    private static final SelenideElement countrySelectOption = $(By.xpath("//div[@data-testid='field-element-addressCountryCode']//button[contains(text(), '" + country + "')]"));
    private static final SelenideElement cityInput = $(By.xpath("//input[@data-testid='field-element-addressCity']"));
    private static final SelenideElement regionInput = $(By.xpath("//input[@data-testid='field-element-addressRegion']"));
    private static final SelenideElement zipInput = $(By.xpath("//input[@data-testid='field-element-addressPostCode']"));
    private static final SelenideElement addressInput = $(By.xpath("//input[@data-testid='field-element-addressStreet']"));
    private static final SelenideElement custodianOfRecordsAddressInput = $(By.xpath("//textarea[@data-testid='field-element-custodianOfRecordsAddress']"));
    private static final SelenideElement nextBtn = $(By.xpath("//button[@data-testid='wizard-business-form-submit-btn']"));

    public static void fillFormWithRandomData() {
        producerBrandInput.val(generateRandomString(3, 110, true, false));
        contactFirstNameInput.val(generateRandomString(1, 255, true, false));
        contactLastNameInput.val(generateRandomString(1, 255, true, false));
        directorFirstNameInput.val(generateRandomString(1, 255, true, false));
        directorLastNameInput.val(generateRandomString(1, 255, true, false));
        companyNameInput.val(generateRandomString(3, 255, true, false));
        registrationNumberInput.val(generateRandomString(3, 255, true, true));
        countrySelect.val(country);
        countrySelectOption.click();
        cityInput.val(generateRandomString(2, 255, true, false));
        regionInput.val(generateRandomString(2, 255, true, false));
        zipInput.val(generateRandomString(3, 60, true, true));
        addressInput.val(generateRandomString(3, 60, true, true));
        custodianOfRecordsAddressInput.val(generateRandomString(1, 1000, true, true));
        nextBtn.click();
    }
}
