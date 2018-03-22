Feature: Post Feature Of Facebook
  This will test post functionality at users wall

  Background: Common Step
    Given User should be logged on
    And should be present at its own wall

  Scenario: Post a text on user wall
    When I type the text "Hi how are you" in the post text box
    And Click on post button
    Then Message should be posted

  Scenario: Post a video on user wall
    When user supply the youtube link "www.youtube.com" in the share video text box
    And Click on post button
    Then Video should get posted on the user wall
    And The video should have proper thumbnail
