/*package com.selenium.apitesting;

import org.testng.annotations.Test;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import static com.jayway.restassured.RestAssured.*;

public class PostRequestAsStringBody 
{
	@Test
	public void test()
	{
		Response resp=
				given().
				body("{\"id\":\"2\" + \"title\":\"Manoj\" + \"author\": \"Manoj\"}").
				when().
				contentType(ContentType.JSON).
				post("http://localhost:3000/posts");
		
		
		System.out.println(resp.getStatusCode());
		System.out.println(resp.asString());
	}

}
*/