package pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import stepDefinitions.utils.HelperClass;

import java.io.File;

public class HomePage {

    public static WebDriver driver = HelperClass.getDriver();

    public static WebElement getLoginButton() throws NoSuchElementException {
        return driver.findElement(By.cssSelector(".flex .bg-contain h2"));
    }

    public static void closeLoginPopup() throws NoSuchElementException {
        driver.findElement(By.cssSelector(".flex .right-0 > svg")).click();
    }

    public static void searchItem(String item) {
        driver.findElement(By.id("search")).sendKeys(item);
    }

    public static void clickOnItemFromList(int option) {
        driver.findElements(By.cssSelector(".TopProducts_item_list__DPpRU a")).get(option).click();
    }

    public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{
        TakesScreenshot scrShot =((TakesScreenshot)webdriver);
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile=new File(fileWithPath);
        FileUtils.copyFile(SrcFile, DestFile);
    }

}
