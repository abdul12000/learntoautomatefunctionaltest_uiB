package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ForeseePage extends BasePage{
    public ForeseePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "menu-item-33415")
    private WebElement insights;
    @FindBy(xpath = "menu-item-33433")
    private WebElement webinars;


//    public void clickOnWebinars(){
//        Actions actionProvider =  new Actions(driver);
//        actionProvider.moveToElement(insights).build().perform();
//    }

}
