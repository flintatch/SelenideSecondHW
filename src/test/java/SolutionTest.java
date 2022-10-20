import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SolutionTest {

    @Test
    void GitHubSolutionTest() {
        open("https://github.com/");
        $(byText("Solutions")).click();
        $(byText("Enterprise")).click();
        $("h1").shouldHave(text("Build like the best"));
    }
}
