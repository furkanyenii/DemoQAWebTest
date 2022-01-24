package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;

public class UploadDownloadPage extends BasePage {
    public UploadDownloadPage(WebDriver driver) {
        super(driver);
    }

    private final By downloadLocator = By.id("downloadButton");
    private final By uploadButtonLcator = By.id("uploadFile");
    private final By uploadedFilePathLocator = By.id("uploadedFilePath");


    public void clickDownloadButton() throws InterruptedException {
        driver.findElement(downloadLocator).click();
        Thread.sleep(1000);
    }

    public void clickUploadButton(String uploadFilePath){
        driver.findElement(uploadButtonLcator).sendKeys(uploadFilePath);
    }

    public String getPath() {
        WebElement uploadedFileText = driver.findElement(uploadedFilePathLocator);
        return uploadedFileText.getText();
    }

    public boolean isFileDownloaded(String path, String fileName){
        File file = new File(path);
        File[] files = file.listFiles();

        assert files != null;
        for (File value : files) {
            if (value.getName().equals(fileName)) {
                return true;
            }
        }
        return false;
    }

}
