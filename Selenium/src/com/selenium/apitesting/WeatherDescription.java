/*package com.selenium.apitesting;
import static com.jayway.restassured.RestAssured.*;

import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;
public class WeatherDescription 
{
	@Test
	public void test_01()
	{
		String str=
				given().
				param("q","London").
				param("appid","b7e1a6e1b31084a35fb662c0c40191da").
				when().
				get("http://api.openweathermap.org/data/2.5/weather").
				then().
				contentType(ContentType.JSON).
				extract().
				path("weather[0].description");
		
		System.out.println("Weather Report  "+str);
	}
}
*/