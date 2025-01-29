package e2e;

import org.junit.jupiter.api.Test;
import pages.CookiePage;
import pages.registration.ConfirmationPage;
import pages.registration.DeleteConfirmationPage;
import pages.registration.SignupPage;
import pages.registration.business.BusinessAgreementPage;
import pages.registration.business.BusinessDetailsPage;
import pages.registration.business.BusinessVerificationPage;
import pages.registration.individual.IndividualVerificationPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.*;

public class FaphouseTests {
    private static final String mainPageUrl = "https://studio.faphouse.com/";

    @Test
    public void simpleTest() {
        open(mainPageUrl);
        CookiePage.acceptCookie();
        SignupPage.signupWithRandomData();
        IndividualVerificationPage.switchToBusiness();
        BusinessDetailsPage.fillFormWithRandomData();
        BusinessAgreementPage.agree();
        BusinessVerificationPage.fillForm();
        ConfirmationPage.cancelConfirmation();
        DeleteConfirmationPage.confirm();

        webdriver().shouldHave(url(mainPageUrl));
    }
}
