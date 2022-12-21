import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.conditions.Visible;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
public class TextBoxTests {
    @BeforeAll
    static void beforeall() {
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void fillFormTest() {

        open("https://demoqa.com/text-box");

        $("#userName").setValue("Lev");
        $("#userEmail").setValue("Zotkin@mail.ru");
        $("#currentAddress").setValue("Adres1");
        $("#permanentAddress").setValue("Adres2");
        $("#submit").click();

        $("#output").shouldBe(Condition.visible);

        $("#output #name").shouldHave(text("Lev"));
        $("#output #email").shouldHave(text("Zotkin@mail.ru"));
        $("#output #currentAddress").shouldHave(text("Adres1"));
        $("#output #permanentAddress").shouldHave(text("Adres2"));
    }
}
