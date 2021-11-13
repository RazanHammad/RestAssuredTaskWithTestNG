package CourseCollection;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class addcourse {

	@Test(priority = 1)
	static void addourse() {
		JSONObject requestParams = new JSONObject();
		requestParams.put("id", "20"); // Cast
		requestParams.put("name", "english");
		requestParams.put("desc", "english desc");

		baseURI = "http://localhost:3000";
		RequestSpecification request = given();
		
		request.header("content-type","application/json");
		
		request.body(requestParams.toString());
		
		Response response = request.post("/courses");

		int statusCode = response.getStatusCode();
		//System.out.println(statusCode);
		Assert.assertEquals(statusCode, 201);
		
		String coursename = response.jsonPath().get("name");
		//System.out.println(coursename);
		Assert.assertEquals("english", coursename, "OPERATION_SUCCESS");

	}
	
	@Test(priority = 2)
	static void get_one_course() {
		baseURI = "http://localhost:3000/";
		RequestSpecification req = given();
		req.header("content-type","application/json");
		Response res = req.get("/courses/20");
		int statuscode =res.getStatusCode();
		Assert.assertEquals(statuscode, 200);
		
		String body = res.asString();
		System.out.println(body);
		
	}
}
