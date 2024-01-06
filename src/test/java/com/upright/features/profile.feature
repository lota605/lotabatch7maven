Feature: Verifying the profile web application
# Feature, Background,Given(precondition), When (Action), Then(Validation/test)
  Background: The Profile link is visible
    Given The profile link is loaded in the browser


    Scenario:TC-101- Verify that the title shows something meaningful
      When user take capture the title
      Then the title should be something meaningful

      Scenario:  Tc-102 Verify the url
        When User  captur the url
        Then the url should be with http and the name


 # Scenario: Tc-103 Verify that the input box is available
   # When user click on it
    #Then it shows All the Testing tool name

  #Scenario: Tc-104
   ##Then User can type Jira

  #Scenario: Tc-105
   # When User Click on the facebook link
   # Then it should take it to the Facebook Page

  #Scenario: Tc-106
   # When User Click on Linkedin Link
   # Then it should take it to Linkedin Page