$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("formFill.feature");
formatter.feature({
  "line": 1,
  "name": "Application form fill",
  "description": "",
  "id": "application-form-fill",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Fill the form with all the correct details",
  "description": "",
  "id": "application-form-fill;fill-the-form-with-all-the-correct-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I launch the application URL",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter the details in the form page",
  "rows": [
    {
      "cells": [
        "firstname",
        "Lastname",
        "address",
        "nationality",
        "gender",
        "interest"
      ],
      "line": 8
    },
    {
      "cells": [
        "Divya",
        "Pai",
        "Address",
        "India",
        "female",
        "cricket"
      ],
      "line": 9
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I submit the form",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "an alert for successful submission should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "FormFillStepsDefiniton.i_launch_the_application_URL()"
});
formatter.result({
  "duration": 152263400,
  "status": "passed"
});
formatter.match({
  "location": "FormFillStepsDefiniton.i_enter_the_details_in_the_form_page(DataTable)"
});
formatter.result({
  "duration": 5483800,
  "status": "passed"
});
formatter.match({
  "location": "FormFillStepsDefiniton.i_submit_the_form()"
});
formatter.result({
  "duration": 67000,
  "status": "passed"
});
formatter.match({
  "location": "FormFillStepsDefiniton.an_alert_for_successful_submission_should_be_displayed()"
});
formatter.result({
  "duration": 242600,
  "error_message": "java.lang.NullPointerException\r\n\tat utilities.BaseClass.browserShutDown(BaseClass.java:60)\r\n\tat stepDefinition.FormFillStepsDefiniton.an_alert_for_successful_submission_should_be_displayed(FormFillStepsDefiniton.java:61)\r\n\tat ✽.Then an alert for successful submission should be displayed(formFill.feature:11)\r\n",
  "status": "failed"
});
});