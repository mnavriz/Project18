Feature: Login to staging.asian-promotions.com

  Background:
    Given User navigates to the asian-promotions website homepage
    When User sends the keys in "LoginPage"
      | Username | furkat.khalilov@gmail.com |
      | Password | 580202442                 |
    And User clicks on "LoginPage"
      | Submit |
    Then User is logged in

  Scenario:
    Given User clicks on "UserMenu"
      | ManageCompany |
    And User clicks
      | CompanyImage |
    When User selects the file
    When User sends the keys in "ManageCompanyPage"
      | CompanyName               | Google             |
      | CompanyTagline            | Search Anything    |
      | CompanyWebsite            | https://google.com |
      | CompanyProfileInformation | Google Profile     |
      | CompanyMission            | Google Mission     |
      | CompanyRegistrationNo     | 12345678           |




