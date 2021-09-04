import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class EmployeePage extends BasePage{
    SelenideElement addEmployeeButton = $(By.id("menu_pim_addEmployee"));
    SelenideElement firstNameForm = $(By.id("firstName"));
    SelenideElement lastNameForm = $(By.id("lastName"));
    SelenideElement nameUser = $(By.xpath("//h1[text()='Aleksey Gusenkov']"));



    @Step("Добавляем нового сотрудника")
    public void addNewEmployee(){
        pimButton.click();
        addEmployeeButton.click();
        firstNameForm.sendKeys("Aleksey");
        lastNameForm.sendKeys("Gusenkov");
        saveButton.click();
    }
}
