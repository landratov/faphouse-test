package pages.registration;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class DeleteConfirmationPage {
    private static final SelenideElement deleteBtn = $(By.xpath("//button[@data-testid='affidavit-dismiss-modal__ok']"));

    public static void confirm() {
        deleteBtn.click();
    }
}
