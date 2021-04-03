Feature: Place an order on Amazon

Scenario Outline: Order should be placed with 2 items with Multiple quantities.

Given user naviagtes to 'https://www.amazon.in/'
Then user searches for item1 "<item>"
Then user click on item and select quantity '2'
Then user add item to cart
Then user searches for item2 "<item>"
Then user click on item and select quantity '3'
Then user add item to cart
And user validates "<item1>" "<item2>" items in cart.

Examples:
	|item   |
	|books for kids|
	|shirt for boys|
