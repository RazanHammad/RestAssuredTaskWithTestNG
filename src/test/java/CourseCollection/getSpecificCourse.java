package CourseCollection;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class getSpecificCourse {
	@Test(priority=1)
	static void get_one_course() {
		int id =20;
		baseURI = "http://localhost:3000/";
		RequestSpecification req = given();
		req.header("content-type","application/json");
		Response res = req.get("/courses/"+id);
		int statuscode =res.getStatusCode();
		Assert.assertEquals(statuscode, 200);
		
		String body = res.asString();
		System.out.println(body);
		
	}
}
