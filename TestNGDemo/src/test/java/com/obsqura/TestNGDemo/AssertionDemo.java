package com.obsqura.TestNGDemo;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.Assert;


public class AssertionDemo extends BaseDemo{
	@Test
	public void assertEquals()
	{
		String input= "Apple";
		String actualMessage;
		String expectedMessage="Your Message : " +input;
		WebElement singleInputTextField=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		singleInputTextField.sendKeys(input);
		WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		showMessageButton.click();
		WebElement yourMessage=driver.findElement(By.xpath("//div[@id='message-one']"));
	   actualMessage=yourMessage.getText();
	    Assert.assertEquals(expectedMessage,actualMessage,"Your Message text is not" +expectedMessage);
		}
	@Test
	public void verifyRadioButtonsDisabledInitially()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		WebElement maleRadioButton=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		WebElement femaleRadioButton=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		boolean isMaleRadioButtonDisabled=maleRadioButton.isSelected();
		//boolean isFemaleRdioButtonDisabled=femaleRadioButton.isSelected();
		assertFalse(isMaleRadioButtonDisabled,"Male Radio Button is Enabled");
	}
	public void verifyCheckBoxIsChecked()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		WebElement singleCheckBoxDemo=driver.findElement(By.xpath("//input[@id='gridCheck']"));
		singleCheckBoxDemo.click();
		boolean isSingleCheckBoxSelected=singleCheckBoxDemo.isSelected();
		assertTrue(isSingleCheckBoxSelected,"Check Box Button is not Enabled");
    }
	@Test
	public void notEqualSample()
	{
		String a="ABC";
		String b="CDE";
		assertNotEquals(a,b,"a and b are same");
	}
	@Test
	public void assertNullSample()
	{
		String a=null;
		assertNull(a,"A is not null");
	}
	@Test
	public void assertNotNullsample()
	{
		String a="Greeshma";
		assertNotNull(a,"A is null");
	}
	
	@Test
	public void hardAssert()
	{
		String expectedBackGroundColor="rgba(0, 123, 255, 1)";
		String exceptedMessage="Show Message";
		WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		String showMessageButtonBackgroungColor=showMessageButton.getCssValue("background-color");
		String actualMessage=showMessageButton.getText();
		Assert.assertEquals(exceptedMessage,actualMessage,"The text is not Show Message");
		Assert.assertEquals(expectedBackGroundColor, showMessageButtonBackgroungColor,"The background color is not"+expectedBackGroundColor);
}}
