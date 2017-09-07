package RestApiTestAutomation;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class CreateJiraIssueTest {
	
	@Test
	public void testCreateJiraIssue() {
		
		String projectKey = "XYZ";
		String issueSummary = "Issue 1";
		String issueDescription = "First created issue";
		String issueType = "Bug";
		
		RestAssured.baseURI = ResourcePaths.hostUrl;
		given()
		.header("Content-Type", "application/json")
		.header("Cookie", "JSESSIONID=" + ReusableMethods.getUserSession())
		.body(Payloads.issueBodyContent(projectKey, issueSummary, issueDescription, issueType))
		.when()
		.post(ResourcePaths.createIssueResourcePath)
		.then()
		.statusCode(201); // 201 == success
	}
}
