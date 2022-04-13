package Steps;

import Base.BaseStep;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchByZipStep extends BaseStep {
    @Given("^a web browser is at the academy home page$")
    public void aWebBrowserIsAtTheAcademyHomePage() {
        geturl();
    }

    @When("^user click on FindAStore link$")
    public void userClickOnFindAStoreLink() {
        PageScrolldown();
        findElementClick("Find A Store",Pather.linkText);
    }

    @Then("^User able to navigate store locator page$")
    public boolean userAbleToNavigateStoreLocatorPage() {
        return (driver.getCurrentUrl()== "https://www.academy.com/storelocator") ? true :false;
    }

    @And("^user enters zip code$")
    public void userEntersZipCode() {
    }

    @And("^user able to search the store$")
    public void userAbleToSearchTheStore() {
    }
}
