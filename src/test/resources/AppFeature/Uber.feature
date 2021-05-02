Feature: Uber Booking feature

# Common steps for below scenarios

Background:
Given User wants to select a car type "sedan" from uber app 

@Smoke
Scenario: Booking cab
When user selects car "sedan" and pick up point "Banglore" and drop location "Pune"
Then Driver starts the journey
And Driver ends the journey
Then User pays 100 USD

@Smoke
Scenario: Booking bus
When user selects car "sedan" and pick up point "Banglore" and drop location "Pune"
Then Driver starts the journey
And Driver ends the journey
Then User pays 100 USD