package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import pages.FriendPageLocator;
import random_values.FakeData;

@DisplayName("Проверка страницы Реферальная программа")
@Tag("AllTests")
public class UseTechFriendTest extends TestBase {
    FriendPageLocator testLocators = new FriendPageLocator();
    FakeData fakeDataInfo = new FakeData();

    @ParameterizedTest(name = "Проверка хэдеров на странице")
    @Tag("FriendPageTest")
    @ValueSource(strings = {
            "О компании,Реферальная система — пригласи друга в Usetech"
    })
    public void checkForHeadersTest(String linkTitles) {
        String[] expectedTitles = linkTitles.split(",");
        testLocators.openUrlForHeaders()
                .findFirstButton()
                .checkForLinksInside(expectedTitles);
    }

    @Test
    @Tag("FriendPageTest")
    @DisplayName("Проверка cообщения об ошибке при неполном вводе данных на рефералке")
    public void checkForCareerInputTest() {
        testLocators.openUrlReferal()
                .clickOnTheRecommendButton()
                .inputName(fakeDataInfo.fullName)
                .inputYourContactInfo(fakeDataInfo.userNumber)
                .inputCandidateContactInfo(fakeDataInfo.email)
                .inputCandidateSpecialization(fakeDataInfo.randomCareer)
                .clickAcceptanceButton()
                .clickSubmitButton()
                .errorMessage();
    }
    @Test
    @Tag("FriendPageTest")
    @DisplayName("Проверка cообщения об ошибке при неполном вводе данных во вкладке Контакты")
    public void checkForInfoInputTest() {
        testLocators.openUrlContactInfo()
                .inputName(fakeDataInfo.fullName)
                .clickAcceptanceButton2()
                .clickSubmitButton()
                .errorMessage();
    }
}
