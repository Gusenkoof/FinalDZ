import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class PimPage extends BasePage{
    SelenideElement subUnitList = $(By.xpath("//select[@id='empsearch_sub_unit']/option[@value='8']"));
    SelenideElement searchButton = $(By.id("searchBtn"));
    SelenideElement goutamButton = $(By.xpath("//a[text()='Goutam']"));
    SelenideElement firstNameForm = $(By.id("personal_txtEmpFirstName"));
    SelenideElement lastNameForm = $(By.id("personal_txtEmpLastName"));
    SelenideElement goutamGaneshText = $(By.xpath("//h1[text()='Goutam Ganesh']"));
    SelenideElement employeeIdForm = $(By.id("personal_txtEmployeeId"));
    SelenideElement nationForm = $(By.id("personal_cmbNation"));
    SelenideElement birthForm = $(By.id("personal_DOB"));
    SelenideElement maritalStatusForm = $(By.id("personal_cmbMarital"));


    @Step("Переход на страницу Personal Details")
    public void personalDetails(){
        pimButton.click();
        subUnitList.click();
        searchButton.click();
        goutamButton.click();

    }






}
