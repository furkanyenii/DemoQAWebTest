package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TextBoxPage;

public class TextBoxTest extends BaseTest {

    @Test(description = "İlgili adrese gidilir. -> İsim , e-mail , adres bilgileri girilir." +
            "-> Submit Butonuna tıklanır. -> Name test verisi ile çıktı verisi kıyaslanır.")
    public void textBox() throws InterruptedException {
        driver.get("https://demoqa.com/text-box");
        TextBoxPage textBoxPage = new TextBoxPage(driver);
        textBoxPage.enterFullName();
        textBoxPage.enterEmail();
        textBoxPage.enterCurrentAddress();
        textBoxPage.enterPermanentAddress();
        textBoxPage.clickSubmitButton();
        Assert.assertEquals("Name:Furkan Yeni",textBoxPage.checkTest());

    }

}
