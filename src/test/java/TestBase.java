import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

    WebDriver driver;
    MainPage mainPage;
    BasicAuth basicAuth;
    BrokenImages brokenImages;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\LukZiel\\Downloads\\Java\\firstProject\\chromedriver.exe");
        driver = new ChromeDriver();
        mainPage = new MainPage(driver);
        brokenImages = new BrokenImages(driver);
        basicAuth = new BasicAuth(driver);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("http://admin:admin@the-internet.herokuapp.com/");

    }

    @After
    public void teardown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }


}