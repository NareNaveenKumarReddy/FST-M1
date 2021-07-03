package projects;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class Github_RestAssured_Project {
	RequestSpecification requestSpec;
	//String SSHkey = "key";
	int id;
	
	
	@BeforeClass
	public void RequestSpecBuilder()
	{
		
		requestSpec = new RequestSpecBuilder()
                // Set content type
                .setContentType(ContentType.JSON)
                // Set base URL
                .setBaseUri("https://api.github.com")
                // Build request specification
                .addHeader("Authorization","Token <token value>")
                .build();
		
		
				
	}
	
	@Test(priority=1)
	public void PostRequest()
	{
		String reqBody = "{ \"title\": \"TestAPIKey\",  \"key\": \"ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQCneZE4662AaHiObNPmF3ahTQpsmB7mBRaJc8EdNhkDVHNY1rpRU+e11tMWfzwFqOVnES090PxOm11f0h4gKC96R4NrOD1FwSueIbhqsLgbKxc/JjEcDPNnHSi3/HbSpmDPnMug2j86oboVBGNc5WgMtHnEyQ2C0nGuNWmbVfuIbpO0D4Dci1tx5A608Sz1Mb9Y6CEbZ6nYJQOh+Kprya7v0MOcGdE/WfVfdgIbjG1MLAf6YhojdSUBaFK9GxpGEEj5psKVuzjG0KQT4D/ROZyXp4vNBo9T7FCISmKAOUN7Grgfik1yL0BSqULcAdrX60lgCIrlm88pNapimRqKgXsQsgZ9LKQDaXZjDvQUSR7KlfzWsYu6gpyl7KfNKJjnbbKp9UlbgOdP2tfNAXvAECH53xExjSsjwHdE9y24I981rhTQ9oUMfwfckL1yHa8Ugv2ymTuNpEzPkuD53fmCckeF5aytqo7ofj3tNqyCWn9g7tuF3Bht4VpXSxKRdS4TzvU=\" }";
		
		
		
		Response response = 
		        given().spec(requestSpec) // Set headers
		        .body(reqBody).when().post("/user/keys"); // Send POST request
		
		String resBody = response.getBody().asPrettyString();
	    System.out.println(resBody);
	    
	    id = response.then().extract().path("id");
	    
	    System.out.println(id);
	    
	    // Assert the updates
	    response.then().assertThat().statusCode(201);   //.body("name", equalTo("Hansel"));		

	}
	
	@Test(priority=2)
	public void getRequest()
	{
		
		Response response = 
		        given().spec(requestSpec) // Set headers
		        .when().get("/user/keys"); // Send GET request
		
		String resBody = response.getBody().asPrettyString();
	    System.out.println(resBody);
	    
	    // Assert the updates
	    response.then().assertThat().statusCode(200);   //.body("name", equalTo("Hansel"));		

	}
	
	@Test(priority=3)
	public void deleteRequest()
	{
		
		Response response = 
		        given().spec(requestSpec)
		        .pathParam("keyId", id)// Set headers
		        .when().delete("/user/keys/{keyId}"); // Send DELETE request
		
		String resBody = response.getBody().asPrettyString();
	    System.out.println(resBody);
	    
	    // Assert the updates
	    response.then().assertThat().statusCode(204);   //.body("name", equalTo("Hansel"));		

	}
	

}


