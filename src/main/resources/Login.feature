@Smoke @Regression 
Feature: Login function test
#description : credential must be valid
#background: 

@Positive @TC_01
Scenario: testing login function with valid credential

Given open a browser
And go to application URL
When put valid user
And put valid password
And click login btn
Then test will pass if log out btn found

