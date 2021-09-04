import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

public class JobTitlePage extends BasePage{
    SelenideElement jobButton = $(By.id("menu_admin_Job"));
    SelenideElement jobTitleButton = $(By.id("menu_admin_viewJobTitleList"));
    SelenideElement jobTitleForm = $(By.id("jobTitle_jobTitle"));
    SelenideElement jobDescriptionForm = $(By.id("jobTitle_jobDescription"));
    SelenideElement archaeologist = $(By.xpath("//a[text()='Archaeologist']"));
    SelenideElement checkBoxArchaeologist = $(By.xpath("//a[text()='Archaeologist']/../..//input[@type= 'checkbox']"));
    SelenideElement dialogDeleteBtn = $(By.id("dialogDeleteBtn"));
    SelenideElement carMechanic = $(By.xpath("//a[text()='Car mechanic']"));
    SelenideElement checkBoxMechanic = $(By.xpath("//a[text()='Car mechanic']/../..//input[@type= 'checkbox']"));
    SelenideElement autotester = $(By.xpath("//a[text()='Autotester']"));
    SelenideElement checkBoxAutotester = $(By.xpath("//a[text()='Autotester']/../..//input[@type= 'checkbox']"));

    @Step("Добавляем новые должности")
    public void addNewJobTitle(){
        adminButton.click();
        jobButton.click();
        jobTitleButton.click();

        //Создаем первый Job Titles
        addButton.click();
        jobTitleForm.sendKeys("Archaeologist");
        jobDescriptionForm.sendKeys("History");
        saveButton.click();
        //Создаем второй Job Titles
        addButton.click();
        jobTitleForm.sendKeys("Car mechanic");
        jobDescriptionForm.sendKeys("Mechanic");
        saveButton.click();
        //Создаем третий Job Titles
        addButton.click();
        jobTitleForm.sendKeys("Autotester");
        jobDescriptionForm.sendKeys("Autotester");
        saveButton.click();
    }

    @Step("Удаляем должности")
    public void deleteJobTitle(){
        //удаляем первый Job Titles
        checkBoxArchaeologist.click();
        deleteButton.click();
        dialogDeleteBtn.click();
        //удаляем второй Job Titles
        checkBoxMechanic.click();
        deleteButton.click();
        dialogDeleteBtn.click();
        //удаляем третий Job Titles
        checkBoxAutotester.click();
        deleteButton.click();
        dialogDeleteBtn.click();
    }
}
