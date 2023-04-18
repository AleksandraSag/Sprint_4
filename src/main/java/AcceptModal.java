import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AcceptModal {
    private WebDriver driver;
    private By modalAccept = By.cssSelector(".Order_ModalHeader__3FDaJ");
    public AcceptModal(WebDriver driver) {
        this.driver = driver;
    }
    public String getTitleAcceptModel() {
        return driver.findElement(modalAccept).getText();
    }
}

