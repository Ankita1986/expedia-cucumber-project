package uk.co.expedia.cucumber.stepdefs;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import uk.co.expedia.pages.FlightsPage;
import uk.co.expedia.pages.HomePage;
import uk.co.expedia.pages.ResultPage;

/**
 * Created by Ankita
 */
public class FlightTestSteps {
    @When("^I click on Flights Tab$")
    public void iClickOnFlightsTab() {
        new HomePage().clickOnAcceptBtn();
        new HomePage().clickOnFlightsTab();
    }

    @And("^I enter origin city \"([^\"]*)\"$")
    public void iEnterOriginCity(String origion)  {
        new FlightsPage().enterFlyingFrom(origion);

    }

    @And("^I enter destination city \"([^\"]*)\"$")
    public void iEnterDestinationCity(String destination) {
        new FlightsPage().enterGoingTo(destination);

    }

    @And("^I enter outbound date of travel \"([^\"]*)\"$")
    public void iEnterOutboundDateOfTravel(String date)  {
        new FlightsPage().enterDepartingDate(date);

    }

    @And("^I enter return travel date \"([^\"]*)\"$")
    public void iEnterReturnTravelDate(String date)  {
        new FlightsPage().enterReturningDate(date);

    }

    @And("^I add no travellers$")
    public void iAddNoTravellers() {
        new FlightsPage().clickOnTravellers();
        new FlightsPage().clickOnAdults();
    }

    @And("^I click on search button$")
    public void iClickOnSearchButton() {
        new FlightsPage().clickOnSearchButton();

    }

    @Then("^I must see flights to the same destination$")
    public void iMustSeeFlightsToTheSameDestination() {
        Assert.assertTrue(new ResultPage().getResultText().contains("Select your departure to Ahmedabad"));
    }

    @Then("^I must get No flights message between the cities$")
    public void iMustGetNoFlightsMessageBetweenTheCities() {
        Assert.assertTrue(new ResultPage().getErrorMessage().contains("We've searched more than 400 airlines that we sell, and couldn't find any flights from Delhi"));
    }
}
