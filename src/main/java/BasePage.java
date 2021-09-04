import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BasePage {

    SelenideElement adminButton = $(By.xpath("//b[text()='Admin']"));
    SelenideElement addButton = $(By.id("btnAdd"));
    SelenideElement saveButton = $(By.id("btnSave"));
    SelenideElement backButton =$(By.id("btnBack"));
    SelenideElement deleteButton = $(By.id("btnDelete"));
    SelenideElement pimButton = $(By.xpath("//b[text()='PIM']"));
    SelenideElement recruitmentButton = $(By.xpath("//b[text()='Recruitment']"));
    SelenideElement leaveButton = $(By.xpath("//b[text()='Leave']"));

}
