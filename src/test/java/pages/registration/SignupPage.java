package pages.registration;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static common.Utils.generateRandomString;

public class SignupPage {
    private static final SelenideElement usernameInput = $(By.name("username"));
    private static final SelenideElement emailInput = $(By.name("email"));
    private static final SelenideElement passwordInput = $(By.name("password"));
    private static final SelenideElement getStartedBtn = $(By.xpath("//form[@id='create-account']//button[@type='submit']"));

    public static void signupWithRandomData() {
        usernameInput.val(generateRandomString(4, 20, true, true));
        emailInput.val(generateRandomString(1, 64, true, true) + "@mail.com");
        passwordInput.val(generateRandomString(6, 64, true, true));
        getStartedBtn.click();
    }
}
