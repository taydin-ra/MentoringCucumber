package PageObjectModel;

import Utilities.Driver;
import Utilities.ReadPropertiesFile;
import cucumber.api.java.ro.Si;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends BasePage{

    WebDriver driver;

    public SignInPage() {

        driver = Driver.getDriver();

        PageFactory.initElements( driver, this);

    }


// find by is working as driver.findElement

    @FindBy(css = "[formcontrolname=\"username\"]")

    private WebElement inputUserName;

    @FindBy(css = "[formcontrolname=\"password\"]")

    private WebElement inputPassword;

    @FindBy(css = "button[aria-label=\"LOGIN\"]")

    private WebElement buttonLogin;

    public void typeIninputUserName() {

        sendkeysFunction(inputUserName,  ReadPropertiesFile.getData("Username"));


    }

    public void typeIninputPassword() {
        sendkeysFunction(inputPassword,ReadPropertiesFile.getData("Password"));

    }

    public void clickOnbuttonLogin() {
        clickFunction(buttonLogin);
    }
}


