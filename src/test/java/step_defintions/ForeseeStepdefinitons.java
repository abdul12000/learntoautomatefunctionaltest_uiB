package step_defintions;
import base.BaseUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.util.List;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class ForeseeStepdefinitons extends BaseUtil {
    private BaseUtil base;

    public ForeseeStepdefinitons(BaseUtil base) {
        this.base = base;
    }

    @Given("I access foresee")
    public void i_access_foresee() {
        base.driver.manage().window().maximize();
        base.driver.get("https://www.foresee.com/");
    }

    @When("I click on Webinars")
    public void i_click_on_webinars() {
        WebElement insights = base.driver.findElement(By.id("menu-item-33415"));
        Actions actionProvider = new Actions(base.driver);
        actionProvider.moveToElement(insights).build().perform();
        WebElement webinars = base.driver.findElement((By.id("menu-item-33433")));
        webinars.click();
    }

    @Then("{int} Webinars are displayed")
    public void webinars_are_displayed(Integer number) {
        List<WebElement> webinarList = base.driver.findElements(By.xpath("//article/dl/dd"));
        int numberOfWebinar = webinarList.size();
        System.out.println(numberOfWebinar);
        assertThat(numberOfWebinar, is(equalTo(number)));
    }
}
