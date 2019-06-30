import org.junit.Assert;
import org.junit.Test;

public class TestCheckboxes extends TestBase {
    @Test
    public void shouldCheckTheCheckedCheckbox(){
        mainPage.goToChackboxesLink();
        checkboxes.CheckedCheckBox();
        Assert.assertTrue(checkboxes.isChecked);
    }

    @Test
    public void shouldCheckTheUnCheckedCheckbox(){
        mainPage.goToChackboxesLink();
        checkboxes.UnCheckedCheckBox();
        Assert.assertFalse(checkboxes.isUnChecked);
    }
    
}
