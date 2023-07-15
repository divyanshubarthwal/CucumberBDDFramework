Feature: Application Login



@RegTest1
Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with "jin" and password "1234"
Then Home page is populated
And Cards displayed are "true"

@RegTest1
Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with "john" and password "4321"
Then Home page is populated
And Cards displayed are "false"


@RegTest1
Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with follwoing details
|jenny|abcd|jenny@gmail.com|Australia|12345|
Then Home page is populated
And Cards displayed are "false"

@RegTest2
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
