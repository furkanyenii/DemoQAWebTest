package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {
    protected WebDriver driver;

    public WebDriver initializeDriver(){
        try{
            System.setProperty("webdriver.gecko.driver",Constants.CHROME_DRIVER_LOCATION);
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return driver;
    }
}
