Feature: Search and place the order for products

Scenario: Search Experience for product search in both Home and Offers page
Given User is on GreenCart Landing Page
When User searched with Shortname "Tom" and extract actual name of the product
Then User searched for "Tom" Shortname in offers page 
And Validate product name in offers page matches with Landing Page
