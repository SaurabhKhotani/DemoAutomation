Feature: Validate Login feature.

Scenario: To validate user gets error message at login page when wrong username is entered

Given user naviagtes to 'https://www.amazon.in/'
Then user clicks on sign button
Then user enters 'uyiuuii' as username
Then user click on continue button
And user validates error message.


Scenario: To validate user gets error message at login page when wrong password is entered.

#Given user naviagtes to 'https://www.amazon.in/'
#Then user clicks on sign button
Then user enters 'saurabhk619@gmail.com' as username
Then user click on continue button
Then user enters 'uyiuhuy' as password
#Then user click on signIn button
#And user validates error message.


