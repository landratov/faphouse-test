package pages.registration.business;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BusinessAgreementPage {
    private static final SelenideElement agreementCheckbox = $(By.xpath("//div[@data-testid='field-element-contractSigned']"));
    private static final SelenideElement agreeBtn = $(By.xpath("//div[contains(@class, 'form__actions')]//button[@type='submit']"));

    public static void agree() {
        agreementCheckbox.scrollTo();
        agreementCheckbox.click();
        agreeBtn.click();
    }
}
