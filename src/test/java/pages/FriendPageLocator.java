package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class FriendPageLocator {
    private final SelenideElement recommendFriendButton = $("a[href='#send-form'].btn.btn-success.btn-top");
    private final SelenideElement inputNameInfo = $("input[name='your-name']");
    private final SelenideElement contactInfo = $("input[name='your-contact']");
    private final SelenideElement candidateContactInfo = $("input[name='candidate-contact']");
    private final SelenideElement candidateSpecialization = $("input[name='specialization']");
    private final SelenideElement checkboxButton = $("input[type='checkbox']");
    private final SelenideElement checkboxButton2 = $(".wpcf7-list-item-label");
    private final SelenideElement submitButton = $("input[type='submit']");
    private final SelenideElement header1 = $("#menu-item-16507");
    private final SelenideElement header2 = $("#menu-item-16506");
    private final SelenideElement firstButtonHeader = $("#menu-item-1322");

    public FriendPageLocator openUrlReferal() {
        open("bonus/#send-form");
        return this;
    }
    public FriendPageLocator openUrlContactInfo(){
        open("contacts/");
        return this;
    }
    public FriendPageLocator clickOnTheRecommendButton() {
        recommendFriendButton.click();
        return this;
    }
    public FriendPageLocator inputName (String value){
        inputNameInfo.click();
        inputNameInfo.setValue(value);
        return this;
    }
    public FriendPageLocator inputYourContactInfo (String value){
        contactInfo.click();
        contactInfo.setValue(value);
        return this;
    }
    public FriendPageLocator inputCandidateContactInfo (String value){
        candidateContactInfo.click();
        candidateContactInfo.setValue(value);
        return this;
    }
    public FriendPageLocator inputcandidateSpecialization (String value){
        candidateSpecialization.click();
        candidateSpecialization.setValue(value);
        return this;
    }
    public FriendPageLocator clickAcceptanceButton(){
        checkboxButton.click();
        return this;
    }
    public FriendPageLocator clickAcceptanceButton2(){
        checkboxButton2.click();
        return this;
    }
    public FriendPageLocator clickSubmitButton(){
        submitButton.click();
        return this;
    }
    public void errorMessage (){
        $("body").shouldHave(text("Одно или несколько полей содержат ошибочные данные. " +
                "Пожалуйста, проверьте их и попробуйте ещё раз."));
    }
    public FriendPageLocator openUrlForHeaders() {
        open("");
        return this;
    }
    public FriendPageLocator findFirstButton () {
        firstButtonHeader.click();
        return this;
    }
    public void checkForLinksInside(String[] expectedTitles){
        header1.shouldHave(Condition.text(expectedTitles[0]));
        header2.shouldHave(Condition.text(expectedTitles[1]));
    }

}
