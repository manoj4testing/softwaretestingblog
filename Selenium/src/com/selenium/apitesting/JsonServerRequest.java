/*package com.selenium.apitesting;

import org.testng.annotations.Test;
import static com.jayway.restassured.RestAssured.*;
import com.jayway.restassured.response.Response;

public class JsonServerRequest 
{
	@Test
	public void test()
	{
		Response resp=
				given().
				when().
				get("http://localhost:3000/posts");
		
		System.out.println(resp.asString());
	}

}
*/