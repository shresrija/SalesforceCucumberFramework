Feature: Login
  As a user
  I want to login
  so that I can view my profile

  Scenario: Visit Login page
    Given I am on Home Page
    When I select Login
    Then I should visit to Login Page

  Scenario: Login with valid id
    Given I am on Login page
    When I enter the usename as 'shresrija@gmail.com'
    And I enter the password as 'cukes1245'
    And I select 'Log in to Salesforce'
    Then I should visit to 'Getting Started' page