#Author: jose.blandon@ceiba.com.co

Feature: Google Translate
  As a web user
  I want to use Google Translate
  to translate words between different languages

  Scenario: Translate from english to italian
    Given that Antonio wants to translate a word
    When he translates the word Cheese from English to Italian
    Then he should see the word Formaggio in the screen