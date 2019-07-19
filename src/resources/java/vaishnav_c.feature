Feature: Login Functionality

Scenario: User login
Given user must be registered
When user logs in with below credentials
|username||password|
|abc||abc|
|xyz||xyz|
Then User is directed to the home page



