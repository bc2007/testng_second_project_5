package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.List;

public class UnitedAirlinesBasePage {

    public UnitedAirlinesBasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "div[role='tablist'] a")
    public List<WebElement> headerOptions;

}
