package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class UnitedAirlinesHomePage extends UnitedAirlinesBasePage{

    public UnitedAirlinesHomePage(){
        super();
    }

    @FindBy(css = "div[class='app-components-BookTravel-bookTravel__travelNavContainer--2c4IY app-components-BookTravel-bookTravel__travelSection--121RV app-components-BookTravel-bookTravel__show--2Y9iP'] h2")
    public List<WebElement> navigationItems;

    @FindBy(css = "input[id = 'roundtrip']")
    public WebElement roundTripButton;

    @FindBy(css = "label[for='roundtrip']")
    public WebElement roundTripLabel;

    @FindBy(css = "input[id = 'oneway']")
    public WebElement oneWayButton;

    @FindBy(css = "label[for='oneway']")
    public WebElement oneWayLabel;

    @FindBy(css = "input[id = 'award']")
    public WebElement bookWithMilesCheckbox;

    @FindBy(css = "label[for='award']")
    public WebElement bookWithMilesLabel;

    @FindBy(css = "input[id = 'flexibleDates']")
    public WebElement flexibleDatesCheckbox;

    @FindBy(css = "label[for='flexibleDates']")
    public WebElement flexibleDatesLabel;

    @FindBy(id = "bookFlightOriginInput")
    public WebElement fromInputBox;

    @FindBy(id = "bookFlightDestinationInput")
    public WebElement toInputBox;

    @FindBy(id = "DepartDate")
    public WebElement departureDate;

    @FindBy(css = "button[class='app-components-PassengerSelector-passengers__passengerButton--w8CX7 app-components-BookFlightForm-bookFlightForm__animatedButton--1UzDj']")
    public WebElement travelersSelector;

    @FindBy(xpath = "(//input[@class='app-components-PassengerSelector-passengers__passengerRow__input--13_Gq'])[1]")
    public WebElement numberOfAdults;

    @FindBy(css = "svg[class='atm-c-icon atm-c-btn__icon']")
    public WebElement closeAdultSelector;

    @FindBy(id = "cabinType")
    public WebElement cabinSelector;

    @FindBy(css = "li[id^='cabinType_item-2']")
    public WebElement cabinBusinessFirst;

    @FindBy(css = "button[aria-label='Find flights']")
    public WebElement findFlightsButton;

    @FindBy(xpath = "(//div[@id='flightResults-content']//b)[2]/..")
    public WebElement confirmDate;

    @FindBy(css = "button[aria-label='Clear Dates']")
    public WebElement clearDates;
}
