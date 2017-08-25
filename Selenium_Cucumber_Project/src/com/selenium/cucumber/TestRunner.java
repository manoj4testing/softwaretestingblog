package com.selenium.cucumber;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features="features",glue={"com.selenium.cucumber.stepdefination"})
public class TestRunner 
{

}
