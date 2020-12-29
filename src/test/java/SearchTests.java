import base.BaseTests;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;

public class SearchTests extends BaseTests {
    @Test
    public void testSearchByFullTitle(){
        String title = "Agile Testing";
        page.search(title);
        validateWindow();
    }
    @Test
    public void testSearchByFullTitle_Element(){
        String title = "Agile Testing";
        page.search(title);
        validateElement(By.id("pid3");
        assert.assertEquals("Number of books returned", page.getNumberOfVisibleBooks())
    }
}
