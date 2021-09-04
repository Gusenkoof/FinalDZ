import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.closeWebDriver;
import static sun.management.Agent.getText;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrangehrmliveTest extends BasePage{

    LoginPage loginPage = new LoginPage();
    UserPage userPage = new UserPage();
    EmployeePage employeePage = new EmployeePage();
    JobTitlePage jobTitlePage = new JobTitlePage();
    CandidatesPage candidatesPage = new CandidatesPage();
    AssignLeavePage assignLeavePage = new AssignLeavePage();
    DashboardPage dashboardPage = new DashboardPage();
    ProfileMenuPage profileMenuPage = new ProfileMenuPage();
    PimPage pimPage = new PimPage();


    @BeforeEach
    public void setUp(){
        Configuration.startMaximized = true;
    }

    @AfterEach
    public void tearDown(){
        closeWebDriver();
    }

    @Severity(SeverityLevel.BLOCKER)
    @Description("Тест входа на сайт под логином и паролем")
    @Feature("Логин")
    @Test
    @Order(1)
    public void loginTest(){
        loginPage.openUrl();
        loginPage.login();
        loginPage.marketplace.shouldBe(visible);
        // проверка
        Assertions.assertEquals("Marketplace", loginPage.marketplace.getValue(), "Вы зашли не на ту страницу");
    }

    @Severity(SeverityLevel.BLOCKER)
    @Description("Тест добавления нового сотрудника")
    @Feature("Добавление сотрудника")
    @Test
    @Order(2)
    public void addNewEmployeeTest(){
        loginPage.openUrl();
        loginPage.login();
        employeePage.addNewEmployee();
        Assertions.assertEquals("Aleksey Gusenkov", employeePage.nameUser.getText(), "Новый сотрудник не создался");
    }

    @Severity(SeverityLevel.BLOCKER)
    @Description("Тест добавления нового пользователя")
    @Feature("Добавление пользователя")
    @Test
    @Order(3)
    public void addNewUserTest() {
        loginPage.openUrl();
        loginPage.login();
        userPage.addNewUser();
        //проверка
        Assertions.assertEquals("Gusenkov", userPage.nameUser.getText(), "Пользователь по каким то причинам не добавился");
    }

    @Severity(SeverityLevel.BLOCKER)
    @Description("Тест добавления и удаления трех должностей")
    @Feature("Добавление и удаление должности")
    @Test
    @Order(4)
    public void addDeleteJobTitle() {
        loginPage.openUrl();
        loginPage.login();
        jobTitlePage.addNewJobTitle();
        //проверки на добовления
        Assertions.assertEquals("Archaeologist", jobTitlePage.archaeologist.getText(), "Возникла какая то ошибка");
        Assertions.assertEquals("Car mechanic", jobTitlePage.carMechanic.getText(), "Возникла какая то ошибка");
        Assertions.assertEquals("Autotester", jobTitlePage.autotester.getText(), "Возникла какая то ошибка");

        jobTitlePage.deleteJobTitle();
        //проверки на удаления
        if (jobTitlePage.archaeologist.isDisplayed()){
            System.out.println("Job Title Archaeologist не был удален");
            System.exit(1);
        } else {
            System.out.println("Job Title Archaeologist удален");
        }

        if (jobTitlePage.carMechanic.isDisplayed()){
            System.out.println("Job Title Car mechanic не был удален");
            System.exit(1);
        } else {
            System.out.println("Job Title Car mechanic удален");
        }

        if (jobTitlePage.autotester.isDisplayed()){
            System.out.println("Job Title Autotester не был удален");
            System.exit(1);
        } else {
            System.out.println("Job Title Autotester удален");
        }
    }

    @Severity(SeverityLevel.BLOCKER)
    @Description("Тест добавления кандидата")
    @Feature("Добавление кандидата")
    @Test
    @Order(5)
    public void addNewCandidatesTest() {
        loginPage.openUrl();
        loginPage.login();
        candidatesPage.addNewCandidates();
        //проверка
        Assertions.assertEquals("Vasilkov Artur", candidatesPage.nameCandidate.getText(), "Кандидат по каким то причинам не добавился");
    }

    @Severity(SeverityLevel.BLOCKER)
    @Description("Тест назначения отпуска")
    @Feature("Назначение отпуска")
    @Test
    @Order(6)
    public void assignLeaveTest() {
        loginPage.openUrl();
        loginPage.login();
        assignLeavePage.assignLeave();
        //проверка
        Assertions.assertEquals("Overlapping Leave Requests Found", assignLeavePage.assignLeaveText.getText(), "Отпуск не назначился");
    }

    @Severity(SeverityLevel.BLOCKER)
    @Description("Проверка присутствия элементов в dashboard")
    @Feature("Присутствие элементов")
    @Test
    @Order(7)
    public void dashboardTest() {
        loginPage.openUrl();
        loginPage.login();
        dashboardPage.Dashboard();
    }

    @Severity(SeverityLevel.BLOCKER)
    @Description("Проверка формы с деталями любого sales в PIM")
    @Feature("Проверка формы в PIM")
    @Test
    @Order(8)
    public void pimTest() {
        loginPage.openUrl();
        loginPage.login();
        pimPage.personalDetails();

        //Проверки
        Assertions.assertEquals("Goutam Ganesh", pimPage.goutamGaneshText.getText(), "Вы зашли на страницу не того сотрудника");
        Assertions.assertEquals("Goutam", pimPage.firstNameForm.getValue(), "Не верная фамилия");
        Assertions.assertEquals("Ganesh", pimPage.lastNameForm.getValue(),"Не верное имя");
        Assertions.assertEquals("0235", pimPage.employeeIdForm.getValue(),"Не верный ID");
        Assertions.assertEquals("1977-04-20", pimPage.birthForm.getValue(),"Не верная дата рождения");
        Assertions.assertEquals("Indian", pimPage.nationForm.getText(),"Не верная страна");
        Assertions.assertEquals("Married", pimPage.maritalStatusForm.getText(),"Не верное семейное положение");

    }

    @Severity(SeverityLevel.BLOCKER)
    @Description("Проверка прехода на страницы About и Support")
    @Feature("Проверка перхода на страницы")
    @Test
    @Order(9)
    public void aboutSupportTest() {
        loginPage.openUrl();
        loginPage.login();
        profileMenuPage.about();
        //проверка About
        Assertions.assertEquals("Company Name: OrangeHRM", profileMenuPage.aboutText.getText(), "Вы перешли на другую страницу");

        profileMenuPage.closeButton.click();
        profileMenuPage.support();
        //Проверка Support
        Assertions.assertEquals("Getting Started with OrangeHRM", profileMenuPage.supportText.getText(), "Вы перешли на другую страницу");
    }

    @Severity(SeverityLevel.BLOCKER)
    @Description("Выход из учетной записи")
    @Feature("Выход из учетки")
    @Test
    @Order(10)
    public void logOutTest() {
        loginPage.openUrl();
        loginPage.login();
        profileMenuPage.logOut();
        //проверка
        Assertions.assertEquals("Forgot your password?", profileMenuPage.logoutText.getText(), "Выход не удался");
    }

}
