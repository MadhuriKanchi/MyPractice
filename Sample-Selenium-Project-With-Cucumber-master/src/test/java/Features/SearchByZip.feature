Feature: Search the academy store by Zip code
  @searchbyzipcode
  Scenario: User is able find the valid zip code
    Given a web browser is at the academy home page
    When user click on FindAStore link
    Then User able to navigate store locator page
    And user enters zip code
    And user able to search the store