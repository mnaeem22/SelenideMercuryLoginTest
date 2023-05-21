import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class MercuryLoginTest {

    @Test
    public void mercuryLoginTest() {
        open("https://demo.guru99.com/test/newtours");
        $(By.name("userName")).setValue("test");
        $(By.name("password")).setValue("test");
        $(By.name("submit")).click();
        $("h3").shouldHave(text("Login Successfully"));


    }
}
