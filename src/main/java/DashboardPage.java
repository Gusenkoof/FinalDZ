import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.*;
public class DashboardPage extends BasePage{
    SelenideElement dashboard = $(By.xpath("//h1[text()='Dashboard']"));
    SelenideElement quickLaunch = $(By.xpath("//legend[text()='Quick Launch']"));
    SelenideElement employeeDistributionbySubunit = $(By.xpath("//legend[text()='Employee Distribution by Subunit']"));
    SelenideElement legend = $(By.xpath("//legend[text()='Legend']"));
    SelenideElement pendingLeaveRequests = $(By.xpath("//legend[text()='Pending Leave Requests']"));
    SelenideElement assignLeave = $(By.xpath("//span[text()='Assign Leave']"));
    SelenideElement leaveList = $(By.xpath("//span[text()='Leave List']"));
    SelenideElement timesheets = $(By.xpath("//span[text()='Timesheets']"));
    SelenideElement applyLeave = $(By.xpath("//span[text()='Apply Leave']"));
    SelenideElement myLeave = $(By.xpath("//span[text()='My Leave']"));
    SelenideElement myTimesheet = $(By.xpath("//span[text()='My Timesheet']"));
    SelenideElement flotOverlay = $(By.className("flot-overlay"));


    @Step("Проеряем наличие элементов")
    public void Dashboard(){

        if (dashboard.isDisplayed()){

        } else {
            System.out.println("Элемент Dashboard отстутствует");
            System.exit(1);
        }

        if (assignLeave.isDisplayed()){

        } else {
            System.out.println("Элемент Assign Leave отстутствует");
            System.exit(1);
        }

        if (leaveList.isDisplayed()){

        } else {
            System.out.println("Элемент Leave List отстутствует");
            System.exit(1);
        }

        if (timesheets.isDisplayed()){

        } else {
            System.out.println("Элемент Timesheets отстутствует");
            System.exit(1);
        }

        if (applyLeave.isDisplayed()){

        } else {
            System.out.println("Элемент Apply Leave отстутствует");
            System.exit(1);
        }

        if (myLeave.isDisplayed()){

        } else {
            System.out.println("Элемент My Leave отстутствует");
            System.exit(1);
        }

        if (myTimesheet.isDisplayed()){

        } else {
            System.out.println("Элемент My Timesheet отстутствует");
            System.exit(1);
        }

        if (quickLaunch.isDisplayed()){

        } else {
            System.out.println("Элемент Quick Launch отстутствует");
            System.exit(1);
        }

        if (employeeDistributionbySubunit.isDisplayed()){

        } else {
            System.out.println("Элемент Employee Distribution by Subunit отстутствует");
            System.exit(1);
        }

        if (legend.isDisplayed()){

        } else {
            System.out.println("Элемент Legend отстутствует");
            System.exit(1);
        }

        if (pendingLeaveRequests.isDisplayed()){

        } else {
            System.out.println("Элемент Pending Leave Requests отсутствует");
            System.exit(1);
        }

        if (flotOverlay.isDisplayed()){

        } else {
            System.out.println("Элемент flotOverlay отсутствует");
            System.exit(1);
        }


    }
}
