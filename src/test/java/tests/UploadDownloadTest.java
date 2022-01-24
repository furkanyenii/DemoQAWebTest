package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UploadDownloadPage;

public class UploadDownloadTest extends BaseTest {

    @Test(description = "İlgili adrese gidilir. -> Downoad butonuna tıklanır ve sampleFile adlı dosya indirilir. Ardından indirilip indirilmediği kontrol edilir." +
            "-> Dosya seç butonuna ilgili path gönderilir ve dosyanın yüklenip yüklenmediği kontrol edilir.")
    public void uploadDownload() throws InterruptedException {
        UploadDownloadPage uploadDownloadPage = new UploadDownloadPage(driver);
        driver.get("https://demoqa.com/upload-download");

        String path = "C:/Users/furka/Downloads";
        String fileName = "sampleFile.jpeg";

        uploadDownloadPage.clickDownloadButton();
        Thread.sleep(3000);
        Boolean isFileDownloaded = uploadDownloadPage.isFileDownloaded(path,fileName);
        System.out.println("isFileDownloaded result " + isFileDownloaded);
        Assert.assertEquals(Boolean.TRUE,isFileDownloaded);
        Thread.sleep(2000);

        uploadDownloadPage.clickUploadButton("C:/Users/furka/Desktop/newTextDocument.txt");
        String getPath = uploadDownloadPage.getPath();
        System.out.println("Path : " + getPath);
        Assert.assertEquals("C:\\fakepath\\newTextDocument.txt",getPath);


    }
}
