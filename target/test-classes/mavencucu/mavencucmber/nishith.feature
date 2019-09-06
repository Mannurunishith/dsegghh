
Feature: TestMeApp
  I want to use this template for my feature file


   Scenario: Registration
   Given User enters in Homepage
   When User clicks the SignUp button
   Given User enters Username "odin" in field
   Given User enters firstname "Super" in field
   Given User enters lastname "Man" in field
   Given User enters password "Nishithre" in field
   Given User enters confirmpassword "Nishithre" in field
   Given User enters gender "Male" in field
   Given User enters email "Superman@mail.com" in field
   Given User enters mobilenumber "8775454878" in field
   Given User enters dob "10/12/1785" in field
   Given User enters address "Asgard" in field
   Given User enters security question "What is your birth place?" in field
   Given User enters answer "Asgard" in field  
   Then user clicks Register button
   Then Login page is diplayed   


      Scenario Outline: login
      Given user enters the home page
      And user clicks on login
      And user enters the username "<username>" 
      And user enters the password "<password>" 
      And clicks on login
      And Homepage is displayed
      And searches headphones in the search box
      And add to cart
      Examples:
      | username  | password        | 
      | Lalitha   |     password123 | 
      
      
      
 
      
      
      
      
      
      
      
      
      
       
  Scenario Outline: buying
    Given alex enters the home page
    And  alex clicks on login button
   And  alex enter the username "<username>" 
   And  alex enter the password "<password>" 
      And alex click on login button
      And Homepage is displayed for alex
      And alex searches for headphones in the search box "<search>" 
     # And alex selects the headphone option from drop down 
      And alex click find details button
      And alex adds the item to cart
      And alex clicks on cart option
      And alex Removes the quantity
      #Then alex selects check out
Examples:
      | username  | password        | search |
      | Lalitha   |     password123 | Headphone  |
      
      
      
      
