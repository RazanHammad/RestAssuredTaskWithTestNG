package CourseCollection;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class deletecourse {
	@Test
	static void delete_course() {
		int id = 20;

		baseURI = "http://localhost:3000";
		RequestSpecification request = given();

		request.header("content-type", "application/json");

		Response response = request.delete("/courses/" + id);

		int statusCode = response.getStatusCode();

		Assert.assertEquals(statusCode, 200);

		String jsonString = response.asString();

		Assert.assertEquals(jsonString.contains(""), true);

	}
	
	@Test (priority=2)
	public void get_course() {
		baseURI = "http://localhost:3000/";
		RequestSpecification req = given();
		req.header("content-type","application/json");
		Response res = req.get("/courses");
		int statuscode =res.getStatusCode();
		Assert.assertEquals(statuscode, 200);
		
		String body = res.asString();
		System.out.println(body);
		
	}
}
