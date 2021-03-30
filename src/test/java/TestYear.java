import hook.GoToDins;
import org.junit.jupiter.api.Test;
import page.ProfilePage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class TestYear extends GoToDins {
    ProfilePage profilePage = new ProfilePage();
    @Test
    public void testYear(){

        $(byXpath(profilePage.xpathYear)).shouldHave(text("1998 год"));

        $(byXpath(profilePage.xpathSettingsLanguage)).click();
        profilePage.switchToEnglishLanguage();

        $(byXpath(profilePage.xpathYear)).shouldHave(text("Since 1998"));
    }
}
