#Feature: Flight Search Feature
#  As a user, I want to find search flights between cities
#
#  Scenario: Verify That User is Able to Search Same Destination Flights
#
#    Given I am on Home page
#    When I click on Flights Tab
#    And I enter origin city "London"
#    And I enter destination city "Ahmedabad"
#    And I enter outbound date of travel "01/07/2020"
#    And I enter return travel date "19/07/2020"
#    And I add no travellers
#    And I click on search button
#    Then I must see flights to the same destination
#
#  Scenario: Verify That User is NOT Able to Search Wrong Destination Flights
#
#    Given I am on Home page
#    When I click on Flights Tab
#    And I enter origin city "Delhi"
#    And I enter destination city "Africa"
#    And I enter outbound date of travel "07/08/2020"
#    And I enter return travel date "21/08/2020"
#    And I add no travellers
#    And I click on search button
#    Then I must get No flights message between the cities
#

