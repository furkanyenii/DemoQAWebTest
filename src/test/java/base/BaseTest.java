package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.DriverManager;


public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new DriverManager().initializeDriver();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }


}
