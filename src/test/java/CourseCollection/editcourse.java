package CourseCollection;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class editcourse {

	@Test(priority = 1)
	static void edit_course() {
		int id = 20;
		JSONObject requestParams = new JSONObject();
		requestParams.put("id", "20");
		requestParams.put("name", "english test edit method");
		requestParams.put("desc", "english desc test edit method");

		baseURI = "http://localhost:3000";
		RequestSpecification request = given();
		
		request.header("content-type","application/json");
		
		request.body(requestParams.toString());
		
		Response response = request.put("/courses/"+id);

		int statusCode = response.getStatusCode();
		//System.out.println(statusCode);
		Assert.assertEquals(statusCode, 200);
		
		String coursename = response.jsonPath().get("name");
		//System.out.println(coursename);
		Assert.assertEquals("english test edit method", coursename, "OPERATION_SUCCESS");

	}
	
	@Test (priority=2)
	public void getcourse() {
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
