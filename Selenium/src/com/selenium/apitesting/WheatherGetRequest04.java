/*package com.selenium.apitesting;
import static com.jayway.restassured.RestAssured.*;
import org.testng.annotations.Test;


public class WheatherGetRequest04 
{
	//For Findout The Status Code of a API
	//If You Enter Wrong API Information Then u Get 401 Error
	@Test
	public void test01()
	{
		 
				given().
				param("zip","94040").
				param("appid","b7e1a6e1b31084a35fb662c0c40191da").
				when().
				get("http://api.openweathermap.org/data/2.5/weather").
				then().assertThat().statusCode(200);
		
		
	}

}*/