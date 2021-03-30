package page;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class ProfilePage {
    public String xpathYear = "(//*[contains(@class, 'defination-list__value')])[1]";
    public String xpathSettingsLanguage = "//a[contains(@class, \"js-show_lang_settings\")]";

    public void switchToEnglishLanguage(){
        $(byXpath("(//fieldset/div/span/label)[2]")).click();
        if($(byXpath("(//fieldset/div/span/input)[3]")).isSelected()){
            $(byXpath("(//fieldset/div/span/label)[3]")).click();
        }
        if(!$(byXpath("(//fieldset/div/span/input)[4]")).isSelected()){
            $(byXpath("(//fieldset/div/span/label)[4]")).click();
        }
        $(byXpath("//*[@id=\"lang-settings-form\"]/div/button")).click();
    }

}
