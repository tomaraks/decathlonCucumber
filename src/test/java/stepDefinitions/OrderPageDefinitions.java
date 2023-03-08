package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import pages.HomePage;
import pages.OrderPage;

public class OrderPageDefinitions {

    @Then("User validates order summary with price and quantity that was selected")
    public void validateOrderSummary() {
        String finalPrice = OrderPage.getOrderPrice().trim();
        String finalQuantity = OrderPage.getOrderQuantity().trim();
        Assert.assertEquals(finalPrice, ProductPageDefinitions.product_price, "Price does not matches");
        Assert.assertTrue(finalQuantity.contains(ProductPageDefinitions.PRODUCT_QUANTITY), "Quantity does not matches and shows : " + finalQuantity + " : instead of :" + ProductPageDefinitions.PRODUCT_QUANTITY);
    }

    @When("User clicks on Proceed to Checkout button")
    public void clickOnProceedToCheckout() {
        OrderPage.getProceedToCheckoutButton().click();
    }

    @Then("User verifies Login popup is present with title {string}")
    public void verifyLoginPopup(String titleToVerify) {
        try {
            String title = OrderPage.getTitleOfLoginPopup();
            Assert.assertEquals(title, titleToVerify, "Login Pop Title Does Not Matches");
            HomePage.takeSnapShot(HomePage.driver, System.getProperty("user.dir")+"/Reports/image_" + System.currentTimeMillis()+ ".png");
        } catch (NoSuchElementException noSuchElementException) {
            Assert.fail("Pop up was not found");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
