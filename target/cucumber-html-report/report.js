$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/kayak1.feature");
formatter.feature({
  "line": 2,
  "name": "kayak functionality",
  "description": "",
  "id": "kayak-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Verify kayak page",
  "description": "",
  "id": "kayak-functionality;verify-kayak-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "connect to \"Browser\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "open \"url\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "click on \"flights\" option",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "click origin enter \"startPlace\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Click on destination enter \"endPlace\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "click on startDate",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "select dates \"start\", \"end\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Click on search button",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Close Covid Info Dialoug box",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "search result page will be visible",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "page contains result flights",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "select Nth flight from resultpage",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "start, end cities are same as entered",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Browser",
      "offset": 12
    }
  ],
  "location": "stepDefin.connect_to(String)"
});
formatter.result({
  "duration": 6822301600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "url",
      "offset": 6
    }
  ],
  "location": "stepDefin.open(String)"
});
formatter.result({
  "duration": 1830778800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "flights",
      "offset": 10
    }
  ],
  "location": "stepDefin.click_on_option(String)"
});
formatter.result({
  "duration": 2576456100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "startPlace",
      "offset": 20
    }
  ],
  "location": "stepDefin.click_origin_enter(String)"
});
formatter.result({
  "duration": 3668158400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "endPlace",
      "offset": 28
    }
  ],
  "location": "stepDefin.click_on_destination_enter(String)"
});
formatter.result({
  "duration": 2269854400,
  "status": "passed"
});
formatter.match({
  "location": "stepDefin.click_on_startDate()"
});
formatter.result({
  "duration": 1256524700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "start",
      "offset": 14
    },
    {
      "val": "end",
      "offset": 23
    }
  ],
  "location": "stepDefin.select_dates(String,String)"
});
formatter.result({
  "duration": 2329808200,
  "status": "passed"
});
formatter.match({
  "location": "stepDefin.click_on_search_button()"
});
formatter.result({
  "duration": 83395000,
  "status": "passed"
});
formatter.match({
  "location": "stepDefin.close_Covid_Info_Dialoug_box()"
});
formatter.result({
  "duration": 1636140100,
  "status": "passed"
});
formatter.match({
  "location": "stepDefin.search_result_page_will_be_visible()"
});
formatter.result({
  "duration": 1689236600,
  "status": "passed"
});
formatter.match({
  "location": "stepDefin.page_contains_result_flights()"
});
formatter.result({
  "duration": 281130500,
  "status": "passed"
});
formatter.match({
  "location": "stepDefin.select_Nth_flight_from_resultpage()"
});
formatter.result({
  "duration": 5305644700,
  "status": "passed"
});
formatter.match({
  "location": "stepDefin.start_end_cities_are_same_as_entered()"
});
formatter.result({
  "duration": 677967700,
  "status": "passed"
});
formatter.match({
  "location": "stepDefin.close_the_browser()"
});
formatter.result({
  "duration": 371750700,
  "status": "passed"
});
});