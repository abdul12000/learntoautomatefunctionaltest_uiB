package step_defintions;

import base.BaseUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pages.BlazeDemoLandingPage;
import pages.BlazeDemoReservePage;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class NextPurchaseSteps extends BaseUtil {
    private BaseUtil base;


    public NextPurchaseSteps(BaseUtil base) {
        this.base = base;
    }

    @Given("I am on the next Home page")
    public void i_am_on_the_next_home_page() {
        base.driver.manage().window().maximize();
        ;
        base.driver.get("https://www.next.co.uk/");
    }

    @When("I choose {string} category")
    public void i_choose_category(String string) {
        base.driver.findElement(By.cssSelector("div.HdTxt>a#NI6")).click();

    }

    @When("I choose {string} under WOMEN subcategory")
    public void i_choose_under_women_subcategory(String string) throws InterruptedException {
        Thread.sleep(3000);
        base.driver.findElements(By.cssSelector("div.sidebar-links-wrap>a")).get(3).click();
    }

    @When("I choose the first item in the list")
    public void i_choose_the_first_item_in_the_list() {
        base.driver.findElements(By.cssSelector("h2.Title>a>span")).get(0).click();
    }

    @When("I choose a colour {string}")
    public void i_choose_a_colour(String string) {
        base.driver.findElement(By.xpath("//a[@class='dk_dropdown_option'][contains(text(),'Red')]")).click();
    }

    @When("I choose size {string}")
    public void i_choose_size(String string) {
        base.driver.findElement(By.xpath("//*[@id='dk_container_Size-316-829']/div/ul/li[3]/a/text")).click();
    }

    @When("i add to bag")
    public void i_add_to_bag() {
        base.driver.findElement(By.xpath("//a[contains(text(),'ADD TO BAG')]")).click();
    }

    @Then("I should see that there is {string} item in the bag")
    public void i_should_see_that_there_is_item_in_the_bag(String number) {
        assertThat(base.driver.findElement(By.cssSelector("div.ItemCount")).getText(), is(equalTo(number)));
    }
}
