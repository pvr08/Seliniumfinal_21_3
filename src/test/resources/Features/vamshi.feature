#Author: Vamshidhar Reddy

@tag
Feature: Vamshi test Cases
  Sample Test cases writter for Contact Us Page


 @tag1
 Scenario: Validate  lables in contact us page 
    Given browser is open
    When user is on nandamuri website
    And user is navigated to contact us page
    And user is able to see name label 
    And user is able to see email label
    And user is able to see contact number label
    And user is able to see subject label
    And user is able to see message label
    And user is able to see send message button
    Then end of test cases
    
    
 @tag2
 Scenario: Validate  fields in contact us page 
    Given browser is open
    When user is on nandamuri website
    And user is navigated to contact us page
    And user is able to see name text field 
    And user is able to see email field
    And user is able to see contact number field
    And user is able to see subject field
    And user is able to see message field
    Then end of test cases
    
    
 @tag3
 Scenario: Validate phone, location and email in contact us page
    Given browser is open
    When user is on nandamurisloution website
    And user is navigated to contact us page
    And user is able to see the phone number label
    And user is able to see Location label
    And user is able to see email address label
    Then end of the test cases
    
    
 @tag4
 Scenario: Validate google maps in contact us page
    Given browser is open
    When user is on nandamurisloution website
    And user is navigated to contact us page
    And user is able to see google maps in contact us page
    Then end of test cases
    
    
 @tag5
 Scenario: Validate social platform icons in the contact us page
    Given browser is open
    When user is on google search
    And user is on nandamurisloution website
    And user is navigated to contact us page
    And user is able to see facebook icon in contact us page
    And user is able to see twitter icon in contact us page
    And user is able to see insta icon in contact us page
    And user is able to see linkedin icon in contact us page
    Then end of test cases
    
    