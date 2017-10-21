$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AllProductMenu.feature");
formatter.feature({
  "line": 1,
  "name": "All Products Menu",
  "description": "       As A User I should be able to View and Navigate\r\n       to each Products category within the All Product Menu",
  "id": "all-products-menu",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9327200073,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 6,
      "value": "#@ignore"
    }
  ],
  "line": 8,
  "name": "Navigating to Cable wire page",
  "description": "",
  "id": "all-products-menu;navigating-to-cable-wire-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@Runme"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I Navigate to the Home Page on \"browser\"",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I click on all Product menu",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I click on Cable Wire link",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I Should see Cable wire Page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "browser",
      "offset": 32
    }
  ],
  "location": "StepDefHomePage.i_Navigate_to_the_Home_Page_on(String)"
});
formatter.result({
  "duration": 6610966826,
  "status": "passed"
});
formatter.match({
  "location": "StepDefHomePage.i_click_on_all_Product_menu()"
});
formatter.result({
  "duration": 309144980,
  "status": "passed"
});
formatter.match({
  "location": "StepDefHomePage.i_click_on_Cable_Wire_link()"
});
formatter.result({
  "duration": 3729762914,
  "status": "passed"
});
formatter.match({
  "location": "StepDefHomePage.i_Should_see_Cable_wire_Page()"
});
formatter.result({
  "duration": 93845087,
  "status": "passed"
});
formatter.uri("CableAndWire.feature");
formatter.feature({
  "line": 1,
  "name": "Choose your Connector",
  "description": "       User should be able to view and click on the links\r\n       of each product on Cable and Wire page ,click order\r\n       to add to basket, check prices.",
  "id": "choose-your-connector",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1242761,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 7,
      "value": "#@ignore"
    }
  ],
  "line": 9,
  "name": "User wanting to choose product via Choose your own",
  "description": "",
  "id": "choose-your-connector;user-wanting-to-choose-product-via-choose-your-own",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@Runme"
    },
    {
      "line": 8,
      "name": "@web"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "I Navigated to Cable and Wire Page on \"browser\"",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I click on Choose your own Connector link",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I should Navigate to IndustrialPower Connector Page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "browser",
      "offset": 39
    }
  ],
  "location": "StepDefCableAndWire.i_Navigated_to_Cable_and_Wire_Page_on(String)"
});
formatter.result({
  "duration": 2090499554,
  "status": "passed"
});
formatter.match({
  "location": "StepDefCableAndWire.i_click_on_Choose_your_own_Connector_link()"
});
formatter.result({
  "duration": 3281010955,
  "status": "passed"
});
formatter.match({
  "location": "StepDefCableAndWire.i_should_Navigate_to_IndustrialPower_Connector_Page()"
});
formatter.result({
  "duration": 31464161,
  "status": "passed"
});
formatter.after({
  "duration": 1828594864,
  "status": "passed"
});
});