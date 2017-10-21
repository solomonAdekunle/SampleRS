Feature: All Products Menu
         As A User I should be able to View and Navigate
         to each Products category within the All Product Menu
         
         
#@ignore 
@Runme
Scenario: Navigating to Cable wire page
Given I Navigate to the Home Page on "browser"  
When I click on all Product menu
 And I click on Cable Wire link
Then I Should see Cable wire Page 
  
@ignore
@AllProductMenu  
Scenario: Navigating to SemiConductor page
Given I Navigate to the Home Page on "browser"  
When I click on all Product menu
 And I click on SemiConductor
Then I Should be displayed with SemiConductor Page   
         