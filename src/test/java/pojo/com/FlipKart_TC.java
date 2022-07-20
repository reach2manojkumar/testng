package pojo.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v101.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.BaseClass;

public class FlipKart_TC extends BaseClass{

	public FlipKart_TC() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(className="_2IX_2- VJZDxU")
	private WebElement email;

	public WebElement getEmail() {
		return email;
	}

	
	
	
}
