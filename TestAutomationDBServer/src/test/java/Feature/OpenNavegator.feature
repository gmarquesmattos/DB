Feature: Access_website

Scenario: OpenBrowser
Given loading the browser
Then Page opened successfully
    
    
Scenario: Choose any product in the store
Given I'm  the homepage
When I choose a product
Then Selected Product
  
Scenario: Add the selected product to cart
When Click the Add to cart button
Then Confirmation and open window
  
  
Scenario: Validate product added to cart
Given  I'm on the main pagen
When I check the cart
Then Product selected successfully
 
 
Scenario: Sing in
Given main page
When  Click Sing in
Then success register page
 

Scenario: UserRegistration
When Cick the Create an account button 
Then Page accessed successfully 
 
 
Scenario: Registration Form
Given Page from user
When to register
Then customer successfully registered 
 
Scenario: Validation address
When I verify the address
Then to process
 
Scenario: AcceptTerm
When I select term
Then To Process



Scenario: Validation of value
When I check the values
Then Correct value


 Scenario: Payment
When I choose payment
And I want to proceed


