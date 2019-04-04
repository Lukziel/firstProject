import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MainPage {
    WebDriver driver;


    @FindBy(linkText = "Basic Auth")
    WebElement basicAuthLink;

    @FindBy(linkText = "Broken Images")
    WebElement brokenImagesLink;


    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void goToBasicAuthLink() {
        basicAuthLink.click();
    }

    public void goToBrokenImage() {
        brokenImagesLink.click();
    }


}
