package RestApiTestAutomation;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;

public class AuthenticationTest {

	@Test
	public void testUserAuthentication() {
		
		RestAssured.baseURI = ResourcePaths.hostUrl;
		given()
		.header("Content-Type", "application/json")
		.body(Payloads.authenticationBodyContent)
		.when()
		.post(ResourcePaths.authenticationResourcePath)
		.then()
		.statusCode(200); // 200 == success
	}
}
