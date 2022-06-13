package scripts;

import com.google.inject.spi.ScopeBinding;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.Waiter;


public class UnitedAirlinesTest extends Base {

    @Test(priority = 1)
    public void mainMenuNavigations() {

        driver.get("https://www.united.com/en/us");

        String nav0 = "BOOK";
        String nav1 = "MY TRIPS";
        String nav2 = "TRAVEL INFO";
        String nav3 = "MILEAGEPLUS® PROGRAM";
        String nav4 = "DEALS";
        String nav5 = "HELP";

        Assert.assertEquals(unitedAirlinesPage.bookNav.getText(), nav0);
        Assert.assertTrue(unitedAirlinesPage.bookNav.isEnabled());

        Assert.assertEquals(unitedAirlinesPage.myTripsNav.getText(), nav1);
        Assert.assertTrue(unitedAirlinesPage.myTripsNav.isEnabled());

        Assert.assertEquals(unitedAirlinesPage.travelInfoNav.getText(), nav2);
        Assert.assertTrue(unitedAirlinesPage.travelInfoNav.isEnabled());

        Assert.assertEquals(unitedAirlinesPage.mileagePlusProgramNav.getText(), nav3);
        Assert.assertTrue(unitedAirlinesPage.mileagePlusProgramNav.isEnabled());

        Assert.assertEquals(unitedAirlinesPage.dealsNav.getText(), nav4);
        Assert.assertTrue(unitedAirlinesPage.dealsNav.isEnabled());

        Assert.assertEquals(unitedAirlinesPage.helpNav.getText(), nav5);
        Assert.assertTrue(unitedAirlinesPage.helpNav.isEnabled());
    }

    @Test(priority = 2)
    public void bookTravelMenu() {

        driver.get("https://www.united.com/en/us");

        String tab1 = "Book";
        String tab2 = "Flight status";
        String tab3 = "Check-in";
        String tab4 = "My trips";

        Assert.assertEquals(unitedAirlinesPage.travelTab.getText(), tab1);
        Assert.assertTrue(unitedAirlinesPage.travelTab.isEnabled());

        Assert.assertEquals(unitedAirlinesPage.flightStatusTab.getText(), tab2);
        Assert.assertTrue(unitedAirlinesPage.flightStatusTab.isEnabled());

        Assert.assertEquals(unitedAirlinesPage.checkInTab.getText(), tab3);
        Assert.assertTrue(unitedAirlinesPage.checkInTab.isEnabled());

        Assert.assertEquals(unitedAirlinesPage.tripsTab.getText(), tab4);
        Assert.assertTrue(unitedAirlinesPage.tripsTab.isEnabled());
    }

    @Test(priority = 3)
    public void tripRadioButtons() {

        driver.get("https://www.united.com/en/us");

        unitedAirlinesPage.roundTripButton.click();

        Assert.assertTrue(unitedAirlinesPage.roundTripButton.isDisplayed());
        Assert.assertTrue(unitedAirlinesPage.roundTripButton.isEnabled());

        unitedAirlinesPage.oneWayTripButton.click();

        Assert.assertTrue(unitedAirlinesPage.oneWayTripButton.isDisplayed());
        Assert.assertTrue(unitedAirlinesPage.oneWayTripButton.isEnabled());
        Assert.assertFalse(unitedAirlinesPage.roundTripButton.isSelected());
    }

    @Test(priority = 4)
    public void tripCheckboxes() {

        driver.get("https://www.united.com/en/us");

        Assert.assertTrue(unitedAirlinesPage.bookWithMilesCheckbox.isDisplayed());
        Assert.assertTrue(unitedAirlinesPage.bookWithMilesCheckbox.isEnabled());
        Assert.assertFalse(unitedAirlinesPage.bookWithMilesCheckbox.isSelected());

        Assert.assertTrue(unitedAirlinesPage.flexibleDatesCheckbox.isDisplayed());
        Assert.assertTrue(unitedAirlinesPage.flexibleDatesCheckbox.isEnabled());
        Assert.assertFalse(unitedAirlinesPage.flexibleDatesCheckbox.isSelected());

        unitedAirlinesPage.bookWithMilesCheckbox.click();
//        Assert.assertTrue(unitedAirlinesPage.bookWithMilesCheckbox.isSelected());

        unitedAirlinesPage.flexibleDatesCheckbox.click();
//        Assert.assertTrue(unitedAirlinesPage.flexibleDatesCheckbox.isSelected());

        unitedAirlinesPage.bookWithMilesCheckbox.click();
        Assert.assertFalse(unitedAirlinesPage.bookWithMilesCheckbox.isSelected());

        unitedAirlinesPage.flexibleDatesCheckbox.click();
        Assert.assertFalse(unitedAirlinesPage.flexibleDatesCheckbox.isSelected());
    }

    @Test(priority = 5)
    public void ticketSearchResult() {

        driver.get("https://www.united.com/en/us");

        unitedAirlinesPage.oneWayTripButton.click();

        unitedAirlinesPage.fromInputBox.clear();
        unitedAirlinesPage.fromInputBox.sendKeys("Chicago ORD");
        unitedAirlinesPage.toInputBox.sendKeys("Miami MIA");

        Waiter.pause(1);

        unitedAirlinesPage.departDateInputBox.clear();
        unitedAirlinesPage.departDateInputBox.sendKeys("Jan 30");

        Waiter.pause(1
        );
        unitedAirlinesPage.passengerAmountDropdown.click();
        unitedAirlinesPage.passengerAmountInputBox.sendKeys("2");

        Waiter.pause(1);

        unitedAirlinesPage.cabinTypeDropdown.click();
        unitedAirlinesPage.businessOrFirstOption.click();

        unitedAirlinesPage.findFlightsButton.click();

        Waiter.pause(2);

        Assert.assertEquals(unitedAirlinesPage.resultsPageHeading.getText(), "Depart: Chicago, IL, US to Miami, FL, US");

    }
}
