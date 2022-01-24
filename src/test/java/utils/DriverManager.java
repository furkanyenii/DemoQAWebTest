package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
    protected WebDriver driver;

    public WebDriver initializeDriver(){
        try{
            System.setProperty(Constants.CHROME_DRIVER,Constants.CHROME_DRIVER_LOCATION);
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return driver;
    }
}
