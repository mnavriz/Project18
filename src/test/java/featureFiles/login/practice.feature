
  Feature: Manage Company

    Scenario:
      Given User navigates to the asian-promotions website homepage
      When User sends the keys in "loginPage"
        | Username | furkat.khalilov@gmail.com |
        | Password | 580202442                 |
      And User clicks on "LoginPage"
        | Submit |
      Then User is logged in

      When User clicks on "UserMenu"
        | ManageCompany |
      And User sends the keys in "ManageCompanyPage"
        | CompanyName               | Furkat Company                   |
        | CompanyTagline            | Furkat Tagline                   |
        | CompanyWebsite            | http://exelenter.com             |
        | CompanyProfileInformation | my profile information           |
        | CompanyMission            | company mission is to make money |
        | CompanyRegistrationNo     | 12345678                         |
      And User hover overs the element and clicks on "ManageCompanyPage"
        | CompanyImage |
      And User uploads file
        | C:\Users\safe glazing\Desktop\DiscordSetup.exe |
      And User clicks on "ManageCompanyPage"
        | SaveButton |




