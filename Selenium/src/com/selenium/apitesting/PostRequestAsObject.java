/*package com.selenium.apitesting;

import helpertoAPIServer.Baseclass;

import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;

public class PostRequestAsObject 
{
	@Test
	public void test()
	{
		Baseclass obj=new Baseclass();
		obj.setId("3");
		obj.setTitle("Manoj");
		obj.setAuthor("Manoj Rana");
		
		Response resp=
				given().
				when().
				contentType(ContentType.JSON).
				body(obj).
				post("http://localhost:3000/posts/1");
		
		System.out.println("The Status Code :--" + resp.getStatusCode());
		System.out.println("The Resposne: --" + resp.asString());
		
	}

}
*/