/*package com.selenium.apitesting;
import static com.jayway.restassured.RestAssured.*;
import org.testng.annotations.Test;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
public class TransferResponsetoAnotherAPI 
{
	@Test
	public void test()
	{
		Response resp=
				given().
				param("q","London").
				param("appid","b7e1a6e1b31084a35fb662c0c40191da").
				when().
				get("http://api.openweathermap.org/data/2.5/weather");
		String reportDescription=
				resp.
				then().
				contentType(ContentType.JSON).
				extract().
				path("weather[0].description");
		System.out.println("Weather Description: -- " + reportDescription);
		
		String lon=String.valueOf(
				resp.
				then().
				contentType(ContentType.JSON).
				extract().
				path("coord.lon"));
		System.out.println("The Lon Is : --" +lon);
				
		String lat=String.valueOf(
				resp.
				then().
				contentType(ContentType.JSON).
				extract().
				path("coord.lat"));
		System.out.println("The Lat Is : --" +lat);
				
				
		Response resp1=
				given().
				param("lon",lon).
				param("lat",lat).
				param("appid","b7e1a6e1b31084a35fb662c0c40191da").
				when().
				get("http://api.openweathermap.org/data/2.5/weather");
		
		String lonlatdesc=
				resp1.
				then().
				contentType(ContentType.JSON).
				extract().
				path("weather[0].description");
		
		System.out.println("The New Weather Description: -- "+lonlatdesc);
				
		
		
				
	}
}
*/