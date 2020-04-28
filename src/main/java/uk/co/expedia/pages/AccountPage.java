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
public class AccountPage extends Utility {

    private static final Logger log = LogManager.getLogger(AccountPage.class.getName());



    @FindBy(id = "header-account-signin-button")
    WebElement signInBtn;

    @FindBy(xpath = "//a[@id='header-account-register']//span")
    WebElement createAccount;

    public void clickOnSignInButton(){
        Reporter.addStepLog("Clicking On SignIn Button : "+signInBtn.toString()+ "<br>");
        clickOnElement(signInBtn);
        log.info("Clicking On SignIn Button" +signInBtn.toString());
    }

    public void clickOnAccountMenu(){
        Reporter.addStepLog("Clicking On create account link : " + createAccount.toString()+ "<br>");
        clickOnElement(createAccount);
        log.info("Clicking On create account link" + createAccount.toString());
    }
}
