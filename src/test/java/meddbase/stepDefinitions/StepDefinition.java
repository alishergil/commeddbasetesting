package meddbase.stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import meddbase.pages.HomePage;

public class StepDefinition {

    HomePage Home = new HomePage();

    @Given("^User is on patientbooking homepage$")
    public void userIsOnPatientbookingHomepage() {
        String homePageUrl = Home.getHomePageUrl();
    }

    @When("^user clicks on login button$")
    public void userClicksOnLoginButton() {
    }

    @And("^user will signup / register$")
    public void userWillSignupRegister() {
    }

    @Then("^user can see homepage$")
    public void userCanSeeHomepage() {
    }
}
