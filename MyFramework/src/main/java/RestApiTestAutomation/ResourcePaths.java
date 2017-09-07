package RestApiTestAutomation;

public class ResourcePaths {

	public static String hostUrl = "localhost:8080";
	
	public static String authenticationResourcePath = "/rest/auth/1/session";
	
	public static String createIssueResourcePath = "/rest/api/2/issue";

	public static String addCommentToIssueResourcePath() {
		String jiraIssueId = ReusableMethods.generateJiraIssueId();
		String resource = "/rest/api/2/issue/"+jiraIssueId+"/comment";
		return resource;
	}
	
}
