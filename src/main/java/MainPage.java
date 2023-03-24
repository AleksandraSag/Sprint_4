import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private WebDriver driver;

    public MainPage ( WebDriver driver) {

        this.driver = driver;
    }
    private By cookieButton = By.id("rcc-confirm-button");

    public void clickCookieButton() {

        driver.findElement(cookieButton).click();
    }
    //1
    private By firstQuestionDropDownList = By.id ("accordion__heading-0");
    private By firstAnswerText = By.xpath(".//div[@id='accordion__panel-0']/p");

    public void clickFirstQuestionDropDownList() {

        driver.findElement(firstQuestionDropDownList).click();
    }
    public String getFirstAnswerText() {

        return driver.findElement(firstAnswerText).getText();
    }
    //2
    private By secondQuestionDropDownList = By.id("accordion__heading-1");
    private By secondAnswerText = By.xpath(".//div[@id='accordion__panel-1']/p");

    public void clickSecondQuestionDropDownList() {

        driver.findElement(secondQuestionDropDownList).click();
    }

    public String getSecondAnswerText() {

        return driver.findElement(secondAnswerText).getText();
    }
    //3
    private By thirdQuestionDropDownList = By.id("accordion__heading-2");
    private By thirdAnswerText = By.xpath(".//div[@id='accordion__panel-2']/p");

    public void clickThirdQuestionDropDownList() {

        driver.findElement(thirdQuestionDropDownList).click();
    }

    public String getThirdAnswerText() {

        return driver.findElement(thirdAnswerText).getText();
    }
    //4
    private By fourthQuestionDropDownList = By.id("accordion__heading-3");
    private By fourthAnswerText = By.xpath(".//div[@id='accordion__panel-3']/p");

    public void clickFourthQuestionDropDownList() {

        driver.findElement(fourthQuestionDropDownList).click();
    }

    public String getFourthAnswerText() {

        return driver.findElement(fourthAnswerText).getText();
    }
    //5
    private By fifthQuestionDropDownList = By.id("accordion__heading-4");
    private By fifthAnswerText = By.xpath(".//div[@id='accordion__panel-4']/p");

    public void clickFifthQuestionDropDownList() {

        driver.findElement(fifthQuestionDropDownList).click();
    }

    public String getFifthAnswerText() {

        return driver.findElement(fifthAnswerText).getText();
    }
    //6
    private By sixthQuestionDropDownList = By.id("accordion__heading-5");
    private By sixthAnswerText = By.xpath(".//div[@id='accordion__panel-5']/p");

    public void clickSixthQuestionDropDownList() {

        driver.findElement(sixthQuestionDropDownList).click();
    }

    public String getSixthAnswerText() {

        return driver.findElement(sixthAnswerText).getText();
    }
    //7
    private By seventhQuestionDropDownList = By.id("accordion__heading-6");
    private By seventhAnswerText = By.xpath(".//div[@id='accordion__panel-6']/p");

    public void clickSeventhQuestionDropDownList() {

        driver.findElement(seventhQuestionDropDownList).click();
    }

    public String getSeventhAnswerText() {

        return driver.findElement(seventhAnswerText).getText();
    }
    //8
    private By eighthQuestionDropDownList = By.id("accordion__heading-7");
    private By eighthAnswerText = By.xpath(".//div[@id='accordion__panel-7']/p");

    public void clickEighthQuestionDropDownList() {

        driver.findElement(eighthQuestionDropDownList).click();
    }

    public String getEighthAnswerText() {

        return driver.findElement(eighthAnswerText).getText();
    }
    private By TopButtonOfOrder = By.className("Button_Button__ra12g");

    public void clickTopButtonOfOrder() {

        driver.findElement(TopButtonOfOrder).click();
    }

    private By BottomButtonOfOrder = By.cssSelector("#root > div > div > div.Home_ThirdPart__LSTEE > div.Home_RoadMap__2tal_ > div.Home_FinishButton__1_cWm > button");

    public void clickBottomButtonOfOrder() {

        driver.findElement(BottomButtonOfOrder).click();
    }
}
