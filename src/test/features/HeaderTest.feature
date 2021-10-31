Feature: HeaderTests
  As a user
  I should get redirected appropriately.

  @HeaderTests
  Scenario: Verify header links redirection.


    Given I'm on HomePage "https://www.next.co.uk"
    When I click on MyAccountLink
    Then I should be on the appropriate page with title as "Myaccount"