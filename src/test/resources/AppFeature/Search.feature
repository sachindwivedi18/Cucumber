Feature: AmazonSearch

@Regression
Scenario: Search a Product
Given I have a search field on Amazon Page
When I search for a product with name "Mac Book Pro" and price 1000
Then Product with "Mac Book Pro" should be displayed