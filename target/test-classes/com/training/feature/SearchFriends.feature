@search
Feature: search my friends
Scenario: search my friends
Given Login to facebook application
When search friend in homr page
Then verify that friend is search successfully
And Logout from the facebook Application