import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Checkboxes {
    WebDriver driver;
    boolean isChecked;
    boolean isUnChecked;

    public Checkboxes(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void UnCheckedCheckBox() {
        isUnChecked = driver.findElement(By.xpath("//input[1]")).isSelected();
        System.out.println(isUnChecked);

    }
    public void CheckedCheckBox() {
        isChecked = driver.findElement(By.xpath("//input[2]")).isSelected();
//      isChecked = driver.findElement(By.cssSelector("input:checked[type='checkbox']")).isSelected(); by CSS Selector
        System.out.println(isChecked);

    }


}
