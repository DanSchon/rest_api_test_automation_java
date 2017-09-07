package RestApiTestAutomation;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class AddCommentToJiraIssueTest {

		@Test
		public void testAddCommentToJiraIssue() {
			
			RestAssured.baseURI = ResourcePaths.hostUrl;
			given()
			.header("Content-Type", "application/json")
			.header("Cookie", "JSESSIONID=" + ReusableMethods.getUserSession())
			.body(Payloads.commentBodyContent())
			.when()
			.post(ResourcePaths.addCommentToIssueResourcePath())
			.then()
			.statusCode(201);
			
		}
}
