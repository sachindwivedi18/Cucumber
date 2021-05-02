Feature: User registeration

Scenario: User registeration with different data.
Given  User is on registeration page
When user enters following user details
	| naveen | automation | nav@gmail.com| 99999 | Banglore |
	| tom    | peter      | tom@gmail.com| 00000 | Delhi    |
Then user registeration should be sucessful
	| firstName | lastName | email   | phone | city |
	| naveen  |  auto | nav@gmail | 0000 | Bang |
	| tom | dev | tom@gmail |  99999 | Delhi|
	
	
Scenario Outline: Login fail -possible combination
	Given user is on App page
	When user clicks on sign in button
	Then user is displayed on login screen
	When user enters "<Username>" in username
	Then failed error message appears
	
Examples:
	| Username   |
	| Ram 			 |
	| Shyam      |