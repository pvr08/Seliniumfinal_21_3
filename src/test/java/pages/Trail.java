package pages;
import static io.restassured.RestAssured.given;

import utilities.TestUtils;

public class Trail {

    public static void main(String args[]) {
        // Define the base URI
    	
    	String projectPath = System.getProperty("user.dir");
        String propertyFile = projectPath + "/project.properties";
        TestUtils utils = new TestUtils(propertyFile);
        String baseUri = utils.getProperty("BaseURI");

        String username = utils.getProperty("Username");
        String password = utils.getProperty("Password");

        String credentials = org.apache.commons.codec.binary.Base64.encodeBase64String((username + ":" + password).getBytes());

        given()
            .baseUri(baseUri)
            .header("Authorization", "Basic " + credentials)
            .header("Accept", "application/json")
        .when()
            .get("issue/KAN-1")
        .then()
            .log().all()
            .assertThat().statusCode(200);
    }
}
