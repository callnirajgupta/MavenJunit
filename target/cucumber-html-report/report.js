$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SearchFriends.feature");
formatter.feature({
  "id": "search-my-friends",
  "tags": [
    {
      "name": "@search",
      "line": 1
    }
  ],
  "description": "",
  "name": "search my friends",
  "keyword": "Feature",
  "line": 2
});
formatter.scenario({
  "id": "search-my-friends;search-my-friends",
  "description": "",
  "name": "search my friends",
  "keyword": "Scenario",
  "line": 3,
  "type": "scenario"
});
formatter.step({
  "name": "Login to facebook application",
  "keyword": "Given ",
  "line": 4
});
formatter.step({
  "name": "search friend in homr page",
  "keyword": "When ",
  "line": 5
});
formatter.step({
  "name": "verify that friend is search successfully",
  "keyword": "Then ",
  "line": 6
});
formatter.step({
  "name": "Logout from the facebook Application",
  "keyword": "And ",
  "line": 7
});
formatter.match({
  "location": "Global.Login_to_face_book_application()"
});
formatter.result({
  "duration": 39573326885,
  "status": "passed"
});
formatter.match({
  "location": "SearchFriends.search_friend_in_homr_page()"
});
formatter.result({
  "duration": 3094286576,
  "status": "passed"
});
formatter.match({
  "location": "SearchFriends.verify_that_friend_is_search_successfully()"
});
formatter.result({
  "duration": 567349732,
  "status": "passed"
});
formatter.match({
  "location": "Global.Logout_from_the_facebook_Application()"
});
formatter.result({
  "duration": 9171297284,
  "status": "passed"
});
formatter.after({
  "duration": 575423663,
  "status": "passed"
});
formatter.uri("logintofacebook.feature");
formatter.feature({
  "id": "my-feature",
  "tags": [
    {
      "name": "@Test",
      "line": 2
    }
  ],
  "description": "",
  "name": "my feature",
  "keyword": "Feature",
  "line": 3
});
formatter.scenario({
  "id": "my-feature;my-scenario",
  "description": "",
  "name": "my scenario",
  "keyword": "Scenario",
  "line": 4,
  "type": "scenario"
});
formatter.step({
  "name": "Login to facebook application",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "click on the home button",
  "keyword": "When ",
  "line": 6
});
formatter.step({
  "name": "verify that home page is displayed",
  "keyword": "Then ",
  "line": 7
});
formatter.step({
  "name": "Logout from the facebook Application",
  "keyword": "And ",
  "line": 8
});
formatter.match({
  "location": "Global.Login_to_face_book_application()"
});
formatter.result({
  "duration": 38750299651,
  "status": "passed"
});
formatter.match({
  "location": "logintofacebook.click_on_the_home_button()"
});
formatter.result({
  "duration": 5427909349,
  "status": "passed"
});
formatter.match({
  "location": "logintofacebook.verify_that_home_page_is_displayed()"
});
formatter.result({
  "duration": 243825,
  "status": "passed"
});
formatter.match({
  "location": "Global.Logout_from_the_facebook_Application()"
});
formatter.result({
  "duration": 3718193325,
  "status": "passed"
});
formatter.after({
  "duration": 362002358,
  "status": "passed"
});
});