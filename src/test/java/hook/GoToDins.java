package hook;

import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GoToDins {
    @BeforeEach
    public void setUp(){
        open("https://habr.com/ru/");
        $(byXpath("//*[@id=\"search-form-btn\"]")).click();
        $(byXpath("//*[@id=\"search-form-field\"]")).setValue("Dins");
        $(byXpath("//*[@id=\"search-form-field\"]")).sendKeys(Keys.ENTER);
        $(byXpath("//*[contains(text(), 'Хабы и компании')]")).click();
        $(byXpath("//*[contains(text(), 'DINS')]")).click();
    }
}
