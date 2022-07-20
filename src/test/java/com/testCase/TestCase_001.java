package com.testCase;

import java.awt.Desktop.Action;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import Baseclass.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import pojo.com.FacebookPage_pojo_1;
import pojo.com.FormFill;
import pojo.com.RedBus_pojo_1;

public class TestCase_001 extends BaseClass {

	@Test
	private void login_Facebook_01() throws IOException {
		/*
		 * Enter the username and password and verify whether the input is correct or
		 * not by using Testng framework.
		 */

		lanuchBrowser("https://www.facebook.com");
		FacebookPage_pojo_1 log = new FacebookPage_pojo_1();

		WebElement user_id = log.getUser_id_login();
		user_id.sendKeys("Manoj");
		

		WebElement user_pass = log.getUser_pass_login();
		user_pass.sendKeys("266526");
		
		System.out.println("anjsdfajs");
		
		WebElement text = driver.findElement(By.id("email"));
		String name = text.getAttribute("value");
		System.out.println(name);
		
		//Assertion 
		Assert.assertEquals("Manoj",name);
		
		
//		System.out.println(user_pass.getText());
//		
////		//Assertion 
//		Assert.assertEquals("manoj266506", user_pass.getText());

	}

	@Test
	private void login_Redbus_01() throws IOException {
		/*
		 * Click signin and enter the email and password and verify whether the input
		 * are correct or not by using Testng framework.
		 */

		lanuchBrowser("https://www.redbus.in/");
		RedBus_pojo_1 log = new RedBus_pojo_1();
		WebElement butsign = log.getButsign();
		butsign.click();
		WebElement overclick = log.getDragover();
		tomouseOver(overclick);
		
	}
	@Test
	private void formInput() throws InterruptedException {
		// TODO Auto-generated method stub
		try {
			lanuchBrowser("https://demoqa.com/automation-practice-form");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*
		 * WebElement findElement =
		 * driver.findElement(By.xpath("//form[@id=\"userForm\"]/div[1]/div[2]/input"));
		 * findElement.sendKeys("vaar");
		 */
		//fill firstName textbox 
		FormFill formup=new FormFill();
		WebElement firstName = formup.getFirstName();
		firstName.sendKeys("manoj");
		
		//fill lastName 
		WebElement lastName = formup.getLastName();
		lastName.sendKeys("kumar");
		//fill mailbox
		WebElement mailbox=formup.geteMail();
		mailbox.sendKeys("manojdhill506@gmail.com");
		//fill gender
		WebElement gender=formup.getGenderM();
		gender.click();
		//fill mobileNum
		WebElement mobileNum=formup.getMobileNum();
		mobileNum.sendKeys("9486852506");
		//fill date of birth 
		WebElement datofbirth=formup.getDataBirth();
		datofbirth.click();
		Thread.sleep(2000);
		datofbirth.clear();
		Thread.sleep(2000);
		datofbirth.sendKeys("05251996");
		Thread.sleep(5000);
		/*
		 * driver.findElement(By.id("dateOfBirthInput")).click(); SelectElement
		 * MonthSelect = new SelectElement(driver.FindElement(By.ClassName(
		 * "react-datepicker__month-select"))); MonthSelect.SelectByIndex(3);
		 * 
		 * //Select year and assign to variable, then select year by index SelectElement
		 * YearSelect = new
		 * SelectElement(driver.FindElement(By.ClassName("react-datepicker__year-select"
		 * ))); YearSelect.SelectByIndex(123);
		 * 
		 * //Select the specific day you want by classname
		 * driver.FindElement(By.ClassName("react-datepicker__day--008")).Click();
		 */
		
		
		
		
		
		
		//fill subject
		
		/*
		 * WebElement suj = driver.findElement(By.className(" css-2b097c-container"));
		 * suj.click(); suj.sendKeys("computer"); suj.sendKeys(Keys.TAB);
		 */
		WebElement subject=formup.getSubjectName();
		subject.click();
		subject.sendKeys("Computer Science");
		//fill hobbies 
		WebElement hobbies=formup.getHobbiesName();
		hobbies.click();
		//fill pictureup
		WebElement pictureup=formup.getPictureUpload();
		pictureup.sendKeys("D:\\QA test\\java\\New folder\\maven project\\interivew/1.PNG");
		//fill Current Address 
		WebElement CurAddress=formup.getCurrentAddress();
		CurAddress.sendKeys("manoj kumar /n devaray fagar /n namkkal /n");
		//fill state 
		
		WebElement stateSel =driver.findElement(By.xpath("//div[text()='Select State']"));
	
		stateSel.click();
		stateSel.sendKeys("ncr");
		stateSel.sendKeys(Keys.ENTER);
		
		
		/*
		 * WebElement state=formup.getSelState(); state.sendKeys("tamil nadu");
		 * state.sendKeys(Keys.ARROW_DOWN); state.sendKeys(Keys.ENTER)
		 */
				
		}
	
	@Test
	private void questAll() throws IOException {
		// TODO Auto-generated method stub
		lanuchBrowser("https://www.facebook.com");
		WebElement l= driver.findElement(By.tagName("label"));
		String pageSource = l.getText();
		
		System.out.println(pageSource);
	}

//	@AfterMethod
//	private void close() throws InterruptedException {
//		// TODO Auto-generated method stub
//		Thread.sleep(2000);
//		toQuit();
//	}

}
