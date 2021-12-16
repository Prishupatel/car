package com.carsguide.cucumber.steps;

import com.carsguide.pages.FindDealersPage;
import com.carsguide.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class FindDealerPageSteps {
    @And("^I click on 'Find a Dealer' page$")
    public void iClickOnFindADealerPage() {
        new HomePage().clickonFindDealer();
    }

    @Then("^I navigate to 'car-dealers' page$")             //check this is correct implemented or not?
    public void iNavigateToCarDealersPage() throws InterruptedException {
        new FindDealersPage().dealershipPageVerification();
    }

    @And("^I should see the dealers name \"([^\"]*)\" are displayed on page$")
    public void iShouldSeeTheDealersNameAreDisplayedOnPage(Boolean arg0)  {
        new FindDealersPage().verifyDealersNamesDisplayed(arg0);
    }
}
