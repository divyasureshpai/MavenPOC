Feature: Application form fill
	
Scenario: Fill the form with all the correct details

Given I launch the application URL
When I enter the details in the form page

| firstname| Lastname | address | nationality | gender | interest |
| Divya | Pai | Address | India | female | cricket|
And I submit the form
Then an alert for successful submission should be displayed
