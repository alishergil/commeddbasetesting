@Search @Filter @Smoke @Sanity @wip
Feature: Search Functionality

  AS an end user
  I WANT TO visit Meddbase website
  SO THAT I may know more about their business

  Background:
    Given User is on patientbooking homepage
    Scenario: Login
      When user clicks on login button
      Then user can see homepage
      And user will signup / register