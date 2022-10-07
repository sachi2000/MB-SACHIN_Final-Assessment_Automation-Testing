Feature: HRM Login Test Case
Scenario: Verify user is able to login with valid user id and
password
Given browser is open and application is in login page
When user enters username and password
Then home page is displayed
Then apply leave is displayed


Scenario: search the given condition
When search
Then searchall
