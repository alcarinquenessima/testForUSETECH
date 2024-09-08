package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.MainPageLocators;
import static io.qameta.allure.Allure.step;

@Tag("AllTests")
public class UseTechMainPageTest extends TestBaseMainPage {
    MainPageLocators testLocators = new MainPageLocators();

    @Test
    @Tag("MainPageTest")
    @DisplayName("Проверка наполнения Главной страницы")
    public void checkForHeaders() {
        step("Проверка ссылок в хэдере и соответствие открывающихся страниц", () -> {
            testLocators.openPage()
                    .checkingTheFirstLink()
                    .checkingTheSecondLink()
                    .checkingTheThirdLink()
                    .checkingTheFourthLink()
                    .checkingTheFifthLink()
                    .checkingTheSixthLink()
                    .checkingTheSeventhLink()
                    .checkingTheEightLink()
                    .checkingTheNinthLink();
        });

    }

}
