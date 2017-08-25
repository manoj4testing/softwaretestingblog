/*package com.selenium.apitesting;

import helpertoAPIServer.Baseclass;

import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import static com.jayway.restassured.RestAssured.*;

public class JsonServerRequestPut 
{
	@Test
	public void test()
	{
		Baseclass obj=new Baseclass();
		obj.setId("2");
		obj.setTitle("MK Rana222");
		obj.setAuthor("Manoj Kumar Rana");
		
		Response resp=
				given().
				when().
				contentType(ContentType.JSON).
				body(obj).
				put("http://localhost:3000/posts/");
		System.out.println(resp.getStatusCode());
		
		System.out.println("After Update--" + resp.asString());
	}

}
*/