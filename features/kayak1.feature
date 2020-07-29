
Feature: kayak functionality
  

  Scenario: Verify kayak page
  Given connect to "Browser"
 	When open "url"
 	Then click on "flights" option
 	Then click origin enter "startPlace"
 	And Click on destination enter "endPlace" 
 	Then click on startDate
 	And select dates "start", "end"
 	Then Click on search button
 	Then Close Covid Info Dialoug box
 	Then search result page will be visible
 	And page contains result flights
 	And select Nth flight from resultpage
 	Then start, end cities are same as entered
 	Then close the browser
 	
 