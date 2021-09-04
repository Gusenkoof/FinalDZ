import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CandidatesPage extends BasePage{

    SelenideElement candidatesButton = $(By.id("menu_recruitment_viewCandidates"));
    SelenideElement candidateFirstNameForm = $(By.id("addCandidate_firstName"));
    SelenideElement candidateLastNameForm = $(By.id("addCandidate_lastName"));
    SelenideElement candidateEmailForm = $(By.id("addCandidate_email"));
    SelenideElement candidateContactForm = $(By.id("addCandidate_contactNo"));
    SelenideElement jobVacancy = $(By.xpath("//option[text()='Senior QA Lead']"));
    SelenideElement addResumeButton = $(By.xpath("//input[@type='file']"));
    SelenideElement keywordsForm = $(By.id("addCandidate_keyWords"));
    SelenideElement commentForm = $(By.id("addCandidate_comment"));
    SelenideElement dateForm = $(By.id("addCandidate_appliedDate"));
    SelenideElement nameCandidate = $(By.xpath("//a[text()='Vasilkov  Artur']"));


    @Step("Добавляем нового кандидата")
    public void addNewCandidates(){
        recruitmentButton.click();
        candidatesButton.click();
        addButton.click();
        candidateFirstNameForm.sendKeys("Vasilkov");
        candidateLastNameForm.sendKeys("Artur");
        candidateEmailForm.sendKeys("Hlam148@yandex.ru");
        candidateContactForm.sendKeys("+375291239876");
        jobVacancy.click();
        addResumeButton.sendKeys("C:\\Users\\ALEX\\IdeaProjects\\FinalDZ\\src\\main\\resources\\resume.pdf");
        keywordsForm.sendKeys("QA");
        commentForm.sendKeys("Friend");
        dateForm.clear();
        dateForm.sendKeys("2021-08-25");
        saveButton.click();
        backButton.click();
    }
}
