Feature: Create Account Test Page
  I want to create account successfully

  @smoke @regression
  Scenario: I should be able to create account successfully
    Given I am on Homepage
    And I click on Sign in Link
    And I enter email address
    And I click on Create an Account button
    And I fill all mandatory fields
    And I click on Register button
    And I verify the message 'My Account'
    Then I can create account successfully


