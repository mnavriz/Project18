Feature: Login to staging.asian-promotions.com

  Background:
    Given User navigates to the asian-promotions website homepage
    When User sends the keys
      | Username | furkat.khalilov@gmail.com |
      | Password | 580202442                 |
    And User clicks on
      | Submit |
    Then User is logged in

  Scenario:
    Given User clicks on MenuBar
      | Dashboard          |
      | ManageProfiles     |
      | FavoritePromotions |
      | ManageCompany      |
      | ManageBrand        |
      | ManageStore        |
      | ManageEmployee     |
      | Message            |



