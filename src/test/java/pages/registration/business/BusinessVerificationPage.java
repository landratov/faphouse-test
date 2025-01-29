package pages.registration.business;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;

public class BusinessVerificationPage {
    private static final SelenideElement passportFile = $(By.id("field-element-passport"));
    private static final SelenideElement passportSecondFile = $(By.id("field-element-passportSecondPage"));
    private static final SelenideElement commercialRegisterFile = $(By.id("field-element-commercialRegisterExtract"));
    private static final SelenideElement certificateOfIncorporationFile = $(By.id("field-element-certificateOfIncorporation"));
    private static final SelenideElement finishBtn = $(By.xpath("//div[contains(@class, 'form__actions')]//button[1][@type='submit']"));

    public static void fillForm() {
        passportFile.uploadFile(new File("src\\test\\resources\\test.jpg"));
        passportSecondFile.uploadFile(new File("src\\test\\resources\\test.jpg"));
        commercialRegisterFile.uploadFile(new File("src\\test\\resources\\test.jpg"));
        certificateOfIncorporationFile.uploadFile(new File("src\\test\\resources\\test.jpg"));
        finishBtn.click();
    }
}
