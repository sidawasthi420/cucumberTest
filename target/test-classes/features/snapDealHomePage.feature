Feature: SnapDeal homepage feature testing
	
@check1
Scenario Outline: Search for the Product on chrome browser

And Launch the url "<URL>"
When User is on the Home page
And Dismiss the popover if displayed
| siddhant  | awasthi  | noida  |
| siddhant1 | awasthi1 | noida1 |

Examples:

| URL |
| https://www.snapdeal.com/ |


@check2
Scenario Outline: Search for the Product on firefox browser

And Launch the url "<URL>"
When User is on the Home page
And Dismiss the popover if displayed
| siddhant  | awasthi  | noida  |
| siddhant1 | awasthi1 | noida1 |

Examples:

| URL |
| https://www.snapdeal.com/ |