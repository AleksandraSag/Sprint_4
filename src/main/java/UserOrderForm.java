import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserOrderForm {
    private WebDriver driver;
    private By name = By.xpath(".//input[@placeholder='* Имя']");
    private By surname  = By.xpath(".//input[@placeholder='* Фамилия']");
    private By address  = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    private By listOfMetro  = By.xpath(".//input[@class='select-search__input']");
    private By chooseStation  = By.xpath(".//button[@value='8']");
    private By phone  = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    private By done = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

    public UserOrderForm(WebDriver driver) {
        this.driver = driver;
    }
    public void setName (String userName) {
        driver.findElement(name).sendKeys(userName);
    }
    public void setSurname (String userSurname) {
        driver.findElement(surname).sendKeys(userSurname);
    }
    public void setAddress (String userAddress) {
        driver.findElement(address).sendKeys(userAddress);
    }
    public void onClickListOfMetro() {
        driver.findElement(listOfMetro).click();
    }
    public void onClickStation() {
        driver.findElement(chooseStation).click();
    }
    public void setPhone (String userPoneNumber) {
        driver.findElement(phone).sendKeys(userPoneNumber);
    }
    public void onDone() {
        driver.findElement(done).click();
    }
}
