Feature: Adding item on the basket on Next website
  As a user I should be able add item to the basket on the website so that i can pay for them
  @TesttorunNext
  Scenario: adding one item from the Womens category to the basket
    Given I am on the next Home page
    When I choose "WOMEN" category
    And I choose "Dresses" under WOMEN subcategory
    And I choose the first item in the list
    And I choose a colour "Red"
    And I choose size "8"
    And i add to bag
    Then I should see that there is "1" item in the bag

