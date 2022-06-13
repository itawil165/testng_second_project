package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UnitedAirlinesPage {

    public UnitedAirlinesPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#headerNav0")
    public WebElement bookNav;

    @FindBy(css = "#headerNav1")
    public WebElement myTripsNav;

    @FindBy(css = "#headerNav2")
    public WebElement travelInfoNav;

    @FindBy(css = "#headerNav3")
    public WebElement mileagePlusProgramNav;

    @FindBy(css = "#headerNav4")
    public WebElement dealsNav;

    @FindBy(css = "#headerNav5")
    public WebElement helpNav;

    @FindBy(css = "#travelTab>h2>span")
    public WebElement travelTab;

    @FindBy(css = "#statusTab>h2>span")
    public WebElement flightStatusTab;

    @FindBy(css = "#checkInTab>h2>div")
    public WebElement checkInTab;

    @FindBy(css = "#tripsTab>h2>div")
    public WebElement tripsTab;

    @FindBy(xpath = "//*[@id=\"bookFlightForm\"]/div[1]/fieldset/div/label[1]/span[2]")
    public WebElement roundTripButton;

    @FindBy(xpath = "//*[@id=\"bookFlightForm\"]/div[1]/fieldset/div/label[2]/span[2]")
    public WebElement oneWayTripButton;

    @FindBy(xpath = "//*[@id=\"bookFlightForm\"]/div[1]/div[1]/label")
    public WebElement bookWithMilesCheckbox;

    @FindBy(id = "flexDatesLabel")
    public WebElement flexibleDatesCheckbox;

    @FindBy(id = "bookFlightOriginInput")
    public WebElement fromInputBox;

    @FindBy(id = "bookFlightDestinationInput")
    public WebElement toInputBox;

    @FindBy(id = "DepartDate")
    public WebElement departDateInputBox;

    @FindBy(id = "passengerSelector")
    public WebElement passengerAmountDropdown;

    @FindBy(xpath = "//*[@id=\"passengerMenuId\"]/div[1]/div[1]/div[1]/div/input")
    public WebElement passengerAmountInputBox;

    @FindBy(id = "cabinType")
    public WebElement cabinTypeDropdown;

    @FindBy(id = "cabinType_item-2")
    public WebElement businessOrFirstOption;

    @FindBy(xpath = "//*[@id=\"bookFlightForm\"]/div[5]/div/div[1]/div/div/div[2]/button[1]")
    public WebElement findFlightsButton;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div[2]/div[4]/div/div[2]/div/div[2]/div[1]/div[2]/h2")
    public WebElement resultsPageHeading;





}
