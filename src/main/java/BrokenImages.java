import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class BrokenImages {
    WebDriver driver;
    @FindBy(tagName = "img")
    public List<WebElement> imageList;
    int image;

    public BrokenImages(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void existsElement() throws IOException {
        List<WebElement> imageBrokenList = new ArrayList<WebElement>();

        for (int i = 0; i < imageList.size(); i++) {

            if (imageList.get(i).getAttribute("naturalWidth").equals("0")) {
                imageBrokenList.add(imageList.get(i));
                String linkURL = imageList.get(i).getAttribute("src");
                String linkURLBroken = imageList.get(i).getAttribute("outerHTML");
                URL url = new URL(linkURL);
                HttpURLConnection http = (HttpURLConnection) url.openConnection();
                int statusCode = http.getResponseCode();
                if (statusCode == 404 || statusCode == 500) {
                    System.out.println("Broken images: " + linkURLBroken + " and its Status codes is: " + statusCode);
                    image = imageBrokenList.size();
                }
            }
        }
    }

    public void printNumberOfBrokenImages() {
        System.out.println("Broken images: " + image);
    }
}



