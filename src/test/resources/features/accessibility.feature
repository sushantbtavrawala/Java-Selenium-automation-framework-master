Feature: Accesibility Scenario

  Background:
    Given user navigate to the url "http://eaapp.somee.com/"
    And user navigate to the login page
    When user entered username "Admin" password "password"
    And user click login button

  @smoke
  Scenario:01- verify Homepage accessibility
    Then user navigate to the "home" page
    And user validate "home" page against accessibility violation rules
    And user validate footer links
    And user validate page tilte
    And user validate page for any broken link
    And user click on log off

  Scenario:02- verify Employee List page accessibility
    Then user navigate to the "employee list" page
    And user validate "employee list" page against accessibility violation rules
    And user validate footer links
    And user validate page tilte
    And user validate page for any broken link
    And user click on log off
