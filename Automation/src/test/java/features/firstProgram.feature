Feature: Application Login

Background:
Given Setup entries in Database
When launch browser
And Hit the home page url from Browswer

  @RegressionTest
  Scenario: Admin Page default Login
    Given User is on netbanking login page
    When User login into application with "admin" and password "1234"
    Then Login Page should be disaplayed
    And Account balance should be displayed
  @SmokeTest  
  Scenario: User Page default Login
    Given User is on netbanking login page
    When User login into application with "user" and password "5678"
    Then Login Page should be disaplayed
    And Account balance should be displayed
  @Regression @SmokeTest  
  Scenario: User Page Logout
    Given User is on netbanking login page
    When User login into application with "user" and password "5678"
    Then Login Page should be disaplayed
    And Account balance should be displayed
   