$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/home/cdelabs/workspace/spring-cloud-pleasedontdelete/greeting-ribbon/src/test/repository/feature/myfeature.feature");
formatter.feature({
  "name": "to test the greeting ribbon app",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "to validate Load balancing",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the Greeting service",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefs.java:7"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "application loads",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.java:11"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "it should return the Quote from fortune service",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.java:14"
});
formatter.result({
  "status": "passed"
});
});