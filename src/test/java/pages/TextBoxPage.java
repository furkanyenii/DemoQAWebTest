package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextBoxPage extends BasePage {
    public TextBoxPage(WebDriver driver) {
        super(driver);
    }

    private final By fullNameLocator = By.id("userName");
    private final By emailLocator = By.cssSelector("input.mr-sm-2[placeholder='name@example.com");
    private final By currentAddressLocator = By.id("currentAddress");
    private final By permanentAddressLocator = By.id("permanentAddress");
    private final By submitButtonLocator = By.cssSelector("button.btn");
    private final By nameLocator = By.cssSelector("p#name");
    private String name;


    public void enterFullName() throws InterruptedException {
        WebElement fullNameElement = driver.findElement(fullNameLocator);
        fullNameElement.click();
        fullNameElement.sendKeys("Furkan Yeni");
        Thread.sleep(1000);
    }

    public void enterEmail() throws InterruptedException {
        WebElement emailElement = driver.findElement(emailLocator);
        emailElement.click();
        emailElement.sendKeys("yeniifurkan@gmail.com");
        Thread.sleep(1000);
    }

    public void enterCurrentAddress() throws InterruptedException {
        WebElement currentAddressElement = driver.findElement(currentAddressLocator);
        currentAddressElement.click();
        currentAddressElement.sendKeys("Kayisdagi mah. Nasir Cad. Mansur Sk.");
        Thread.sleep(1000);
    }

    public void enterPermanentAddress() throws InterruptedException {
        WebElement currentAddressElement = driver.findElement(permanentAddressLocator);
        currentAddressElement.click();
        currentAddressElement.sendKeys("Dernekkiri cad. 5822 Sk.");
        Thread.sleep(1000);
    }

    public void clickSubmitButton() throws InterruptedException {
        WebElement submitButton = driver.findElement(submitButtonLocator);
        submitButton.click();
        Thread.sleep(1000);
    }

    public String checkTest(){
        WebElement nameElement = driver.findElement(nameLocator);
        name = nameElement.getText();
        return name;
    }




}
