Feature: Main page

  @SmokeTest
  Scenario: Main page login
    Given the user is open main page
    Given the main panel is open
    Given the user click on login button
    When the user see main sberbank online panel
    Given the user click on sberbank online login button
    Given the user see main login page
    Given the user enter login "2669268"
    Given the user enter password "2wde32idkswSd"
    Given the user click on enter button
    Given the wrong password message is displayed