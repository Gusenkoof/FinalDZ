import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class ProfileMenuPage {
    SelenideElement welcomeButton = $(By.id("welcome"));
    SelenideElement logoutButton = $(By.xpath("//a[text()='Logout']"));
    SelenideElement aboutButton = $(By.id("aboutDisplayLink"));
    SelenideElement supportButton = $(By.xpath("//a[text()='Support']"));
    SelenideElement logoutText = $(By.xpath("//a[text()='Forgot your password?']"));
    SelenideElement aboutText = $(By.xpath("//p[text()='Company Name: OrangeHRM']"));
    SelenideElement supportText = $(By.xpath("//h2[text()='Getting Started with OrangeHRM']"));
    SelenideElement closeButton = $(By.className("close"));

    @Step("Выход из учетной записи")
    public void logOut(){
        welcomeButton.click();
        logoutButton.click();
    }

    @Step("Переход на страницу About")
    public void about(){
        welcomeButton.click();
        aboutButton.click();
    }

    @Step("Переход на страницу Support")
    public void support(){
        supportButton.click();
    }

}
