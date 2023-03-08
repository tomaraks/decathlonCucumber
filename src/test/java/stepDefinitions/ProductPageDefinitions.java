package stepDefinitions;

import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import pages.ProductPage;

import java.util.List;

public class ProductPageDefinitions {

    public static String product_price = "";
    public static final String PRODUCT_QUANTITY = "1"; // This remains final since we are only going to select 1 product in each iteration

    @When("User fetches the price of the product")
    public void userFetchesThePrice() {
        product_price = ProductPage.getPriceOfProduct().trim();
    }

    @When("User selects the {string} size")
    public void userSelectsTheSizeFromTheList(String size) {
        List<WebElement> webElementList = ProductPage.getAllSizes();
        for (WebElement webElement : webElementList) {
            if (webElement.getText().equalsIgnoreCase(size)) {
                webElement.click();
                break;
            }
        }
    }

    @When("User clicks on Add to Cart button")
    public void clickOnAddToCart() {
        ProductPage.getAddToCartButton().click();
    }

    @When("User clicks on Go to Cart button")
    public void clickOnGoToCart() {
        ProductPage.getGoToCartButton().click();
    }

}
