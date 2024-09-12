package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.MainPageLocators;
import static io.qameta.allure.Allure.step;

@DisplayName("Проверка наполнения Главной страницы")
@Tag("AllTests")
public class UseTechMainPageTest extends TestBase {
    MainPageLocators testLocators = new MainPageLocators();

    @Test
    @Tag("MainPageTest")
    @DisplayName("Проверка ссылок в хэдере и соответствие открывающихся страниц")
    public void checkForHeadersTest() {
        step("Проверка ссылок", () -> {
            testLocators.openPage()
                    .checkTheFirstLink()
                    .checkTheSecondLink()
                    .checkTheThirdLink()
                    .checkTheFourthLink()
                    .checkTheFifthLink()
                    .checkTheSixthLink()
                    .checkTheSeventhLink()
                    .checkTheEightLink()
                    .checkTheNinthLink();
        });

    }

}
