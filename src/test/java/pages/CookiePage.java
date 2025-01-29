package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CookiePage {
    private static final SelenideElement acceptBtn = $(By.xpath("//button[@data-testid=\"cwc-accept\"]"));

    public static void acceptCookie() {
        acceptBtn.click();
    }
}
