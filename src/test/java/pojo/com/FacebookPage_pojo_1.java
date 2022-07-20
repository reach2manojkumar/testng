package pojo.com;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import Baseclass.BaseClass;

public class FacebookPage_pojo_1  extends BaseClass {
	
	public FacebookPage_pojo_1() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver,this);
	}
	
	
	public WebElement getUser_id_login() {
		return user_id_login;
	}
	public WebElement getUser_pass_login() {
		return user_pass_login;
	}
	public WebElement getUser_button_login() {
		return user_button_login;
	}
	
	
	
	@FindBy(id="email")
	private WebElement user_id_login;
	
	@FindAll({
		
		@FindBy(id="pass"),
		@FindBy(name="pass"),
		
	})
	private WebElement user_pass_login; 

	@FindBys({
		@FindBy(id="u_0_9_hH"),
		@FindBy(xpath="//button[@id='u_0_9_hH']"),
		@FindBy(xpath="//button[text(),'Log In']")
	})
	private WebElement user_button_login;
	
	

}
