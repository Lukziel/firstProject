import org.junit.Test;

public class TestCheckboxes extends TestBase {
    @Test
    public void shouldCheckTheSelectionCheckbox(){
        mainPage.goToChackboxesLink();
        checkboxes.CheckedCheckBox();
    }
}
