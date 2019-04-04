import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class TestBrokenImages extends TestBase {

    @Test
    public void shouldCheckExistingImages() throws IOException {
        mainPage.goToBrokenImage();
        brokenImages.existsElement();
        brokenImages.printNumberOfBrokenImages();
        Assert.assertTrue(brokenImages.image == 2);
    }
}
