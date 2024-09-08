package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import pages.FriendPageLocator;
import randomValuesForTests.fakeData;

@DisplayName("Проверка страницы Реферальная программа")
@Tag("AllTests")
public class UseTechFriendTest extends TestBaseFriendPage {
    FriendPageLocator testLocators = new FriendPageLocator();
    fakeData fakeDataInfo = new fakeData();

    @ParameterizedTest(name = "Проверка хэдеров на странице")
    @Tag("FriendPageTest")
    @ValueSource(strings = {
            "О компании,Реферальная система — пригласи друга в Usetech"
    })
    public void checkForHeaders(String linkTitles) {
        String[] expectedTitles = linkTitles.split(",");
        testLocators.openUrlForHeaders()
                .findFirstButton()
                .checkForLinksInside(expectedTitles);
    }

    @Test
    @Tag("FriendPageTest")
    @DisplayName("Проверка cообщения об ошибке при неполном вводе данных на рефералке")
    public void checkForCareerInput() {
        testLocators.openUrlReferal()
                .clickOnTheRecommendButton()
                .inputName(fakeDataInfo.fullName)
                .inputYourContactInfo(fakeDataInfo.userNumber)
                .inputCandidateContactInfo(fakeDataInfo.email)
                .inputcandidateSpecialization(fakeDataInfo.randomCareer)
                .clickAcceptanceButton()
                .clickSubmitButton()
                .errorMessage();
    }
    @Test
    @Tag("FriendPageTest")
    @DisplayName("Проверка cообщения об ошибке при неполном вводе данных во вкладке Контакты")
    public void checkForInfoInput() {
        testLocators.openUrlContactInfo()
                .inputName(fakeDataInfo.fullName)
                .clickAcceptanceButton2()
                .clickSubmitButton()
                .errorMessage();
    }
}
