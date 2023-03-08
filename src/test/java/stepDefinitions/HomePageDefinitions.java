package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.NoSuchElementException;
import pages.HomePage;
import stepDefinitions.utils.HelperClass;

public class HomePageDefinitions {

    @Given("User is on home page")
    public void openHomePage() {
        HelperClass.openPage(HelperClass.properties.getProperty("homePageUrl"));
    }

    @When("User verifies if login popup is available and closes it")
    public void verifyLoginPopupToClose() {
        try {
            if (HomePage.getLoginButton().getText().equalsIgnoreCase("LOCATION")) {
                HomePage.closeLoginPopup();
            }
        } catch (NoSuchElementException ne) {
            System.out.println("There was no login pop on home page");
        }
    }

    @When("User searches for item {string}")
    public void searchItemFromSearchBox(String itemToSearch) {
        HomePage.searchItem(itemToSearch);
    }

    @When("User selects the {int} option from top")
    public void selectOptionFromTop(int optionFromTop) {
        HomePage.clickOnItemFromList(optionFromTop - 1);
    }

}
