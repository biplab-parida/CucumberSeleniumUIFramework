@regression
Feature: Get the first returned value in Search

  @tag1
  Scenario Outline: Open Google and verify the first returned value
    Given user is on home page where URL is <url>
    When user search for <searchValue> in <searchEngine>
    Then get the first returned value in <searchEngine> and compare with <expectedValue>

    Examples: 
      | searchValue | expectedValue             | searchEngine | url                     |
      | "fiserv"    | "https://www.fiserv.com/" | "google"     | "http://www.google.com" |
      | "fiserv"    | "https://www.fiserv.com/" | "yahoo"      | "http://www.yahoo.com" |
