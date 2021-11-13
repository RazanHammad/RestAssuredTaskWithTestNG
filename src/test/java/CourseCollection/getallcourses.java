package CourseCollection;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class getallcourses {

	@Test(priority=1)
	static void get_all_courses() {
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
