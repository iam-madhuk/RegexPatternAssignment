# RegexPatternAssignment
 POST api:

Url  : http://localhost:8080/spring-crm-rest/match
Request Body : 
{
   "regex":"^[A-Za-z0-9&#_.$@ -]*$",
   "textBody":"a a abc"
               }
               
 Response :
 {
    "match": "[a, a, abc]",
    "error": "false"
}

REST API aa
 
 
