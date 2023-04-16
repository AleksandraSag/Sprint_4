import config.AppConfig;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import  org.junit.After;
import org.junit.Before;
import java.net.URL;

import static org.junit.Assert.assertEquals;



public class WebTestQuestions {
    private WebDriver driver;
    private String expectedFirstAnswerText = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    private String expectedSecondAnswerText = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    private String expectedThirdAnswerText = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    private String expectedFourthAnswerText = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    private String expectedFifthAnswerText = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    private String expectedSixthAnswerText = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    private String expectedSeventhAnswerText = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    private String expectedEighthAnswerText = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";

@Before

    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.get(AppConfig.URL);
    }
//1
@Test
    public void FirstQuestionDropDownList() {
    MainPage objectMainPage = new MainPage(driver);
    objectMainPage.clickCookieButton();
    objectMainPage.clickFirstQuestionDropDownList();
    String actualFirstAnswerText = objectMainPage.getFirstAnswerText();
    assertEquals(expectedFirstAnswerText, actualFirstAnswerText);
    System.out.println(actualFirstAnswerText);
}
//2
@Test
public void SecondQuestionDropDownList() {
    MainPage objectMainPage = new MainPage(driver);
    objectMainPage.clickCookieButton();
    objectMainPage.clickSecondQuestionDropDownList();
    String actualSecondAnswerText = objectMainPage.getSecondAnswerText();
    assertEquals(expectedSecondAnswerText, actualSecondAnswerText);
    System.out.println(actualSecondAnswerText);
}
//3
@Test
public void ThirdQuestionDropDownList() {
    MainPage objectMainPage = new MainPage(driver);
    objectMainPage.clickCookieButton();
    objectMainPage.clickThirdQuestionDropDownList();
    String actualThirdAnswerText = objectMainPage.getThirdAnswerText();
    assertEquals(expectedThirdAnswerText, actualThirdAnswerText);
    System.out.println(actualThirdAnswerText);
}
//4
@Test
public void FourthQuestionDropDownList() {
    MainPage objectMainPage = new MainPage(driver);
    objectMainPage.clickCookieButton();
    objectMainPage.clickFourthQuestionDropDownList();
    String actualFourthAnswerText = objectMainPage.getFourthAnswerText();
    assertEquals(expectedFourthAnswerText, actualFourthAnswerText);
    System.out.println(actualFourthAnswerText);
}
//5
@Test
public void FifthQuestionDropDownList() {
    MainPage objectMainPage = new MainPage(driver);
    objectMainPage.clickCookieButton();
    objectMainPage.clickFifthQuestionDropDownList();
    String actualFifthAnswerText = objectMainPage.getFifthAnswerText();
    assertEquals(expectedFifthAnswerText, actualFifthAnswerText);
    System.out.println(actualFifthAnswerText);
}
//6
@Test
public void SixthQuestionDropDownList() {
    MainPage objectMainPage = new MainPage(driver);
    objectMainPage.clickCookieButton();
    objectMainPage.clickSixthQuestionDropDownList();
    String actualSixthAnswerText = objectMainPage.getSixthAnswerText();
    assertEquals(expectedSixthAnswerText, actualSixthAnswerText);
    System.out.println(actualSixthAnswerText);
}
//7
@Test
public void SeventhQuestionDropDownList() {
    MainPage objectMainPage = new MainPage(driver);
    objectMainPage.clickCookieButton();
    objectMainPage.clickSeventhQuestionDropDownList();
    String actualSeventhAnswerText = objectMainPage.getSeventhAnswerText();
    assertEquals(expectedSeventhAnswerText, actualSeventhAnswerText);
    System.out.println(actualSeventhAnswerText);
}
//8
@Test
public void EighthQuestionDropDownList() {
    MainPage objectMainPage = new MainPage(driver);
    objectMainPage.clickCookieButton();
    objectMainPage.clickEighthQuestionDropDownList();
    String actualEighthAnswerText = objectMainPage.getEighthAnswerText();
    assertEquals(expectedEighthAnswerText, actualEighthAnswerText);
    System.out.println(actualEighthAnswerText);
}
@After
    public void tearDown() {
    driver.quit();
    }
}
