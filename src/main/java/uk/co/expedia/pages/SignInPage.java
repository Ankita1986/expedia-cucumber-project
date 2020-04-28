package uk.co.expedia.pages;

import com.cucumber.listener.Reporter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import uk.co.expedia.utility.Utility;

/**
 * Created by Ankita
 */
public class SignInPage extends Utility {
    private static final Logger log = LogManager.getLogger(SignInPage.class.getName());



    @FindBy(id = "gss-signin-email")
    WebElement emailAddressField;

    @FindBy(id = "gss-signin-password")
    WebElement passwordField;

    @FindBy(id = "gss-signin-submit")
    WebElement signInBtn;

    @FindBy(id = "gss-signin-incorrect-email-or-password")
    WebElement errorMessage;

    @FindBy (xpath="//span[@class='sp-name']")
    WebElement _myList;

    @FindBy (xpath="//button[@id='header-account-menu-signed-in']")
    WebElement _helloMessage;

    public void enterEmailAddress(String email) {
        Reporter.addStepLog("Entering email : " + email + " On email address field : " + emailAddressField.toString() + "<br>");
        sendTextToElement(emailAddressField, email);
        log.info("Entering email " + email + " On email address field " + emailAddressField.toString());
    }

    public void enterPassword(String password) {
        Reporter.addStepLog("Entering password : " + password + " On password field : " + passwordField.toString() + "<br>");
        sendTextToElement(passwordField, password);
        log.info("Entering password " + password + " On password field " + passwordField.toString());
    }

    public void clickOnSignInButton() {
        Reporter.addStepLog("Clicking on sign in button : " + signInBtn.toString() + "<br>");
        clickOnElement(signInBtn);
        log.info("Clicking on sign in button " + signInBtn.toString());
    }

    public String getErrorMessage() {
        Reporter.addStepLog("Getting text from error message : " + errorMessage.toString() + "<br>");
        log.info("Getting text from error message " + errorMessage.toString());
        return getTextFromElement(errorMessage);
    }

    public String getMyListMessage() {
        Reporter.addStepLog("Verify My List Tab Message  : " + getTextFromElement(_myList) + " " + _myList.toString() + "<br>");
        log.info("Verify My List Tab Message  : " + getTextFromElement(_myList) + " " + _myList.toString());
        //waitUntilVisibilityOfElementLocated(_errorMessage, 90);
        verifyThatTextIsDisplayed(_myList, "My Lists");
        return getTextFromElement(_myList);
    }

    public String getHelloMesage() {
        Reporter.addStepLog("Verify Hello Message  : " + getTextFromElement(_helloMessage) + " " + _helloMessage.toString() + "<br>");
        log.info("Verify Hello Message  : " + getTextFromElement(_helloMessage) + " " + _helloMessage.toString());
        //waitUntilVisibilityOfElementLocated(_errorMessage, 90);
        return getTextFromElement(_helloMessage);
    }
}
