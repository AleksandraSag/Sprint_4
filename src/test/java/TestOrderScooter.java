import org.hamcrest.MatcherAssert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.hamcrest.CoreMatchers.startsWith;

public class TestOrderScooter {
    private WebDriver driver;
    private String expectedTextSuccessfulOrder = "Заказ оформлен";

 @Before
    public void setUp() {
        /* Для Mozilla Firefox */
       //FirefoxOptions options = new FirefoxOptions();
       //driver = new FirefoxDriver(options);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver (options);
        driver.get("https://qa-scooter.praktikum-services.ru/");
 }
    @Test
    public void firstOrder() {
        MainPage objectMainPage = new MainPage(driver);
        UserOrderForm objectUserOrderForm = new UserOrderForm(driver);
        OrderForm objectOrderForm = new OrderForm(driver);
        AcceptModal objectAcceptModal = new AcceptModal(driver);

        objectMainPage.clickCookieButton();
        objectMainPage.clickTopButtonOfOrder();
        objectUserOrderForm.setName("Иван");
        objectUserOrderForm.setSurname("Тапочкин");
        objectUserOrderForm.setAddress("Лужники");
        objectUserOrderForm.setPhone("+79854443322");
        objectUserOrderForm.onClickListOfMetro();
        objectUserOrderForm.onClickStation();
        objectUserOrderForm.onDone();
        objectOrderForm.onClickDate();
        objectOrderForm.onClickCalendar();
        objectOrderForm.onClickListPeriod();
        objectOrderForm.onClickPeriod();
        objectOrderForm.onDone();
        objectOrderForm.onDoneModal();
        String actualTextSuccessfulOrder = objectAcceptModal.getTitleAcceptModel();
        MatcherAssert.assertThat(actualTextSuccessfulOrder, startsWith(expectedTextSuccessfulOrder));
        System.out.println(actualTextSuccessfulOrder);
    }
 @Test
    public void secondOrder() {
        MainPage objectMainPage = new MainPage(driver);
        UserOrderForm objectUserOrderForm = new UserOrderForm(driver);
        OrderForm objectOrderForm = new OrderForm(driver);
        AcceptModal objectAcceptModal = new AcceptModal(driver);

        objectMainPage.clickCookieButton();

        new WebDriverWait (driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#root > div > div > div.Home_ThirdPart__LSTEE > div.Home_RoadMap__2tal_ > div.Home_FinishButton__1_cWm > button")));
        WebElement element = driver.findElement(By.cssSelector("#root > div > div > div.Home_ThirdPart__LSTEE > div.Home_RoadMap__2tal_ > div.Home_FinishButton__1_cWm > button"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);

        objectMainPage.clickBottomButtonOfOrder();
        objectUserOrderForm.setName("Вини");
        objectUserOrderForm.setSurname("Потапов");
        objectUserOrderForm.setAddress("Сретенка");
        objectUserOrderForm.setPhone("+79257775511");
        objectUserOrderForm.onClickListOfMetro();
        objectUserOrderForm.onClickStation();
        objectUserOrderForm.onDone();
        objectOrderForm.onClickDate();
        objectOrderForm.onClickCalendar();
        objectOrderForm.onClickListPeriod();
        objectOrderForm.onClickPeriod();
        objectOrderForm.onDone();
        objectOrderForm.onDoneModal();
        String actualTextSuccessfulOrder = objectAcceptModal.getTitleAcceptModel();
        MatcherAssert.assertThat(actualTextSuccessfulOrder, startsWith(expectedTextSuccessfulOrder));
        System.out.println(actualTextSuccessfulOrder);
    }
@After
    public void tearDown() {
     driver.quit();
    }
}


