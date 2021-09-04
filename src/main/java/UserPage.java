import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
public class UserPage extends BasePage{

    SelenideElement employeeNameForm = $(By.id("systemUser_employeeName_empName"));
    SelenideElement usernameForm = $(By.id("systemUser_userName"));
    SelenideElement passwordForm = $(By.id("systemUser_password"));
    SelenideElement confirmPasswordForm = $(By.id("systemUser_confirmPassword"));
    SelenideElement nameUser = $(By.xpath("//a[text()='Gusenkov']"));


    @Step("Добовляем ногового пользователя")
    public void addNewUser(){
        adminButton.click();
        addButton.click();

        if (employeeNameForm.isDisplayed()){
            employeeNameForm.sendKeys("Aleksey Gusenkov");
        } else {
            System.out.println("Поле Employee Name не отображается");
            System.exit(1);
        }

        if (usernameForm.isDisplayed()){
            usernameForm.sendKeys("Gusenkov");
        } else {
            System.out.println("Поле Username не отображается");
            System.exit(1);
        }

        if (passwordForm.isDisplayed()){
            passwordForm.sendKeys("19860510");
        } else {
            System.out.println("Поле Password не отображается");
            System.exit(1);
        }

        if (confirmPasswordForm.isDisplayed()){
            confirmPasswordForm.sendKeys("19860510");
        } else {
            System.out.println("Поле Confirm password не отображается");
            System.exit(1);
        }

        saveButton.click();

    }

}
