$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Search.feature");
formatter.feature({
  "line": 1,
  "name": "AmazonSearch",
  "description": "",
  "id": "amazonsearch",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Search a Product",
  "description": "",
  "id": "amazonsearch;search-a-product",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I have a search field on Amazon Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I search for a product with name \"Mac Book Pro\" and price 1000",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Product with \"Mac Book Pro\" should be displayed",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("Uber.feature");
formatter.feature({
  "line": 1,
  "name": "Uber Booking feature",
  "description": "",
  "id": "uber-booking-feature",
  "keyword": "Feature"
});
formatter.background({
  "comments": [
    {
      "line": 3,
      "value": "# Common steps for below scenarios"
    }
  ],
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "User wants to select a car type \"sedan\" from uber app",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 9,
  "name": "Booking cab",
  "description": "",
  "id": "uber-booking-feature;booking-cab",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "user selects car \"sedan\" and pick up point \"Banglore\" and drop location \"Pune\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Driver starts the journey",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Driver ends the journey",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User pays 100 USD",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.background({
  "comments": [
    {
      "line": 3,
      "value": "# Common steps for below scenarios"
    }
  ],
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "User wants to select a car type \"sedan\" from uber app",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 16,
  "name": "Booking bus",
  "description": "",
  "id": "uber-booking-feature;booking-bus",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "user selects car \"sedan\" and pick up point \"Banglore\" and drop location \"Pune\"",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "Driver starts the journey",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Driver ends the journey",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User pays 100 USD",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("User.feature");
formatter.feature({
  "line": 1,
  "name": "User registeration",
  "description": "",
  "id": "user-registeration",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User registeration with different data.",
  "description": "",
  "id": "user-registeration;user-registeration-with-different-data.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is on registeration page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters following user details",
  "rows": [
    {
      "cells": [
        "naveen",
        "automation",
        "nav@gmail.com",
        "99999",
        "Banglore"
      ],
      "line": 6
    },
    {
      "cells": [
        "tom",
        "peter",
        "tom@gmail.com",
        "00000",
        "Delhi"
      ],
      "line": 7
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user registeration should be sucessful",
  "rows": [
    {
      "cells": [
        "firstName",
        "lastName",
        "email",
        "phone",
        "city"
      ],
      "line": 9
    },
    {
      "cells": [
        "naveen",
        "auto",
        "nav@gmail",
        "0000",
        "Bang"
      ],
      "line": 10
    },
    {
      "cells": [
        "tom",
        "dev",
        "tom@gmail",
        "99999",
        "Delhi"
      ],
      "line": 11
    }
  ],
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenarioOutline({
  "line": 14,
  "name": "Login fail -possible combination",
  "description": "",
  "id": "user-registeration;login-fail--possible-combination",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 15,
  "name": "user is on App page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "user clicks on sign in button",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user is displayed on login screen",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user enters \"\u003cUsername\u003e\" in username",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "failed error message appears",
  "keyword": "Then "
});
formatter.examples({
  "line": 21,
  "name": "",
  "description": "",
  "id": "user-registeration;login-fail--possible-combination;",
  "rows": [
    {
      "cells": [
        "Username"
      ],
      "line": 22,
      "id": "user-registeration;login-fail--possible-combination;;1"
    },
    {
      "cells": [
        "Ram"
      ],
      "line": 23,
      "id": "user-registeration;login-fail--possible-combination;;2"
    },
    {
      "cells": [
        "Shyam"
      ],
      "line": 24,
      "id": "user-registeration;login-fail--possible-combination;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 23,
  "name": "Login fail -possible combination",
  "description": "",
  "id": "user-registeration;login-fail--possible-combination;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 15,
  "name": "user is on App page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "user clicks on sign in button",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user is displayed on login screen",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user enters \"Ram\" in username",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "failed error message appears",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 24,
  "name": "Login fail -possible combination",
  "description": "",
  "id": "user-registeration;login-fail--possible-combination;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 15,
  "name": "user is on App page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "user clicks on sign in button",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user is displayed on login screen",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user enters \"Shyam\" in username",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "failed error message appears",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});