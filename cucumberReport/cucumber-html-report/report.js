$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/resources/api.feature");
formatter.feature({
  "line": 2,
  "name": "To test the Banking Application.",
  "description": "",
  "id": "to-test-the-banking-application.",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Functionaltest"
    }
  ]
});
formatter.scenarioOutline({
  "line": 6,
  "name": "To check how many accounts are present.",
  "description": "",
  "id": "to-test-the-banking-application.;to-check-how-many-accounts-are-present.",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@POSTaccount"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "a user",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "the user send request with \"\u003ctitle\u003e\", \"\u003cType\u003e\", \"\u003cHoldertype\u003e\", \"\u003cAccountNo\u003e\", \"\u003cBalance\u003e\" to BANKING SITE",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "the status code of BANKING SITE should be \"\u003cstatusCode\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user id sould be created in Banking Application.",
  "keyword": "And "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "to-test-the-banking-application.;to-check-how-many-accounts-are-present.;",
  "rows": [
    {
      "cells": [
        "title",
        "Type",
        "Holdertype",
        "AccountNo",
        "Balance",
        "statusCode"
      ],
      "line": 17,
      "id": "to-test-the-banking-application.;to-check-how-many-accounts-are-present.;;1"
    },
    {
      "cells": [
        "PRIYANKA",
        "current",
        "Single",
        "1000044",
        "300000",
        "201"
      ],
      "line": 18,
      "id": "to-test-the-banking-application.;to-check-how-many-accounts-are-present.;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 18,
  "name": "To check how many accounts are present.",
  "description": "",
  "id": "to-test-the-banking-application.;to-check-how-many-accounts-are-present.;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Functionaltest"
    },
    {
      "line": 5,
      "name": "@POSTaccount"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "a user",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "the user send request with \"PRIYANKA\", \"current\", \"Single\", \"1000044\", \"300000\" to BANKING SITE",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "the status code of BANKING SITE should be \"201\"",
  "matchedColumns": [
    5
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user id sould be created in Banking Application.",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdef.a_user()"
});
formatter.result({
  "duration": 685268423,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "PRIYANKA",
      "offset": 28
    },
    {
      "val": "current",
      "offset": 40
    },
    {
      "val": "Single",
      "offset": 51
    },
    {
      "val": "1000044",
      "offset": 61
    },
    {
      "val": "300000",
      "offset": 72
    }
  ],
  "location": "Stepdef.the_user_send_request_with_to_BANKING_SITE(String,String,String,String,String)"
});
formatter.result({
  "duration": 6939094778,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "201",
      "offset": 43
    }
  ],
  "location": "Stepdef.the_status_code_of_BANKING_SITE_should_be(String)"
});
formatter.result({
  "duration": 446877,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.user_id_sould_be_created_in_Banking_Application()"
});
formatter.result({
  "duration": 72270,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 20,
      "value": "#    @putmethod"
    },
    {
      "line": 21,
      "value": "##@firstaccount"
    },
    {
      "line": 22,
      "value": "## Scenario Outline: To check how many accounts are present."
    },
    {
      "line": 23,
      "value": "##"
    },
    {
      "line": 24,
      "value": "##    Given a user"
    },
    {
      "line": 25,
      "value": "##"
    },
    {
      "line": 26,
      "value": "##    When the user update details request with \"\u003ctitle\u003e\""
    },
    {
      "line": 27,
      "value": "##    Then the status code of BANKING SITE should  \"\u003cstatusCode\u003e\""
    },
    {
      "line": 28,
      "value": "##"
    },
    {
      "line": 29,
      "value": "##"
    },
    {
      "line": 30,
      "value": "##    Examples:"
    },
    {
      "line": 31,
      "value": "##    | title |statusCode|"
    },
    {
      "line": 32,
      "value": "##    | PRIYANKA |200|"
    }
  ],
  "line": 40,
  "name": "To check account is deleted",
  "description": "",
  "id": "to-test-the-banking-application.;to-check-account-is-deleted",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 39,
      "name": "@deleteaccount"
    }
  ]
});
formatter.step({
  "line": 42,
  "name": "a user",
  "keyword": "Given "
});
formatter.step({
  "line": 44,
  "name": "the user send request to delete the account details from banking site",
  "keyword": "When "
});
formatter.step({
  "line": 45,
  "name": "user sould be able to delete the account details.",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "the status code should  displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdef.a_user()"
});
formatter.result({
  "duration": 3055011,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.the_user_send_request_to_delete_the_account_details_from_banking_site()"
});
formatter.result({
  "duration": 689886862,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.user_sould_be_able_to_delete_the_account_details()"
});
formatter.result({
  "duration": 53454,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.the_status_code_should_displayed()"
});
formatter.result({
  "duration": 57730,
  "status": "passed"
});
formatter.scenario({
  "line": 52,
  "name": "To check account details of",
  "description": "",
  "id": "to-test-the-banking-application.;to-check-account-details-of",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 51,
      "name": "@getaccountdetails"
    }
  ]
});
formatter.step({
  "line": 54,
  "name": "a user",
  "keyword": "Given "
});
formatter.step({
  "line": 56,
  "name": "the user send request to fetch the account details from banking site",
  "keyword": "When "
});
formatter.step({
  "line": 58,
  "name": "the status code should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 60,
  "name": "user sould be able to call the account details",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdef.a_user()"
});
formatter.result({
  "duration": 3379157,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.the_user_send_request_to_fetch_the_account_details_from_banking_site()"
});
formatter.result({
  "duration": 582749364,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.the_status_code_should_be_displayed()"
});
formatter.result({
  "duration": 854062066,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.user_sould_be_able_to_call_the_account_details()"
});
formatter.result({
  "duration": 1130106528,
  "status": "passed"
});
formatter.scenario({
  "line": 63,
  "name": "To check account details of id\u003d3,4",
  "description": "",
  "id": "to-test-the-banking-application.;to-check-account-details-of-id\u003d3,4",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 62,
      "name": "@getiddetails"
    }
  ]
});
formatter.step({
  "line": 65,
  "name": "a user",
  "keyword": "Given "
});
formatter.step({
  "line": 67,
  "name": "the user send request for particular id to fetch the account details from banking site",
  "keyword": "When "
});
formatter.step({
  "line": 69,
  "name": "the status code should  displayed when it get from the site",
  "keyword": "Then "
});
formatter.step({
  "line": 71,
  "name": "user sould be able to call the id account details.",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdef.a_user()"
});
formatter.result({
  "duration": 2494385,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.the_user_send_request_for_particular_id_to_fetch_the_account_details_from_banking_site()"
});
formatter.result({
  "duration": 642801459,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.the_status_code_should_displayed_when_it_get_from_the_site()"
});
formatter.result({
  "duration": 644173306,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.user_sould_be_able_to_call_the_id_account_details()"
});
formatter.result({
  "duration": 666501315,
  "status": "passed"
});
formatter.scenario({
  "line": 75,
  "name": "To display joint account details",
  "description": "",
  "id": "to-test-the-banking-application.;to-display-joint-account-details",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 74,
      "name": "@getjointaccount"
    }
  ]
});
formatter.step({
  "line": 76,
  "name": "a user",
  "keyword": "Given "
});
formatter.step({
  "line": 78,
  "name": "the user send request  to fetch the joint account details from banking site",
  "keyword": "When "
});
formatter.step({
  "line": 80,
  "name": "the status code should  display when it get from the site",
  "keyword": "Then "
});
formatter.step({
  "line": 82,
  "name": "user sould be able to call the joint account details.",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdef.a_user()"
});
formatter.result({
  "duration": 2860438,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.the_user_send_request_to_fetch_the_joint_account_details_from_banking_site()"
});
formatter.result({
  "duration": 620035126,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.the_status_code_should_display_when_it_get_from_the_site()"
});
formatter.result({
  "duration": 633811328,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.user_sould_be_able_to_call_the_joint_account_details()"
});
formatter.result({
  "duration": 583018346,
  "status": "passed"
});
formatter.scenario({
  "line": 88,
  "name": "To sort the details",
  "description": "",
  "id": "to-test-the-banking-application.;to-sort-the-details",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 87,
      "name": "@sort"
    }
  ]
});
formatter.step({
  "line": 89,
  "name": "a user",
  "keyword": "Given "
});
formatter.step({
  "line": 90,
  "name": "the user send resquest to sort details",
  "keyword": "When "
});
formatter.step({
  "line": 91,
  "name": "the status code should display",
  "keyword": "Then "
});
formatter.step({
  "line": 92,
  "name": "user is able to sort the details",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdef.a_user()"
});
formatter.result({
  "duration": 2951952,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.the_user_send_resquest_to_sort_details()"
});
formatter.result({
  "duration": 592460486,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.the_status_code_should_display()"
});
formatter.result({
  "duration": 892434442,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.user_is_able_to_sort_the_details()"
});
formatter.result({
  "duration": 861935220,
  "status": "passed"
});
formatter.scenario({
  "line": 95,
  "name": "To paginate the details",
  "description": "",
  "id": "to-test-the-banking-application.;to-paginate-the-details",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 94,
      "name": "@Pagination"
    }
  ]
});
formatter.step({
  "line": 96,
  "name": "a user",
  "keyword": "Given "
});
formatter.step({
  "line": 97,
  "name": "the user send resquest to paginate details",
  "keyword": "When "
});
formatter.step({
  "line": 98,
  "name": "status code should display",
  "keyword": "Then "
});
formatter.step({
  "line": 99,
  "name": "user is able to paginate the details",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdef.a_user()"
});
formatter.result({
  "duration": 8302925,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.the_user_send_resquest_to_paginate_details()"
});
formatter.result({
  "duration": 730937932,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.status_code_should_display()"
});
formatter.result({
  "duration": 622481615,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.user_is_able_to_paginate_the_details()"
});
formatter.result({
  "duration": 594815889,
  "status": "passed"
});
formatter.scenario({
  "line": 102,
  "name": "To check how many account number ends with 02",
  "description": "",
  "id": "to-test-the-banking-application.;to-check-how-many-account-number-ends-with-02",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 101,
      "name": "@accountends02"
    }
  ]
});
formatter.step({
  "line": 103,
  "name": "a user",
  "keyword": "Given "
});
formatter.step({
  "line": 104,
  "name": "the user sends the request to find the number of accounts ends with 02",
  "keyword": "When "
});
formatter.step({
  "line": 105,
  "name": "the count for account number ends with 02",
  "keyword": "Then "
});
formatter.step({
  "line": 106,
  "name": "the count for those ends with 02 accounts will be displayed",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdef.a_user()"
});
formatter.result({
  "duration": 7828253,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "02",
      "offset": 68
    }
  ],
  "location": "Stepdef.the_user_sends_the_request_to_find_the_number_of_accounts_ends_with(int)"
});
formatter.result({
  "duration": 3494446115,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "02",
      "offset": 39
    }
  ],
  "location": "Stepdef.the_count_for_account_number_ends_with(int)"
});
formatter.result({
  "duration": 251448,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "02",
      "offset": 30
    }
  ],
  "location": "Stepdef.the_count_for_those_ends_with_accounts_will_be_displayed(int)"
});
formatter.result({
  "duration": 203554,
  "status": "passed"
});
formatter.scenario({
  "line": 109,
  "name": "To check how many accounts are greater than 200000",
  "description": "",
  "id": "to-test-the-banking-application.;to-check-how-many-accounts-are-greater-than-200000",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 108,
      "name": "@balancecheck"
    }
  ]
});
formatter.step({
  "line": 110,
  "name": "a user",
  "keyword": "Given "
});
formatter.step({
  "line": 111,
  "name": "the user will send the request to display the number of accounts that have balance greater",
  "keyword": "When "
});
formatter.step({
  "line": 112,
  "name": "the greater than 200000 account balance accounts will be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdef.a_user()"
});
formatter.result({
  "duration": 2627806,
  "status": "passed"
});
formatter.match({
  "location": "Stepdef.the_user_will_send_the_request_to_display_the_number_of_accounts_that_have_balance_greater()"
});
formatter.result({
  "duration": 40625,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200000",
      "offset": 17
    }
  ],
  "location": "Stepdef.the_greater_than_account_balance_accounts_will_be_displayed(int)"
});
formatter.result({
  "duration": 999974342,
  "status": "passed"
});
});