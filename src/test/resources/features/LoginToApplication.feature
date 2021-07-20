Feature: Login Scenario

  Background:
    Given user navigate to the url "http://eaapp.somee.com/"
    And user navigate to the login page

  Scenario: 1- user is able to login to the page
    When user entered username "Admin" password "password"
    And user click "login" button
    Then page title "Home - Execute Automation Employee App" is displayed