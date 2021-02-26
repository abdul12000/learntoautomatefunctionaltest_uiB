package step_defintions;

import base.BaseUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.NewtoursLoginConfirmationPage;
import pages.NewtoursSignOnPage;
import pages.NewtoursWelcomePage;
import utilities.PropertiesReader;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class GoogleSearchStepDefinitions extends BaseUtil {
    private BaseUtil base;


    public GoogleSearchStepDefinitions(BaseUtil base) {
        this.base = base;
    }

    @Given("I access google")
    public void i_access_google() {
 base.driver.get("https://www.google.com/");
    }

    @When("I click agree button")
    public void i_click_agree_button() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
//        List<WebElement> iframeElements = base.driver.findElements(By.tagName("iframeResult"));
//        System.out.println("Total number of iframes are " + iframeElements.size());
        int size = base.driver.findElements(By.tagName("iframe")).size();
        System.out.println("Size is  :   " + size);
        base.driver.switchTo().frame(0);
        base.driver.findElement(By.xpath("//span[.='I agree']")).click();
        System.out.println("=========Frame entered =========");
//        Thread.sleep(5000);
base.driver.switchTo().defaultContent();
        base.driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Boris Johnson");
        base.driver.findElements(By.xpath("//input[@class='gNO89b']")).get(1).click();
        Thread.sleep(5000);
        System.out.println(base.driver.findElement(By.id("result-stats")).getText());
    }

}
