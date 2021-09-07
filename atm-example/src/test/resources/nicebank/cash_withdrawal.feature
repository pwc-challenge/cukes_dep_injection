Feature: Cash Withdrawal
  Scenario: Successful withdrawal from an account in credir
    Given I have deposited $100.00 in my account
    When I request $20
    Then $20 should be dispensed