Meta:
@Delta
@addToCartAndRemoveFromCart

Narrative:
In order to test the add to cart and remove from cart functionality
As a tester
I want to be able to access its home page, add pass to cart and remove pass from the cart
					 
Scenario:  verify the user is able to add and remove a pass to and from the cart

Given the user is in homepage
Then the user waits for '2' seconds
When the user clicks on travelling with us
And the user clicks on delta sky club
And the user clicks on One day pass
And the user selects option
And the user enter <'quantity'>,<'address'>,<'city'>, <'zip'>
And the user selects location and state
And the user clicks on add to cart
Then the user waits for '5' seconds
Then the pass should be added to cart
When the user clicks on cart symbol
And the user clicks on remove button
Then the pass should be removed from the cart

Examples:
General.table
