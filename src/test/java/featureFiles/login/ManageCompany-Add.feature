Feature: Manage Company Add Function Feature

  Scenario:
    Given User navigates to the asian-promotions website homepage
    When User sends the keys in "LoginPage"
      | Username | rafael@exelenter.com |
      | Password | rafael               |
    And User clicks on "Login"
      | Submit |
    Then User is logged in

  Scenario Outline: Manage Company | Add Function
    Given User clicks on "UserMenuPage"
      | Manage Company |
    When User sends the keys in "ManageCompanyPage"
      | CompanyImage              | <Company Image>   |
      | CompanyName               | <Company Name>    |
      | CompanyTagline            | <Company Tagline> |
      | CompanyWebsite            | <Company Website> |
      | CompanyProfileInformation | <Company Profile> |
      | CompanyMission            | <Company Mission> |
      | CompanyRegistrationNo     | <Company Reg.No>  |
    And User selects "Hide" in the drop-down in "ManageCompanyPage"
      | VisibilityDropDown |
    And User clicks on "ManageCompanyPage"
      | SaveButton |
    And User verifies the test case in "ManageCompanyPage"
      | <Test Case Name> |

    Examples:
      | Company Image                              | Company Name | Company Tagline | Company Website       | Company Profile | Company Mission | Company Reg.No | Test Case Name |
      | C:\Users\safe glazing\Desktop\autodesk.png | Exelenter    | Search Anything | https://exelenter.com | Google Profile  | Google Mission  | 12345678       | Test Case 1.a  |
