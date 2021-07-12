Feature: validate the skyWhite background

Background:
Given   User can able to land on the  given url

Scenario:  setting skywhite background change
When  Set SkyWhite Background button exists
When I click on the  White button                        
Then the background color will change to skyWhite
