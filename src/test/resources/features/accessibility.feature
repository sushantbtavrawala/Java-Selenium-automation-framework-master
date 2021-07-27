Feature: Accesibility Scenario

  Background:
    Given user navigate to the url "http://eaapp.somee.com/"
    And user navigate to the login page
    When user entered username "Admin" password "password"
    And user click login button

  Scenario:01- verify Homepage accessibility
    Then user validate accessibility test on "home" page

  Scenario:02- verify Employee List page accessibility
    Then user validate accessibility test on "employee list" page
