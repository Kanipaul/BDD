Meta:
@Delta
@invalidRegistration

Narrative:
In order to test the registration functionality
As a tester
I want to be able to create an account with the application
					 
Scenario:  verify the user is able to register

Given the user is in homepage
Then the user waits for '2' seconds
When the user clicks on skymiles
And the user clicks on join sky miles
And the user enters <'firstName'>,<'lastName'>
And the user selects dob and gender
And the user clicks on complete button
Then the welcome page should appear
Examples:
General.table
