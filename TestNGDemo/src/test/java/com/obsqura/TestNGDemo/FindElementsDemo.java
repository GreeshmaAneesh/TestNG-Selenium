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
	public void TableSample() 
	{
		driver.navigate().to("https://selenium.obsqurazone.com/table-pagination.php");
		List <WebElement> header=driver.findElements(By.xpath("//tr[contains(@role,'row')]//th"));
		List <String> rows=new ArrayList<String>();
		rows.add("Name");
		rows.add("Position");
		rows.add("Office");
		rows.add("Age");
		rows.add("Start date");
		rows.add("Salary");
		System.out.println(rows);
		for(WebElement row:header)
		{
		String expectedHeaderOrder=row.getText();
		
		if(expectedHeaderOrder.equals(rows))
			{
				System.out.println("The rows are in correct order");
			}
			else
			{
				System.out.println("The rows are not in correct order");

			}
		{
		}	
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


