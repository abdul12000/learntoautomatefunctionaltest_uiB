package pages.next;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class NextHomePage extends BasePage {
    public NextHomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//span[@class='PrimarynavlinksText'][contains(text(),'WOMEN')]")
    private WebElement womenCategoryElement;
}
