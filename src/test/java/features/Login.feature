Feature: Application Login

Background:
Given User is on NetBanking landing page1

@RegTest1
Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with "jin" and password "1234"
Then Home page is populated
And Cards displayed are "true"

@SmokeTest
Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with "john" and password "4321"
Then Home page is populated
And Cards displayed are "false"


@SmokeTest
Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with follwoing details
|jenny|abcd|jenny@gmail.com|Australia|12345|
Then Home page is populated
And Cards displayed are "false"

Scenario Outline: Home page default login
Given User is on NetBanking landing page
When User login into application with "<Username>" and  "<password>"
Then Home page is populated
And Cards displayed are "false"
Examples:
|Username|password|
|user1   |abc     |
|user2   |bcd     |
|user3   |efg     |
