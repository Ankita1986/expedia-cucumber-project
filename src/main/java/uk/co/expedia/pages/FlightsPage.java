package uk.co.expedia.pages;

import com.cucumber.listener.Reporter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import uk.co.expedia.utility.Utility;

/**
 * Created by Ankita
 */
public class FlightsPage extends Utility {

    private static final Logger log = LogManager.getLogger(FlightsPage.class.getName());


    @FindBy(id = "flight-origin-hp-flight")
    WebElement flyingFrom;

    @FindBy(id = "flight-destination-hp-flight")
    WebElement goingTo;

    @FindBy(id = "flight-departing-hp-flight")
    WebElement departing;

    @FindBy(id = "flight-returning-hp-flight")
    WebElement returning;

    @FindBy(xpath = "//body/meso-native-marquee/section/div/div/div/section/div/div/div/section/form/fieldset/div/div[3]/div[1]/label[1]/input[1]")
    WebElement clearReturnDate;

    @FindBy(xpath = "//div[9]//label[1]//button[1]")
    WebElement searchButton;

    @FindBy(xpath = "//body/meso-native-marquee/section/div/div/div/section/div/div/div/section/form/fieldset/div/div/div/div/ul/li/button[1]")
    WebElement travellers;

    @FindBy(xpath = "//button[@class=\"uitk-step-input-button uitk-step-input-plus\"]")
    WebElement adultsTwo;

    @FindBy(xpath = "//li[contains(@class,'open')]//button[contains(@class,'close btn-text')]")
    WebElement close;

    @FindBy(xpath = "//span[@class=\"title-city-text\"]")
    WebElement getSameDestinationText;




    public void enterFlyingFrom(String origion) {
        Reporter.addStepLog("Entering flying from : " + origion + " On flying from field : " + flyingFrom.toString() + "<br>");
        sendTextToElement(flyingFrom, origion);
        log.info("Entering flying from" + origion + "On flying from field" + flyingFrom.toString());
    }

    public void enterGoingTo(String destination) {
        Reporter.addStepLog("Entering going to : " + destination + " On going to field : " + goingTo.toString() + "<br>");
        sendTextToElement(goingTo, destination);
        log.info("Entering going to" + destination + " On going to field" + goingTo.toString());
    }

    public void enterDepartingDate(String date) {
        Reporter.addStepLog("Entering departing date : " + date + " On departing date field : " + departing.toString() + "<br>");
        sendTextToElement(departing, date);
        log.info("Entering departing date" + date + " On departing date field " + departing.toString());
    }

    public void enterReturningDate(String date) {
        Reporter.addStepLog("Entering returning date : " + date + " On returning date field : " + returning.toString() + "<br>");
        sendTextToElement(returning, date);
        log.info("Entering returning date" + date + " On returning date field" + returning.toString());
    }

    public void clearReturnDate() {
        Reporter.addStepLog("clearing autofeed returing date : " + clearReturnDate.toString() + "<br>");
        clearTextFromField(clearReturnDate);
        log.info("clearing autofeed returing date : " + clearReturnDate.toString());
    }

    public void clickOnSearchButton() {
        Reporter.addStepLog("Clicking on search button : " + searchButton.toString() + "<br>");
        clickOnElement(searchButton);
        log.info("Clicking on search button" + searchButton.toString());
    }

    public void clickOnTravellers() {
        Reporter.addStepLog("clicking on travellers : " + travellers.toString() + "<br>");
        clickOnElement(travellers);
        log.info("clicking on travellers : " + travellers.toString());

    }

    public void clickOnAdults() {
        Reporter.addStepLog("adding adults : " + adultsTwo.toString() + "<br>");
        clickOnElement(adultsTwo);
        log.info("adding adults : " + adultsTwo.toString());
    }

    public void clickOnClose() {
        Reporter.addStepLog("clicking close : " + close.toString() + "<br>");
        clickOnElement(close);
        log.info("clicking close : " + close.toString());
    }

    public String getDestinationText() {
        Reporter.addStepLog("Getting text from : " + getSameDestinationText.toString() + "<br>");
        log.info("Getting text from : " + getSameDestinationText.toString());
        return getTextFromElement(getSameDestinationText);

    }

    public String verifyBodyContainsDestinationName() {
        String bodyText = driver.findElement(By.tagName("body")).getText();
        return bodyText;
    }


}
