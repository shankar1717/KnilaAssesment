package Assesment;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class ApiCrudTest {

	private static final String BASE_URL = "https://jsonplaceholder.typicode.com";
	private static final int POST_ID = 1;

	@Test
	public void testGetRequest() {
		// Perform a GET request
		given()
		.when()
		.get(BASE_URL + "/posts/" + POST_ID)
		.then()
		.statusCode(200)
		.body("userId", equalTo(1))
		.body("id", equalTo(POST_ID))
		.body("title", equalTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit"))
		.body("body", containsString("quia et suscipit\nsuscipit"));
	}

	@Test
	public void testPostRequest() {
		// Perform a POST request
		given()
		.contentType("application/json")
		.body("{ \"title\": \"foo\", \"body\": \"bar\", \"userId\": 1 }")
		.when()
		.post(BASE_URL + "/posts")
		.then()
		.statusCode(201)
		.body("title", equalTo("foo"))
		.body("body", equalTo("bar"))
		.body("userId", equalTo(1));
	}

	@Test
	public void testPutRequest() {
		// Perform a PUT request
		given()
		.contentType("application/json")
		.body("{ \"title\": \"foo\", \"body\": \"bar\", \"userId\": 1 }")
		.when()
		.put(BASE_URL + "/posts/" + POST_ID)
		.then()
		.statusCode(200)
		.body("title", equalTo("foo"))
		.body("body", equalTo("bar"))
		.body("userId", equalTo(1));
	}

	@Test
	public void testDeleteRequest() {
		// Perform a DELETE request
		given()
		.when()
		.delete(BASE_URL + "/posts/" + POST_ID)
		.then()
		.statusCode(200);
	}
}


