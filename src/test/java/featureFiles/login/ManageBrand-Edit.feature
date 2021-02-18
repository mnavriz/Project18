Feature: Manage Brand Edit Function Feature

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

  Scenario Outline: Manage Brand | Add Function
    Given User clicks on "UserMenuPage"
      | Manage Brand |
    And User randomly selects option in the drop-down in "ManageBrandPage"
      | CompanyIdDropdown |
    And User sends the keys in "ManageBrandPage"
      | BrandImageInput       | <Path to the file>   |
      | BrandMissionInput     | <Mission Input Text> |
      | BrandProfileInfoInput | <Brand Input Text>   |
      | BrandNameInput        | <Brand Name Text>    |
      | BrandTaglineInput     | <Tagline Input Text> |
      | BrandWebsiteInput     | <Website>            |
    And User selects "Hide" in the drop-down in "ManageBrandPage"
      | PublicVisibilityDropdown |
    And User clicks on "ManageBrandPage"
      | SubmitButton |
    Examples:
      | Path to the file                           | Mission Input Text       | Brand Input Text                 | Brand Name Text | Tagline Input Text | Website               |
      | C:\Users\safe glazing\Desktop\autodesk.png | Exelenters Brand Mission | Here is Exelenters brand profile | Mercedes        | Here is tagline    | htmls://exelenter.com |
#      | C:\Users\safe glazing\Desktop\autodesk.png | Exelenters Brand Mission | Here is Exelenters brand profile | #$%@#$@#        | Here is tagline    | htmls://exelenter.com |
#      | C:\Users\safe glazing\Desktop\autodesk.png | Exelenters Brand Mission | Here is Exelenters brand profile |                 | Here is tagline    | htmls://exelenter.com |

  Scenario Outline: Manage Brand | Edit Function
    Given User clicks on "UserMenuPage"
      | Manage Brand |
    And User clicks on "ManageBrandPage"
      | EditButton |
    And User randomly selects option in the drop-down in "ManageBrandPage"
      | CompanyIdDropdown |
    And User sends the keys in "ManageBrandPage"
      | BrandImageInput       | <Path to the file>   |
      | BrandMissionInput     | <Mission Input Text> |
      | BrandProfileInfoInput | <Brand Input Text>   |
      | BrandNameInput        | <Brand Name Text>    |
      | BrandTaglineInput     | <Tagline Input Text> |
      | BrandWebsiteInput     | <Website>            |
    And User selects "Visibile" in the drop-down in "ManageBrandPage"
      | PublicVisibilityDropdown |
    And User clicks on "ManageBrandPage"
      | SubmitButton |
    Examples:
      | Path to the file                               | Mission Input Text           | Brand Input Text                     | Brand Name Text | Tagline Input Text   | Website            |
      | C:\Users\safe glazing\Desktop\ForExelenter.png | Exelenters Brand NEW Mission | Here is Exelenters NEW brand profile | Mercedes  NEW   | Here is tagline  NEW | htmls://google.com |
