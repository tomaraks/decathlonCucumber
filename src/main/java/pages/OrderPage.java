package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import stepDefinitions.utils.HelperClass;

public class OrderPage {
    public static WebDriver driver = HelperClass.getDriver();

    public static String getOrderPrice() {
        return driver.findElements(By.cssSelector("h4.order-1 span")).get(1).getText();
    }

    public static String getOrderQuantity() {
        return driver.findElement(By.cssSelector(".relative .text-black.font-semibold.whitespace-nowrap")).getText();
    }

    public static WebElement getProceedToCheckoutButton() {
        return driver.findElement(By.cssSelector("button.font-bold.w-full"));
    }

    public static String getTitleOfLoginPopup() throws NoSuchElementException {
        return driver.findElement(By.cssSelector(".flex-grow .transition.uppercase")).getText();
    }
}
