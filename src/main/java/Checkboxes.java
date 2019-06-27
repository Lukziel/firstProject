import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Checkboxes {
    WebDriver driver;

    public Checkboxes(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void CheckedCheckBox(){
       driver.findElements(By.cssSelector("input:checked[type='checkbox']"));

    }


}
