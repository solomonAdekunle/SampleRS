Feature: Choose your Connector
         User should be able to view and click on the links
         of each product on Cable and Wire page ,click order
         to add to basket, check prices.
         
         
#@ignore
@Runme @web
Scenario: User wanting to choose product via Choose your own
Given I Navigated to Cable and Wire Page on "browser"
When I click on Choose your own Connector link
Then I should Navigate to IndustrialPower Connector Page

@ignore
@CableAndWireProduct
Scenario: Adding SemiConnectorProduct to Basket
Given I am on Power Industrial Connector Page
When I click on Add button on PIC Product table
Then I should see my Product added 
 