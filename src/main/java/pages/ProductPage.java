package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import stepDefinitions.utils.HelperClass;

import java.util.List;

public class ProductPage {

    public static WebDriver driver = HelperClass.getDriver();

    public static String getPriceOfProduct() {
        return driver.findElements(By.cssSelector(".flex.items-center .font-semibold span.font-bold")).get(1).getText();
    }

    public static List<WebElement> getAllSizes() {
        return driver.findElements(By.cssSelector(".size-select-container .flex .text-center.font-bold"));
    }

    public static WebElement getAddToCartButton() {
        return driver.findElements(By.cssSelector(".fixed button")).get(0);
    }

    public static WebElement getGoToCartButton() {
        return driver.findElement(By.cssSelector(".bottom-0 > button span"));
    }
}
