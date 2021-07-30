Feature: Login Scenario

  Background:
    Given user navigate to the url "http://eaapp.somee.com/"
    And user navigate to the login page
    When user entered username "Admin" password "password"
    And user click login button

  @smoke
  Scenario:01- verify user logged in successfully
    Then page title "Home - Execute Automation Employee App" is displayed
    And user click on log off

  Scenario:02- user create new employee
    When user navigate to the Employee list page
    And user click Create New button
    And user enter following details
      | Name | Salary | DurationWorked | Grade | Email           |
      | SBT  | 45000  | 5              | 2     | sbt@yopmail.com |
    Then user click Create button
    And user click on log off

  @smoke
  Scenario:03- user search for employee
    When user navigate to the Employee list page
    And user enter "sbt25" in the search box
    And user click Search button
    Then I validate the name contains "sbt25"
    And user click on log off
