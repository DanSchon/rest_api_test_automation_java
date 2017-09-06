package RestApiTestAutomation;

public class Payloads {

	public static String authenticationBodyContent = "{ "
			+ "\"username\": \"myUsername\", "
			+ "\"password\": \"myPassword\" "
			+ "}";
	
	public static String issueBodyContent(String projectKey, String issueSummary, String issueDescription, String issueType) {
		String body = "{"
			+ "\"fields\": {"
				+ "\"project\": {"
					+ "\"key\": \""+projectKey+"\"}"
				+ "},"
				+ "\"summary\": \""+issueSummary+"\","
				+ "\"description\": \""+issueDescription+"\","
				+ "\"issuetype\": {"
					+ "\"name\": \""+issueType+"\""
				+ "}"
			+ "}"
		+ "}";
		return body;
	}
}
