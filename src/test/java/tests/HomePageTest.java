package tests;

import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTest extends BaseTest{

    @Test
    public void openHomePage(){
        driver.navigate().to(HomePage.DOODLE_URL);
    }
}
