package githubtest_21;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TestSoft2 {
    @BeforeAll
    static void beforeAll(){
        baseUrl="https://github.com/";
        Configuration.browserSize="1920x1080";
        Configuration.pageLoadStrategy="eager";
    }

    @Test
    void enterpriseSoftTest(){
        open(baseUrl);

        $(".header-menu-wrapper").$(byText("Solutions")).hover();
        $(".border-bottom").$(byText("Enterprise")).click();
        $(".application-main").shouldHave(text("Build like the best"));
    }
}
