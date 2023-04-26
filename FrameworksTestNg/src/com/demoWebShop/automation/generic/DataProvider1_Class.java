package com.demoWebShop.automation.generic;

import org.testng.annotations.DataProvider;

public class DataProvider1_Class 
{
@DataProvider(name = "Data")
public String[][] data()
{
	String[][] arr= {{"First","Last","Email@gmail.com","Password"}};
	return arr;
}
}
