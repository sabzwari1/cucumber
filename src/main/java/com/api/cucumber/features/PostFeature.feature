Feature: Post Feature Of Facebook
  This will test post functionality at users wall

  Scenario: Post a text on user wall
    Given User should be logged on
    And should be present at its own wall
    When I type the text in the post text box
    And Click on post button
    Then Message should be posted

  Scenario: Post a video on user wall
    Given User should be logged on
    And should be present at its own wall
    When user supply the youtube link in the share video text box
    And Click on post button
    Then Video should get posted on the user wall
    And The video should have proper thumbnail
