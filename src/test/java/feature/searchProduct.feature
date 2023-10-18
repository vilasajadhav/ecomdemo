Feature:  Search and Place the Order for Product

Scenario Outline: Search Experience for product search in both home and offers page

#write as per business termonology


Given User is on Greencart Landing page
When user searched with shortname <Name> and extracted actual name of the product
Then user searched <Name> shortname is offers page 
And validate product name in offers page matched with landing page

Examples:
| Name |
| Tom |
| Beet |


#Given User is on Greencart Landing page
#When user searched with shortname "tom" and extracted actual name of the product
#Then user searched "tom" shortname is offers page 
#And validate product name in offers page matched with landing page
