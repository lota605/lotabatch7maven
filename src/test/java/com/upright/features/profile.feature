Feature: Verifying the profile web application

  Background: The Profile link is visible
    Given The profile link is loaded in the browser


    Scenario:TC-101- Verify that the title shows something meaningful
      When user take capture the title
      Then the title should be something meaningful