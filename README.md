# RestAssuredTaskWithTestNG
In this Repository you need prerequisties to execute it in your local computer.

#pre-requisties:
1. Need to install node js to your computer.
  - Download it from this link "https://nodejs.org/en/download/".

2. Need to Add a json server auth API in your local computer.
 - follow this tutorial "https://www.npmjs.com/package/json-server-auth".
 
3. Make DB.json and put it in your local and initialize node js modules, then start the server.
   -DB.json includes a courses collection database to make API Requests via eclipse and run some test cases.
   
4. download eclipse IDE.

5. Clone this project.

6. open this project from your local via eclipse IDE.

7. when you open navigate to CourseCollection package under src/test/java.

8. open the file addrequest and press on run to run the request and then see the result after starting the json server via this 
command in the path that you install the json server db.json file "json-server db.json -m ./node_modules/json-server-auth".

9. when you open db.json file you will observe the adding result to it and observe that the test run passes in the eclipse console.

10. open the file editrequest and press on run to run the request and then see the result.

11. open the file getallrequest and press on run to run the request and then see the result, test run passes and all courses printed on the console.

12.  open the file getspecificrequest request and press on run to run the request and then see the result, test run passes and get specific course printed on the console.

13.  open the file deleterequest request and press on run to run the request and then see the result, test run passes and the result deleted, you see that when 
open db.json and observe the record was deleted. 
