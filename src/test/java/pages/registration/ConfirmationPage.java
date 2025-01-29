package pages.registration;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ConfirmationPage {
    private static final SelenideElement cancelBtn = $(By.xpath("//button[@data-testid='affidavit-modal__cancel']"));

    public static void cancelConfirmation() {
        cancelBtn.scrollTo();
        cancelBtn.click();
    }
}
