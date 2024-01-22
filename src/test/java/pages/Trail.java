package pages;
import static io.restassured.RestAssured.*;

import io.restassured.response.ValidatableResponse;

public class Trail {

	public static void main(String args[]) {
		String baseUri = "http://localhost:3000/";
		
		ValidatableResponse statusCode = given().baseUri(baseUri)
				.when().get("/data/invoiceNo/106-35-6779")
				.then().assertThat().statusCode(200);
		System.out.println(statusCode.toString());
		
		String responseBody = statusCode.extract().body().asString();
        
		System.out.println("Response Body: " + responseBody);
		
	} 
}
