$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/uk/co/expedia/recources/featurefile/login.feature");
formatter.feature({
  "line": 1,
  "name": "Login feature",
  "description": "\r\nAs a user, I want to login in to expedia.co.uk successfully",
  "id": "login-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 14159586800,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User should login successfully with valid credentials",
  "description": "",
  "id": "login-feature;user-should-login-successfully-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I am on Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I clickOnAccountTab",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I clickOnSignInTab",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter valid Email \"JamesB1234@gmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I enter valid password \"James123\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I should login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTestSteps.iAmOnHomePage()"
});
formatter.result({
  "duration": 156392500,
  "status": "passed"
});
formatter.match({
  "location": "LoginTestSteps.iClickOnAccountTab()"
});
formatter.result({
  "duration": 294355000,
  "status": "passed"
});
formatter.match({
  "location": "LoginTestSteps.iClickOnSignInTab()"
});
formatter.result({
  "duration": 294740800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "JamesB1234@gmail.com",
      "offset": 21
    }
  ],
  "location": "LoginTestSteps.iEnterValidEmail(String)"
});
formatter.result({
  "duration": 2756181000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "James123",
      "offset": 24
    }
  ],
  "location": "LoginTestSteps.iEnterValidPassword(String)"
});
formatter.result({
  "duration": 357014400,
  "status": "passed"
});
formatter.match({
  "location": "LoginTestSteps.iClickOnLoginButton()"
});
formatter.result({
  "duration": 260558100,
  "status": "passed"
});
formatter.match({
  "location": "LoginTestSteps.iShouldLoginSuccessfully()"
});
formatter.result({
  "duration": 264255000,
  "status": "passed"
});
formatter.after({
  "duration": 788505000,
  "status": "passed"
});
formatter.before({
  "duration": 12871507800,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "User should Not login successfully with invalid credentials",
  "description": "",
  "id": "login-feature;user-should-not-login-successfully-with-invalid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "I am on Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I clickOnAccountTab",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I clickOnSignInTab",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I enter valid Email \"abc1234@gmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I enter valid password \"Tajmahal123\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I should Not login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTestSteps.iAmOnHomePage()"
});
formatter.result({
  "duration": 32700,
  "status": "passed"
});
formatter.match({
  "location": "LoginTestSteps.iClickOnAccountTab()"
});
formatter.result({
  "duration": 225351700,
  "status": "passed"
});
formatter.match({
  "location": "LoginTestSteps.iClickOnSignInTab()"
});
formatter.result({
  "duration": 258184100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc1234@gmail.com",
      "offset": 21
    }
  ],
  "location": "LoginTestSteps.iEnterValidEmail(String)"
});
formatter.result({
  "duration": 2564868500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tajmahal123",
      "offset": 24
    }
  ],
  "location": "LoginTestSteps.iEnterValidPassword(String)"
});
formatter.result({
  "duration": 461024600,
  "status": "passed"
});
formatter.match({
  "location": "LoginTestSteps.iClickOnLoginButton()"
});
formatter.result({
  "duration": 258769400,
  "status": "passed"
});
formatter.match({
  "location": "LoginTestSteps.iShouldNotLoginSuccessfully()"
});
formatter.result({
  "duration": 105096000,
  "status": "passed"
});
formatter.after({
  "duration": 747648700,
  "status": "passed"
});
});