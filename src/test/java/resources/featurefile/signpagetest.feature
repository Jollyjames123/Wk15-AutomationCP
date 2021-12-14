Feature: Sign Page Test
  I want to verify Signpage functionality

  Background: I am on Homepage

  @smoke @regression
  Scenario: I should navigate to sign in page successfully
 #  Given I am on Homepage
    When I click on sign in link
    And I verify the message
    Then I should navigate to sign in page successfully

  @sanity @regression
  Scenario Outline: I should verify the error message with invalid credentials
    When I click on sign in link
    And I enter username "<username>" and password "<password>"
    And I click on sign in button
    And I verify the error message "<errormessage>"
    Examples:

      | username       | password | errormessage               |
      |                | 123456   | An email address required. |
      | abcd@gmail.com |          | Password is required.      |
      | adfdfgfg       | 123456   | Invalid email address.     |
      | abcd@gmail.com | 123456   | Authentication failed.     |

  @sanity @regression
  Scenario: I should log in successfully with valid credentials
   # Given I am on Homepage
    When I click on sign in link
    And I enter username "prime@gmail.com"
    And I enter password "Prime123"
    And I click on sign button
    And I verify the sign out link is displayed
    Then User should log in successfully

  @regression
  Scenario: I should log out successfully
    #  Given I am on Homepage
    When I click on sign in link
    And I enter username "prime@gmail.com"
    And I enter password "Prime123"
    And I click on sign button
    And I click on sign out link
    And I verify sign in link is displayed
    Then I should be able to log out successfully