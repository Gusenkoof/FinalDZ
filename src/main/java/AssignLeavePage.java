import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class AssignLeavePage extends BasePage{
    SelenideElement assignLeaveButton = $(By.id("menu_leave_assignLeave"));
    SelenideElement employeeNameForm = $(By.id("assignleave_txtEmployee_empName"));
    SelenideElement leaveTypeList = $(By.xpath("//option[text()='CAN - Personal']"));
    SelenideElement fromDateForm = $(By.id("assignleave_txtFromDate"));
    SelenideElement toDateForm = $(By.id("assignleave_txtToDate"));
    SelenideElement partialDaysList = $(By.xpath("//option[text()='All Days']"));
    SelenideElement commentForm = $(By.id("assignleave_txtComment"));
    SelenideElement assignLeaveText = $(By.xpath("//h1[text()='Overlapping Leave Requests Found']"));
    SelenideElement assignButton =$(By.id("assignBtn"));
    SelenideElement confirmOkButton = $(By.id("confirmOkButton"));

    @Step("Назначаем отпуск")
    public void assignLeave(){
        leaveButton.click();
        assignLeaveButton.click();

        if (employeeNameForm.isDisplayed()){
            employeeNameForm.sendKeys("Aleksey Gusenkov");
        } else {
            System.out.println("Форма Employee Name не отображается");
            System.exit(1);
        }

        if (leaveTypeList.isDisplayed()){
            leaveTypeList.click();
        } else {
            System.out.println("Список Leave Type не отображается");
            System.exit(1);
        }

        if (fromDateForm.isDisplayed()){
            fromDateForm.clear();
            fromDateForm.sendKeys("2021-09-06");
        } else {
            System.out.println("Форма From Date не отображается");
            System.exit(1);
        }

        if (toDateForm.isDisplayed()){
            toDateForm.clear();
            toDateForm.sendKeys("2021-10-20");
        } else {
            System.out.println("Форма To Date не отображается");
            System.exit(1);
        }

        if (commentForm.isDisplayed()){
            commentForm.sendKeys("If necessary, withdraw from vacation");
        } else {
            System.out.println("Форма Comment не отображается");
            System.exit(1);
        }

        assignButton.pressEnter();
        confirmOkButton.click();
    }
}
