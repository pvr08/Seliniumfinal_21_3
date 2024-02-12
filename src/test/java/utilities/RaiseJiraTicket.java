package utilities;

import static io.restassured.RestAssured.given;

import java.io.File;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RaiseJiraTicket {

	String projectPath = System.getProperty("user.dir");
    String propertyFile = projectPath + "/project.properties";
    TestUtils utils = new TestUtils(propertyFile);
    String baseUri = utils.getProperty("BaseURI");
    
    public RaiseJiraTicket(String failedTest) {
    	String key = createBugPostRequest(failedTest);
    	addAttachmentToBugCreated(key);
    }
	
    public String createBugPostRequest(String scenarioName) {
        try {
            String bodyData = "{\n"
                    + "    \"fields\": {\n"
                    + "        \"summary\": \"Automation: Failed to " + scenarioName + "\",\n"
                    + "        \"description\": {\n"
                    + "          \"type\": \"doc\",\n"
                    + "          \"version\": 1,\n"
                    + "          \"content\": [\n"
                    + "            {\n"
                    + "              \"type\": \"paragraph\",\n"
                    + "              \"content\": [\n"
                    + "                {\n"
                    + "                  \"type\": \"text\",\n"
                    + "                  \"text\": \"description\"\n"
                    + "                }\n"
                    + "              ]\n"
                    + "            }\n"
                    + "          ]\n"
                    + "        },\n"
                    + "        \"issuetype\": {\n"
                    + "            \"id\": \"10005\"\n"
                    + "        },\n"
                    + "        \"project\": {\n"
                    + "            \"id\":\"10000\"\n"
                    + "        },\n"
                    + "        \"reporter\": {\n"
                    + "            \"id\": \"5e395beccaf29f0cb8df80d7\"\n"
                    + "        },\n"
                    + "        \"assignee\": {\n"
                    + "            \"id\": \"5e395beccaf29f0cb8df80d7\"\n" // Replace with the actual ID of the assignee
                    + "        }\n"
                    + "    }\n"
                    + "}";

            String baseUri = utils.getProperty("BaseURI");

            String username = utils.getProperty("Username");
            String password = utils.getProperty("Password");
            String credentials = org.apache.commons.codec.binary.Base64.encodeBase64String((username + ":" + password).getBytes());

            // Make the POST request
            Response response = RestAssured.given()
                    .baseUri(baseUri)
                    .header("Authorization", "Basic " + credentials)
                    .header("Accept", "application/json")
                    .header("Content-Type", "application/json")
                    .body(bodyData)
                    .when()
                    .post("issue");

            if (response.getStatusCode() == 201) {
                String key = response.jsonPath().getString("key");
                System.out.println("Response body: " + response.getBody().asString());
                return key;
            } else {
                System.err.println("Failed to create bug. Response code: " + response.getStatusCode());
                System.err.println("Response body: " + response.getBody().asString());
                return null;
            }
        } catch (Exception e) {
            // If an exception occurs, print the stack trace
            e.printStackTrace();
            return null;
        }
    }
	
	
	public void addAttachmentToBugCreated(String issueKey) {
		try {
	        String baseUri = utils.getProperty("BaseURI");
	
	        String username = utils.getProperty("Username");
	        String password = utils.getProperty("Password");
	        String credentials = org.apache.commons.codec.binary.Base64.encodeBase64String((username + ":" + password).getBytes());
	        
	        String endpoint = "/rest/api/3/issue/" + issueKey + "/attachments";
	        System.out.println("End point"+endpoint);
	        String filePath = projectPath+"/test-output.zip";
	
	        given()
		        .baseUri(baseUri)
		        .auth()
		        .preemptive()
		        .basic(username, password)
		        .header("X-Atlassian-Token", "no-check")
		        .multiPart("file", new File(filePath))
	        .when()
	            .post(endpoint)
	        .then()
	//            .log().all()
	            .assertThat().statusCode(200);
	    }catch (Exception e) {
	        e.printStackTrace();
	    }
	}
}
