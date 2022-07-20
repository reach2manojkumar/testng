package com.testCase;

import java.io.IOException;

import org.checkerframework.framework.qual.FromByteCode;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Baseclass.BaseClass;
import pojo.com.FlipKart_TC;
import pojo.com.FormFill;

public class SelectElement extends BaseClass{

	@Test
	
	private void flipKart() throws InterruptedException {
		// TODO Auto-generated method stub
		
		try {
			lanuchBrowser("https://www.flipkart.com/account/login");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("lanuch Brower");
			e.printStackTrace();
		}
		Thread.sleep(3000);
		
		FlipKart_TC ff=new FlipKart_TC();
//		WebElement fE = driver.findElement(By.xpath("//*[@class='_2IX_2- VJZDxU']"));
		WebElement email = ff.getEmail();
		email.sendKeys("manoj");
		
		
		
		
		
	}
}
