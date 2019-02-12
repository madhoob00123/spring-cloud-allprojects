Feature: to test the greeting ribbon app
Scenario: to validate Load balancing
Given the Greeting service
When application loads
Then it should return the Quote from fortune service