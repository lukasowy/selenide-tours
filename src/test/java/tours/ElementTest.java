package tours;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.util.Base64;

import static com.codeborne.selenide.Selectors.shadowCss;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.element;
import static com.codeborne.selenide.Selenide.open;

public class ElementTest {

    @Test
    public void elementTest() {

        Configuration.browser = "chrome";

        open("https://bulk-operations-svc-ps-sec-sys-cidm.apps.dev-03.us-central2.dev.sabre-gcp.com");
        element(By.id("userId")).shouldBe(Condition.visible).setValue("bulkUiAdmin");
        element(By.id("password")).setValue(new String(Base64.getDecoder().decode("SzdCS0M0Qg==")));
        element(By.id("domain")).setValue("Sabre");
        element(By.id("group")).setValue("secsys");
        $(By.id("submit")).click();
        $(By.id("submit")).shouldNotBe(Condition.visible);
        element(shadowCss("#fileInput", "vaadin-upload")).uploadFromClasspath("auto_gen_file11478176541350344393.csv");
        element(By.id("csv-validation-message")).shouldHave(Condition.exactText("File uploaded successfully."));

        System.out.println();
        WebDriverRunner.closeWebDriver();
    }

    @Test
    public void elementOperaTest() {

        Configuration.browser = "opera";

        open("https://bulk-operations-svc-ps-sec-sys-cidm.apps.dev-03.us-central2.dev.sabre-gcp.com");
        element(By.id("userId")).shouldBe(Condition.visible).setValue("bulkUiAdmin");
        element(By.id("password")).setValue(new String(Base64.getDecoder().decode("SzdCS0M0Qg==")));
        element(By.id("domain")).setValue("Sabre");
        element(By.id("group")).setValue("secsys");
        $(By.id("submit")).click();
        $(By.id("submit")).shouldNotBe(Condition.visible);
        element(shadowCss("#fileInput", "vaadin-upload")).uploadFromClasspath("auto_gen_file11478176541350344393.csv");
        element(By.id("csv-validation-message")).shouldHave(Condition.exactText("File uploaded successfully."));

        System.out.println();
        WebDriverRunner.closeWebDriver();

    }

    @Test
    public void elementEdgeTest() {

        Configuration.browser = "edge";

        open("https://bulk-operations-svc-ps-sec-sys-cidm.apps.dev-03.us-central2.dev.sabre-gcp.com");
        element(By.id("userId")).shouldBe(Condition.visible).setValue("bulkUiAdmin");
        element(By.id("password")).setValue(new String(Base64.getDecoder().decode("SzdCS0M0Qg==")));
        element(By.id("domain")).setValue("Sabre");
        element(By.id("group")).setValue("secsys");
        $(By.id("submit")).click();
        $(By.id("submit")).shouldNotBe(Condition.visible);
        element(shadowCss("#fileInput", "vaadin-upload")).uploadFromClasspath("auto_gen_file11478176541350344393.csv");
        element(By.id("csv-validation-message")).shouldHave(Condition.exactText("File uploaded successfully."));

        System.out.println();
        WebDriverRunner.closeWebDriver();

    }

    @Test
    public void elementFirefoxTest() {

        Configuration.browser = "firefox";

        open("https://bulk-operations-svc-ps-sec-sys-cidm.apps.dev-03.us-central2.dev.sabre-gcp.com");
        element(By.id("userId")).shouldBe(Condition.visible).setValue("bulkUiAdmin");
        element(By.id("password")).setValue(new String(Base64.getDecoder().decode("SzdCS0M0Qg==")));
        element(By.id("domain")).setValue("Sabre");
        element(By.id("group")).setValue("secsys");
        $(By.id("submit")).click();
        $(By.id("submit")).shouldNotBe(Condition.visible);
        element(shadowCss("#fileInput", "vaadin-upload")).uploadFromClasspath("auto_gen_file11478176541350344393.csv");
        element(By.id("csv-validation-message")).shouldHave(Condition.exactText("File uploaded successfully."));

        System.out.println();
        WebDriverRunner.closeWebDriver();

    }
}
