package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.url;
import static org.assertj.core.api.Assertions.assertThat;

public class MainPageLocators {
    private final SelenideElement titleOfThe1stPage = $("#menu-item-15");
    private final SelenideElement titleOfThe2ndPage = $("#menu-item-452");
    private final SelenideElement titleOfThe3dPage = $("#menu-item-640");
    private final SelenideElement titleOfThe4thPage = $("#menu-item-195");
    private final SelenideElement titleOfThe5thPage = $("#menu-item-418");
    private final SelenideElement titleOfThe6thPage = $("#menu-item-203");
    private final SelenideElement titleOfThe7thPage = $("#menu-item-14");
    private final SelenideElement headerOfThe7thPage = $(".home-filter__left-title");
    private final SelenideElement titleOfThe8thPage = $("#menu-item-1081");
    private final SelenideElement firstProduct = $(".usebus h2");
    private final SelenideElement secondProduct = $(".octopus h2");
    private final SelenideElement thirdProduct = $(".tealhr h2");
    private final SelenideElement titleOfThe9thPage = $("#menu-item-133");
    private final String expectedUrl = "https://habr.com/ru/companies/usetech/articles/";
    private final SelenideElement headerOfTheLink = $("h1");





    @Step("Открываем главную страницу")
    public MainPageLocators openPage() {
        open("");
        return this;
    }

    @Step("Проверка 1 ссылки")
    public MainPageLocators checkingTheFirstLink(){
        titleOfThe1stPage.click();
        headerOfTheLink.shouldHave((Condition.text("Заказная разработка и сопровождение программного обеспечения")));
        return this;
    }
    @Step("Проверка 2 ссылки")
    public MainPageLocators checkingTheSecondLink(){
        titleOfThe2ndPage.click();
        headerOfTheLink.shouldHave((Condition.text("Новости")));
        return this;
    }
    @Step("Проверка 3 ссылки")
    public MainPageLocators checkingTheThirdLink(){
        titleOfThe3dPage.click();
        headerOfTheLink.shouldHave((Condition.text("Услуги")));
        return this;
    }
    @Step("Проверка 4 ссылки")
    public MainPageLocators checkingTheFourthLink(){
        titleOfThe4thPage.click();
        headerOfTheLink.shouldHave((Condition.text("Отрасли")));
        return this;
    }
    @Step("Проверка 5 ссылки")
    public MainPageLocators checkingTheFifthLink(){
        titleOfThe5thPage.click();
        headerOfTheLink.shouldHave((Condition.text("Награды")));
        return this;
    }
    @Step("Проверка 6 ссылки")
    public MainPageLocators checkingTheSixthLink(){
        titleOfThe6thPage.click();
        headerOfTheLink.shouldHave((Condition.text("Контакты")));
        return this;
    }
    @Step("Проверка 7 ссылки")
    public MainPageLocators checkingTheSeventhLink(){
        titleOfThe7thPage.click();
        headerOfThe7thPage.shouldBe(visible);
        headerOfThe7thPage.shouldHave((Condition.text("Поиск вакансий")));
        open("");
        return this;
    }
    @Step("Проверка 8 ссылки")
    public MainPageLocators checkingTheEightLink(){
        titleOfThe8thPage.click();
        firstProduct.shouldHave((Condition.text("UseBus")));
        secondProduct.shouldHave((Condition.text("Octopus")));
        thirdProduct.shouldHave((Condition.text("Teal HR")));
        open("");
        return this;
    }
    @Step("Проверка 9 ссылки")
    public void checkingTheNinthLink(){
        titleOfThe9thPage.click();
        assertThat(url()).isEqualTo(expectedUrl);
    }

}
