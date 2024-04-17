package Assesment;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;


public class ExampleAPITest {

    @BeforeClass
    public void setup() {
        // Set base URI for API endpoints
        RestAssured.baseURI = "https://api.example.com";
    }//https://jsonplaceholder.typicode.com

    @Test
    public void testGetUserById() {
        given()
            .pathParam("userId", 123) // Example path parameter
        .when()
            .get("/users/{userId}")
        .then()
            .assertThat()
                .statusCode(200) // Expected status code
                .contentType(ContentType.JSON) // Expected content type
                .body("id", equalTo(123)) // Assert specific JSON response properties
                .body("name", equalTo("John Doe"));
    }

    @Test
    public void testCreateUser() {
        String requestBody = "{\"name\": \"Alice\", \"email\": \"alice@example.com\"}";

        given()
            .contentType(ContentType.JSON)
            .body(requestBody)
        .when()
            .post("/users")
        .then()
            .assertThat()
                .statusCode(201) // Expected status code for resource creation
                .contentType(ContentType.JSON)
                .body("name", equalTo("Alice"))
                .body("email", equalTo("alice@example.com"));
    }

    @Test
    public void testUpdateUser() {
        String requestBody = "{\"name\": \"Bob\", \"email\": \"bob@example.com\"}";

        given()
            .pathParam("userId", 456) // Example path parameter
            .contentType(ContentType.JSON)
            .body(requestBody)
        .when()
            .put("/users/{userId}")
        .then()
            .assertThat()
                .statusCode(200) // Expected status code for successful update
                .contentType(ContentType.JSON)
                .body("name", equalTo("Bob"))
                .body("email", equalTo("bob@example.com"));
    }

    @Test
    public void testDeleteUser() {
        given()
            .pathParam("userId", 789) // Example path parameter
        .when()
            .delete("/users/{userId}")
        .then()
            .assertThat()
                .statusCode(204); // Expected status code for successful deletion
    }

    // Add more test methods as needed for other API endpoints

}
