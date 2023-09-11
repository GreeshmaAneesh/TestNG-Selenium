package com.obsqura.TestNGDemo;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.devtools.v112.input.model.DragData;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorAnalysisDemo extends BaseDemo{
	@Test
	public void byCssSelector()
	{
	WebElement showMessageButton=driver.findElement(By.cssSelector("button#button-one"));
	}
	@Test
	public void byClass()
	{
	WebElement section=driver.findElement(By.className("clearfix"));
	}
	@Test
	public void byId()
	{
	WebElement getTotal=driver.findElement(By.id("button-two"));
	}
	@Test
	public void byXpath()
	{
	WebElement enterValueATextField=driver.findElement(By.xpath("//input[@id='value-a']"));
	}


}
