package com.carsguide.cucumber.steps;

import com.carsguide.pages.HomePage;
import com.carsguide.pages.NewAndUsedCarPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageSteps {


    @When("^I mouse hover on buy\\+sell tab$")
    public void iMouseHoverOnBuySellTab() {
        new HomePage().mouseHoverOnBuynSell();
    }

    @And("^I click Search Cars link$")
    public void iClickSearchCarsLink() {
        new HomePage().clickOnSearchCar();
    }

    @Then("^I navigate to 'new and used car search' page$")
    public void iNavigateToNewAndUsedCarSearchPage() {
        new NewAndUsedCarPage().verifyNewandUsedCarPage();
    }

    @And("^I click on 'used' car link$")
    public void iClickOnUsedCarLink() {
        new HomePage().clickOnUsedonHomePage();
    }

    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }
}
