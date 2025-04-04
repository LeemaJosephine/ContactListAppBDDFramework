Feature: Login functionality of Contact List application

Background:
    Given Open the browser "chrome"
    And Launch the url "https://thinking-tester-contact-list.herokuapp.com/"
    
Scenario Outline: Login functionality with valid credentials
	When Valid Email is entered <email>
	And Valid password is entered <password>
	And Submit button is clicked
	Then Corresponding output should display "<testtype>" and "<expectedMessage>"
	
Examples:
|email|password|testtype|expectedMessage|
|abcd@example.com|testing|VaildDetails|Contact List|
|dummy@example.com|testing|InavlidMail|Incorrect username or password|