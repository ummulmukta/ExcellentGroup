Feature: Amazon login funtionality test
Scenario: positive scenario withb valid credentials
Given user on home page
When user able to click signinbutton
And user can enter email
And user can click continue
And user can enter password
And user click signin
Then user able to go home signin successfully

