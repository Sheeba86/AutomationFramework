package StepDefinitions;

import FunctionLibrary.CommonFunctions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class HeaderTestSteps extends CommonFunctions {

    @Given("I'm on HomePage {string}")
    public void i_m_on_home_page(String url) {
    driver.get(url);
    }
    @When("I click on MyAccountLink")
    public void i_click_on_my_account_link() {
    driver.findElement(By.linkText("My Account")).click();
    }

    @Then("I should be on the appropriate page with title as {string}")
    public void i_should_be_on_the_appropriate_page_with_title_as(String expectedTitle) {
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);

    }

}
