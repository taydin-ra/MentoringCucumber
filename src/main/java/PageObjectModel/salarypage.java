package PageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class salarypage extends BasePage{
    WebDriver driver;

    public salarypage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);


    }

    @FindBy(xpath = "//span[contains(text(),'Human Resources')]")

    private WebElement humanResource;

    @FindBy(xpath = "(//span[contains(text(),'Setup')])[4]")

    private WebElement setup;

    @FindBy(xpath = "//span[contains(text(),'Position Salary')]")

    private WebElement positionSalary;

    @FindBy(xpath = "//ms-dialog-content//ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input")
    private WebElement positionOfSalary;
    @FindBy(xpath = "//span[text()='Positions']")
    private WebElement positions;
    @FindBy(xpath = "//ms-dialog-content//ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input")
    private WebElement inputpositionName;

    @FindBy(xpath = "//ms-dialog-content//ms-text-field[@placeholder='GENERAL.FIELD.SHORTNAME']//input")
    private WebElement getInputPositionShortName;

    public void clickOnHumanResource() {
        clickFunction(humanResource);

    }

    public void clickOnSetup() {
        waitUntilVisibility(humanResource);
        clickFunction(setup);
    }

    public void clickOnPositionSalary() {
        clickFunction(positionSalary);

    }

    public void typeInPositionSalary(String salary) {
        sendkeysFunction(positionOfSalary, salary);
    }

    public void clickOnPositions() {
        clickFunction(positions);
    }

    public void typeInputpositionnName(String citizenName) {
        sendkeysFunction(inputpositionName, citizenName);
    }

    public void typeInputpositionShortName(String shortName) {
        sendkeysFunction(getInputPositionShortName, shortName);
    }
}
