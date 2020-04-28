package uk.co.expedia.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import com.cucumber.listener.Reporter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import uk.co.expedia.utility.Utility;

/**
 * Created by Ankita
 */
public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy (xpath ="//span[@class ='button-text']" )
    WebElement acceptTab;

    @FindBy(xpath = "//button[@id='header-account-signin-button']")
    WebElement _signInBtn;

    @FindBy(xpath = "//button[@id='tab-flight-tab-hp']//span[@class='uitk-icon uitk-icon-flights']")
    WebElement flightsTab;

    @FindBy(id = "header-account-menu")
    WebElement accountLink;

    public void clickOnFlightsTab() {
        Reporter.addStepLog("Clicking on flights tab : " + flightsTab.toString());
        clickOnElement(flightsTab);
        log.info("Clicking on flights tab" + flightsTab.toString());
    }

    public void clickOnAccountMenu() {
        Reporter.addStepLog("Clicking on account menu : " + accountLink.toString());
        clickOnElement(accountLink);
        log.info("Clicking on account menu" + accountLink.toString());
    }

    public void clickOnAcceptBtn() {
        Reporter.addStepLog("clicking on accept tab : "+ acceptTab.toString());
        clickOnElement(acceptTab);
        log.info("clicking on accept tab : "+ acceptTab.toString());

    }

    public void clickOnSignInTab() {
        Reporter.addStepLog("Clicking on Sign In Tab : " + _signInBtn.toString());
        clickOnElement(_signInBtn);
        log.info("Clicking on Sign In Tab : " + _signInBtn.toString());
    }

}
