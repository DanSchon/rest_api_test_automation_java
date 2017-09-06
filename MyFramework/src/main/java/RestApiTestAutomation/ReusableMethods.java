package RestApiTestAutomation;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ReusableMethods {

	public static JsonPath rawToJson(Response res) {
		String responseAsString = res.asString();
		JsonPath responseAsJson = new JsonPath(responseAsString);
		return responseAsJson;
	}
	
	public static String getUserSession() {
		RestAssured.baseURI = ResourcePaths.hostUrl;
		Response res = 
				given()
				.header("Content-Type", "application/json")
				.body(Payloads.authenticationBodyContent)
				.when()
				.post(ResourcePaths.authenticationResourcePath)
				.then()
				.extract().response();
		
		JsonPath js = rawToJson(res);
		String sessionID = js.get("session.value");
		return sessionID;
	}

}
