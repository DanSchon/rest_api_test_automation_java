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
	
	public static String commentBodyContent() {
		String body = "{"
				+ "'body':'lorem ipsum...',"
					+ "'visibility': {"
						+ "'type': 'role',"
						+ "'value': 'Administrators'"
					+ "}"
				+ "}";
		return body;
	}
}
