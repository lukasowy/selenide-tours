package tours.inter;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import static com.codeborne.selenide.Selenide.element;
import static com.codeborne.selenide.Selenide.elements;
import static com.codeborne.selenide.Selenide.open;

public class SeleniumMain {
//https://moja.nowaera.pl
//Username: StudentNE@wp.pl
//Password: NowaEra2019

    public static void main(String[] args) {

        open("https://moja.nowaera.pl");

        element(By.id("user-form-login-email")).setValue("StudentNE@wp.pl").shouldBe(Condition.visible, Duration.ofSeconds(30));
        element(By.id("user-form-login-password")).setValue("NowaEra2019");
        element(By.id("user-form-login-submit")).click();
        element(By.id("user-form-login-submit")).shouldNotBe(Condition.visible, Duration.ofSeconds(30));

        element(By.tagName("h2")).shouldHave(Condition.exactText("Moje serwisy"));

        List<String> stringList = elements(By.className("service__description--title"))
                .texts()
                .stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(stringList);

    }
}
