Feature: test scenario

  Background::
    When prepare

  Scenario: Test scenario
    When send request "1"
    Then resp "1"