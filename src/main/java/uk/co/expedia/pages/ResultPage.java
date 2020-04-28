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
public class ResultPage extends Utility {

    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());

    @FindBy(xpath = "//*[@id=\"titleBar\"]/h1/div/span[1]")
    WebElement resultText;

    @FindBy(xpath="//div[@class='bold announce-able']")
    WebElement _errorMessage;

    public String getResultText() {
        Reporter.addStepLog("Getting text from : " + resultText.toString() + "<br>");
        log.info("Getting text from" + resultText.toString());
        return getTextFromElement(resultText);

    }

    public String getErrorMessage() {
        Reporter.addStepLog("Verify Error Message   : " + _errorMessage.toString() + "<br>");
        log.info("Verify Error Message  : " + _errorMessage.toString());
        return getTextFromElement(_errorMessage);
    }

}
