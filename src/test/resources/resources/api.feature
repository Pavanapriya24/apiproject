@Functionaltest
Feature: To test the Banking Application.


 @POSTaccount
 Scenario Outline: To check how many accounts are present.

    Given a user

    When the user send request with "<title>", "<Type>", "<Holdertype>", "<AccountNo>", "<Balance>" to BANKING SITE

    Then the status code of BANKING SITE should be "<statusCode>"

    And user id sould be created in Banking Application.
    
    Examples:
    | title | Type | Holdertype | AccountNo | Balance |statusCode|
    | PRIYANKA | current | Single | 1000044 | 300000 |201|
    
#    @putmethod
##@firstaccount
## Scenario Outline: To check how many accounts are present.
##
##    Given a user
##
##    When the user update details request with "<title>"
##    Then the status code of BANKING SITE should  "<statusCode>"
##
##    
##    Examples:
##    | title |statusCode|
##    | PRIYANKA |200|    
    
    
    

   
	
@deleteaccount
Scenario: To check account is deleted

Given a user

    When the user send request to delete the account details from banking site
    And user sould be able to delete the account details.
   Then the status code should  displayed

    


@getaccountdetails
Scenario: To check account details of 

Given a user

    When the user send request to fetch the account details from banking site
    
  Then the status code should be displayed

   And user sould be able to call the account details

@getiddetails
Scenario: To check account details of id=3,4 

Given a user

    When the user send request for particular id to fetch the account details from banking site
    
  Then the status code should  displayed when it get from the site

   And user sould be able to call the id account details.


@getjointaccount
Scenario: To display joint account details
Given a user

    When the user send request  to fetch the joint account details from banking site
    
  Then the status code should  display when it get from the site

   And user sould be able to call the joint account details.




@sort
Scenario: To sort the details
Given a user
When the user send resquest to sort details
Then the status code should display 
And user is able to sort the details

@Pagination
Scenario: To paginate the details
Given a user
When the user send resquest to paginate details
Then  status code should display 
And user is able to paginate the details

@accountends02
Scenario: To check how many account number ends with 02
Given a user
When the user sends the request to find the number of accounts ends with 02
Then the count for account number ends with 02
And the count for those ends with 02 accounts will be displayed

@balancecheck
Scenario: To check how many accounts are greater than 200000
Given a user
When the user will send the request to display the number of accounts that have balance greater
Then the greater than 200000 account balance accounts will be displayed