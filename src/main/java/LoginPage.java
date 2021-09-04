import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {

    SelenideElement userNameForm = $(By.id("txtUsername"));
    SelenideElement passwordForm = $(By.id("txtPassword"));
    SelenideElement loginButton = $(By.id("btnLogin"));
    SelenideElement marketplace = $(By.id("MP_link"));

    @Step("Открываем страницу сайта")
    public void openUrl(){
        open("https://opensource-demo.orangehrmlive.com/");
    }

    @Step("Вводим логин и пароль")
    public void login(){
        userNameForm.sendKeys("Admin");
        passwordForm.sendKeys("admin123");
        loginButton.click();
    }


}
