
Feature: Launch Application
 
  Scenario Outline: Verify that user should able to launch application successfully
    Given the user is on the homepage of AdNabuTestStore
    When the user enters a valid product name "<ProductName>" in the search bar
    Then the homepage of AdNabuTestStore should be displayed without errors
    
    Examples:
			|ProductName|
			|14k wire bloom earrings|	
   