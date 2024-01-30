#Author: Vishal
@tag
Feature: Vishal test Cases
  Sample Test cases writter for Services Page

  @tag1
  Scenario: Validate header of nandamurisolutions
    Given browser is open
    When user is on nandamuri website home page
    And user is able to see the logo image
    And user is able to see Home button
    When user clicks Home
    Then user navigates to nandamuri home page
    And user is able to see About us button
    When user clicks About us 
    Then user navigates to About us page
    Then user navigates back to nandamuri website home page

     And user is able to see services button
    When user hovers on services button 
    Then user is able to see dropdown list
    
     And user Expands  Services dropdown 
    When Clicks on ML service  
    Then user navigates to ML service page 
    Then user navigates back to nandamuri website home page

    And user Expands  Services dropdown 
    When Clicks on Data Engineering service  
    Then user navigates to Data Engineering service page 
    Then user navigates back to nandamuri website home page
   
    
    And user Expands  Services dropdown 
    When Clicks on Testing service  
    Then user navigates to Testing service page 
    Then user navigates back to nandamuri website home page
    
    
    And user Expands  Services dropdown 
    When Clicks on Fullstack service  
    Then user navigates to Fullstack service page 
    Then user navigates back to nandamuri website home page
    
    
    And user Expands  Services dropdown 
    When Clicks on Devops service  
    Then user navigates to Devops service page 
    Then user navigates back to nandamuri website home page
   
    And user is able to see contact us button
    When Clicks on contact us button
    Then navigate to contact us page
    And user is able to see whatsapp logo
    And user is able to see contact number 
    Then End of the test
    
  @tag2
  Scenario: Validate homge page label of nandamurisolutions.ca
   Given browser is open
   When user is on home page of nandamurisolutions
   And user is able to the We offer you the best IT practise and services label
   And user is able to see Get Started button
   When clicks on Get started
   Then user navigates to contact us page
   And user is able to see Empower, Scale, Succeed: Unleashing IT Services for Your Agency Benefit label
   And user is able to see the Image1
   And user is able to see the Image2
   And use is able to see Our Technology label
   And user is able to see the background image
   
   Then End of the test
   
  @tag3
  Scenario: Validate Testing, full stack  DevOps Div elements of Home page
   Given browser is open
   When user is on home page of nandamurisolutions
   And user is able to see Testing service logo
   And user is able to see Testing Label(&button)
   When Clicks on Testing
   Then Navigates to Testing service page
   And user navigates back to nandamuri website home page
   And user is able to see We focus on the best practices for it solutions and services label
   
    And user is able to see Full Stack service logo
   And user is able to see Full Stack Label(&button)
   When Clicks on Full Stack
   Then Navigates to Full Stack service page
   And user navigates back to nandamuri website home page
   And user is able to see We focus on the best practices for it solutions and services label
   
    And user is able to see DevOps service logo
   And user is able to see DevOps Label(&button)
   When Clicks on DevOps
   Then Navigates to DevOps service page
   And user navigates back to nandamuri website home page
   And user is able to see We focus on the best practices for it solutions and services label
   Then End of the test
   
   
  @tag4
  Scenario: Validate the Video button on Home page of nandamurisolutions.ca
   Given browser is open
   When user is on home page of nandamurisolutions 
   And user is able to see the video button logo
   When clicks on video button logo
   Then it Opens a Pop-up with a youtube Video
   Then End of the test
   
  
  @tag5
  Scenario: Validate the Footer elements of nandamurisolutions.ca
   Given browser is open
   And user is on home page of nandamurisolutions 
   And user is able to see About Company label
   And user is able to see Empowering the future of tech with our cutting-edge IT services, paving the way for innovation and success label
   And user is able to see Facebook logo 
   And user is able to see Twitter logo 
   And user is able to see Youtube logo 
   And user is able to see Linkedin logo 
   And user is able to see Contacts label
   And user is able to see Adress label
   And user is able to see 3080 Yonge Street suite 6060 Toronto M4N 3N1 CANADA Ontario, Canada label
   And user is able to see Email label
   And user is able to see raman@nandamurisolutionsinc.ca label
   And user is able to see Phone label
   And user is able to see 1 (647) 313-6820 label
   And user is able to see Newsletter label
   And user is able to see Subscribe to our newsletter to receive updates on the latest news! label
   And user is able to see subscribe with us text field 
   And user is able to see submit button logo
   And user is able to see © 2024 Nandamuri Solutions |  Powered by Lazarus Info tech label
   Then End of the test 
    
