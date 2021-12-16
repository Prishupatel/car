package com.carsguide.cucumber.steps;

import com.carsguide.pages.NewAndUsedCarPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class NewAndUsedCarSteps {
    @And("^I select make \"([^\"]*)\"$")
    public void iSelectMake(String arg0)  {
        new NewAndUsedCarPage().selectYourCar(arg0);
    }

    @And("^I Select model \"([^\"]*)\"$")
    public void iSelectModel(String arg0)  {
        new NewAndUsedCarPage().selectModel(arg0);

    }

    @And("^I select location \"([^\"]*)\"$")
    public void iSelectLocation(String arg0)  {
        new NewAndUsedCarPage().chooseYourLocation(arg0);
    }

    @And("^I select price \"([^\"]*)\"$")
    public void iSelectPrice(String arg0)  {
        new NewAndUsedCarPage().selectYourRange$(arg0);
    }

    @And("^I click on Find My Next Car tab$")
    public void iClickOnFindMyNextCarTab() {
        new NewAndUsedCarPage().clickOnSearchButton();
    }

    @Then("^I should see the make in results$")
    public void iShouldSeeTheMakeInResults() {
        new NewAndUsedCarPage().getResulText();
    }
}
