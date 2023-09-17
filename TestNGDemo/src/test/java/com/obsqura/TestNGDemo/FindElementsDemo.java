package com.obsqura.TestNGDemo;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FindElementsDemo extends BaseDemo{
	

	

	@Test
	public void findElements()
	{
	String expectedResult="Simple Form Demo";
	List<WebElement> menu=driver.findElements(By.xpath("//ul[contains(@class,'list-group')]//a"));
	for(WebElement a:menu)
	{
		String actualResult=a.getText();
		if(expectedResult.equals(actualResult))
		{
		a.click();
		break;
		}
	}
	}
	@Test
	public void verifyTheadOrderOfTheTable() 
	{
		driver.navigate().to("https://selenium.obsqurazone.com/table-pagination.php");
		List <String> expectedThead=new ArrayList<String>();
		expectedThead.add("Name");
		expectedThead.add("Position");
		expectedThead.add("Office");
		expectedThead.add("Age");
		expectedThead.add("Start date");
		expectedThead.add("Salary");
		String expectedTheadOrder=String.join(" ", expectedThead);  
		List <WebElement> header=driver.findElements(By.xpath("//table[@id='dtBasicExample']//following-sibling::thead"));
		for(WebElement theadOrder:header)
		{
		String actualHeaderOrder=theadOrder.getText();
		Assert.assertEquals(actualHeaderOrder, expectedTheadOrder,"The rows are not in correct order");
		
		}
	}
		@Test
	public void verifyName()
	{
		String expectedValue="Ashton Cox";
		driver.navigate().to("https://selenium.obsqurazone.com/table-pagination.php");
		WebElement name=driver.findElement(By.xpath("//td[text()='Ashton Cox']"));
		String actualValue=name.getText();	
		Assert.assertEquals(expectedValue,actualValue,"The name "+expectedValue+ " is not available");
		}
	}


