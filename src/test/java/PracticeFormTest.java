import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PracticeFormTest {

    @BeforeAll
    static void preconditionTests() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void practiceFormTest() {
        open("/automation-practice-form");
        $(".practice-form-wrapper .text-center").shouldHave(text("Practice Form"));
        $("#firstName").setValue("Misha");
        $("#lastName").setValue("Krug");
        $("#userEmail").setValue("Krug33@mail.ru");
        $(byText("Male")).click();
        $("#userNumber").setValue("9172502525");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").click();
        $(byText("October")).click();
        $(".react-datepicker__year-select").click();
        $(byText("1998")).click();
        $(".react-datepicker__year-select").click();
        $(".react-datepicker__day--016").click();
        $("#subjectsInput").setValue("English").pressEnter();
        $("#subjectsInput").setValue("Maths").pressEnter();
        $(byText("Sports")).click();
        $(byText("Reading")).click();
        $(byText("Music")).click();
        $("#uploadPicture").uploadFromClasspath("img.jpg");
        $("#currentAddress").setValue("Tver");
        $("#state").click();
        $(byText("Rajasthan")).click();
        $("#city").click();
        $(byText("Jaiselmer")).click();
        $("#submit").click();
        $(".modal-content").shouldBe(visible);


    }
}
