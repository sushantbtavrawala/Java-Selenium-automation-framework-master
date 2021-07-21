Feature: Login Scenario

  Background:
    Given user navigate to the url "http://eaapp.somee.com/"
    And user navigate to the login page
    When user entered username "Admin" password "password"
    And user click login button

  Scenario:01- user is able to login to the page
    Then page title "Home - Execute Automation Employee App" is displayed

  Scenario:02- user create new employee
    When user navigate to the Employee list page
    And user click Create New button
    And user enter following details
      | Name | Salary | DurationWorked | Grade | Email           |
      | SBT  | 45000  | 5              | 2     | sbt@yopmail.com |
    Then user click Create button