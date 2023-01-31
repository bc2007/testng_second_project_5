package test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.UnitedAirlinesBasePage;
import pages.UnitedAirlinesHomePage;

public class HomePageTest extends UnitedAirlinesBase{

    @BeforeMethod
    public void setPage(){
        unitedAirlinesBasePage = new UnitedAirlinesBasePage();
        unitedAirlinesHomePage = new UnitedAirlinesHomePage();
    }

    @Test(priority = 1, description = "Validate 'Main menu' navigation items")
    public void validateMainMenuItems(){
        String[] expectedItems = {"BOOK", "MY TRIPS", "TRAVEL INFO", "MILEAGEPLUS® PROGRAM", "DEALS", "HELP"};
        for (int i = 0; i < unitedAirlinesBasePage.headerOptions.size(); i++) {
            Assert.assertEquals(unitedAirlinesBasePage.headerOptions.get(i).getText(), expectedItems[i]);
        }
    }

    @Test(priority = 2, description = "Validate 'Book travel menu' navigation items")
    public void validateNavigationItems(){
        String[] expectedNavigationItems = {"Book", "Flight status", "Check-in", "My trips"};
        for (int i = 0; i < unitedAirlinesHomePage.navigationItems.size(); i++) {
            Assert.assertEquals(unitedAirlinesHomePage.navigationItems.get(i).getText(), expectedNavigationItems[i]);
        }
    }

    @Test(priority = 3, description = "Validate Radio Buttons")
    public void validateRadioButtons(){
        Assert.assertTrue(unitedAirlinesHomePage.roundTripLabel.isDisplayed());
        Assert.assertTrue(unitedAirlinesHomePage.roundTripButton.isEnabled());
        Assert.assertTrue(unitedAirlinesHomePage.roundTripButton.isSelected());

        Assert.assertTrue(unitedAirlinesHomePage.oneWayLabel.isDisplayed());
        Assert.assertTrue(unitedAirlinesHomePage.oneWayButton.isEnabled());
        Assert.assertFalse(unitedAirlinesHomePage.oneWayButton.isSelected());

        unitedAirlinesHomePage.oneWayButton.click();
        Assert.assertFalse(unitedAirlinesHomePage.roundTripButton.isSelected());
        Assert.assertTrue(unitedAirlinesHomePage.oneWayButton.isSelected());

    }

    @Test(priority = 4, description = "Validate checkboxes")
    public void validateCheckboxes(){
        Assert.assertTrue(unitedAirlinesHomePage.bookWithMilesLabel.isDisplayed());
        Assert.assertTrue(unitedAirlinesHomePage.bookWithMilesCheckbox.isEnabled());
        Assert.assertFalse(unitedAirlinesHomePage.bookWithMilesCheckbox.isSelected());

        Assert.assertTrue(unitedAirlinesHomePage.flexibleDatesLabel.isDisplayed());
        Assert.assertTrue(unitedAirlinesHomePage.flexibleDatesCheckbox.isEnabled());
        Assert.assertFalse(unitedAirlinesHomePage.flexibleDatesCheckbox.isSelected());

        unitedAirlinesHomePage.bookWithMilesLabel.click();
        unitedAirlinesHomePage.flexibleDatesLabel.click();
        Assert.assertTrue(unitedAirlinesHomePage.bookWithMilesCheckbox.isSelected());
        Assert.assertTrue(unitedAirlinesHomePage.flexibleDatesCheckbox.isSelected());

        unitedAirlinesHomePage.bookWithMilesLabel.click();
        unitedAirlinesHomePage.flexibleDatesLabel.click();
        Assert.assertFalse(unitedAirlinesHomePage.bookWithMilesCheckbox.isSelected());
        Assert.assertFalse(unitedAirlinesHomePage.flexibleDatesCheckbox.isSelected());
    }

    @Test(priority = 5, description = "Validate One-way ticket search results 'from Chicago, IL, US (ORD) to Miami, FL, US (MIA)'")
    public void validateOneWayTicketResults(){
        unitedAirlinesHomePage.oneWayButton.click();
        unitedAirlinesHomePage.fromInputBox.clear();
        unitedAirlinesHomePage.fromInputBox.sendKeys("Chicago, IL, US (ORD)");
        unitedAirlinesHomePage.toInputBox.clear();
        unitedAirlinesHomePage.toInputBox.sendKeys("Miami, FL, US (MIA)");
        unitedAirlinesHomePage.departureDate.click();
        unitedAirlinesHomePage.clearDates.click();
        unitedAirlinesHomePage.departureDate.sendKeys("Feb 28");
        unitedAirlinesHomePage.travelersSelector.click();
        unitedAirlinesHomePage.numberOfAdults.sendKeys("2");
        unitedAirlinesHomePage.cabinSelector.click();
        unitedAirlinesHomePage.cabinBusinessFirst.click();
        unitedAirlinesHomePage.findFlightsButton.click();
        Assert.assertEquals(unitedAirlinesHomePage.confirmDate.getText(), "DEPART ON: February 28");

    }

}
