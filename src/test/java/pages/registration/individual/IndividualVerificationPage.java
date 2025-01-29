package pages.registration.individual;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.clickable;
import static com.codeborne.selenide.Condition.cssClass;
import static com.codeborne.selenide.Selenide.$;

public class IndividualVerificationPage {
    private static final SelenideElement businessSwitch = $(By.xpath("//div[contains(@class, 'value-business')]"));

    public static void switchToBusiness() {
        businessSwitch.shouldBe(clickable);
        while (!businessSwitch.has(cssClass("selected"))) {
            businessSwitch.click();
        }
    }
}
