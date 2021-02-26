Feature: test mouse hover on foresee
  @foresee
  Scenario: mouse movement tests
    Given I access foresee
    When I click on Webinars
    Then 7 Webinars are displayed
