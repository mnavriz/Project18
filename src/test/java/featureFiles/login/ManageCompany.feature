Feature: Login to staging.asian-promotions.com

  Background:
    Given User navigates to the asian-promotions website homepage
    When User sends the keys in "loginPage"
      | Username | rafael@exelenter.com |
      | Password | rafael               |
    And User clicks on "loginPage"
      | Submit |

    Then User is logged in

  Scenario Outline: Manage Company | Fields Validation
    Given User clicks on "UserMenu"
      | ManageCompany |
    When User sends the keys in "ManageCompanyPage"
      | CompanyImage              | <Company Image>   |
      | CompanyName               | <Company Name>    |
      | CompanyTagline            | <Company Tagline> |
      | CompanyWebsite            | <Company Website> |
      | CompanyProfileInformation | <Company Profile> |
      | CompanyMission            | <Company Mission> |
      | CompanyRegistrationNo     | <Company Reg.No>  |
    And Selecting drop down
    And User clicks on "ManageCompanyPage"
      | SaveButton |
    And User verifies the test case in "ManageCompanyPage"
      | <Test Case Name> |

    Examples:
      | Company Image                              | Company Name | Company Tagline | Company Website       | Company Profile | Company Mission | Company Reg.No | Test Case Name |
      | C:\Users\safe glazing\Desktop\autodesk.png | Exelenter    | Search Anything | https://exelenter.com | Google Profile  | Google Mission  | 12345678       | Test Case 1.a  |
#      | C:\Users\Gareni\Pictures\awesome.jpg | GoogleGoogleGoogleGoogleGoogle | Search Anything | https://google.com | Google Profile  | Google Mission  | 12345678       | Test Case 1.b  |
#      | C:\Users\Gareni\Pictures\awesome.jpg | ?!$#’[]{}%^*+=@~`              | Search Anything | https://google.com | Google Profile  | Google Mission  | 12345678       | Test Case 1.c  |
#      | C:\Users\Gareni\Pictures\awesome.jpg | " "                            | Search Anything | https://google.com | Google Profile  | Google Mission  | 12345678       | Test Case 1.d  |
#      | C:\\Users\\safe glazing\\Desktop\\autodesk.png | Google$                        | Search Anything | https://google.com | Google Profile  | Google Mission  | 12345678       | Test Case 1.c  |
#      | C:\\Users\\safe glazing\\Desktop\\autodesk.png | Google#                        | Search Anything | https://google.com | Google Profile  | Google Mission  | 12345678       | Test Case 1.c  |
#      | C:\\Users\\safe glazing\\Desktop\\autodesk.png | Google'                        | Search Anything | https://google.com | Google Profile  | Google Mission  | 12345678       | Test Case 1.c  |
#      | C:\\Users\\safe glazing\\Desktop\\autodesk.png | Google[                        | Search Anything | https://google.com | Google Profile  | Google Mission  | 12345678       | Test Case 1.c  |
#      | C:\\Users\\safe glazing\\Desktop\\autodesk.png | Google]                        | Search Anything | https://google.com | Google Profile  | Google Mission  | 12345678       | Test Case 1.c  |
#      | C:\\Users\\safe glazing\\Desktop\\autodesk.png | Google{                        | Search Anything | https://google.com | Google Profile  | Google Mission  | 12345678       | Test Case 1.c  |
#      | C:\\Users\\safe glazing\\Desktop\\autodesk.png | Google}                        | Search Anything | https://google.com | Google Profile  | Google Mission  | 12345678       | Test Case 1.c  |
#      | C:\\Users\\safe glazing\\Desktop\\autodesk.png | Google%                        | Search Anything | https://google.com | Google Profile  | Google Mission  | 12345678       | Test Case 1.c  |
#      | C:\\Users\\safe glazing\\Desktop\\autodesk.png | Google^                        | Search Anything | https://google.com | Google Profile  | Google Mission  | 12345678       | Test Case 1.c  |
#      | C:\\Users\\safe glazing\\Desktop\\autodesk.png | Google*                        | Search Anything | https://google.com | Google Profile  | Google Mission  | 12345678       | Test Case 1.c  |
#      | C:\\Users\\safe glazing\\Desktop\\autodesk.png | Google+                        | Search Anything | https://google.com | Google Profile  | Google Mission  | 12345678       | Test Case 1.c  |
#      | C:\\Users\\safe glazing\\Desktop\\autodesk.png | Google=                        | Search Anything | https://google.com | Google Profile  | Google Mission  | 12345678       | Test Case 1.c  |
#      | C:\\Users\\safe glazing\\Desktop\\autodesk.png | Google@                        | Search Anything | https://google.com | Google Profile  | Google Mission  | 12345678       | Test Case 1.c  |
#      | C:\\Users\\safe glazing\\Desktop\\autodesk.png | Google~                        | Search Anything | https://google.com | Google Profile  | Google Mission  | 12345678       | Test Case 1.c  |
#      | C:\\Users\\safe glazing\\Desktop\\autodesk.png | Google"                        | Search Anything | https://google.com | Google Profile  | Google Mission  | 12345678       | Test Case 1.c  |
#      | C:\\Users\\safe glazing\\Desktop\\autodesk.png | ?!$#’[]{}%^*+=@~`              | Search Anything | https://google.com | Google Profile  | Google Mission  | 12345678       | Test Case 1.c  |
#      | C:\\Users\\safe glazing\\Desktop\\autodesk.png |                                | Search Anything | https://google.com | Google Profile  | Google Mission  | 12345678       | Test Case 1.d  |