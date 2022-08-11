package tours;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.util.Base64;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.element;
import static com.codeborne.selenide.Selenide.elements;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.screenshot;


public class ElementsCollectionTest {

    @Test
    void elementCollectionTest() {
        Configuration.timeout = 5000;


        open("http://bulk-operations-svc-ps-sec-sys-cidm.apps.dev-03.us-central2.dev.sabre-gcp.com/");
        element(By.id("userId")).shouldBe(Condition.visible).setValue("bulkUiAdmin");
        element(By.id("password")).setValue(new String(Base64.getDecoder().decode("SzdCS0M0Qg==")));
        element(By.id("domain")).setValue("Sabre");
        SelenideElement group = element(By.id("group"));
        group.setValue("secsys");
        $(By.id("submit")).click();
        $(By.id("submit")).shouldNotBe(Condition.visible);


        elements(By.className("spark-menu__list-link")).findBy(Condition.text("Submissions")).shouldBe(Condition.visible).click();

        screenshot("test4321");
        System.out.println();
    }
}
