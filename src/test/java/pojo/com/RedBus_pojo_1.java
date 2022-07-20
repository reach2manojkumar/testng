package pojo.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.BaseClass;

public class RedBus_pojo_1 extends BaseClass{
	
	public RedBus_pojo_1() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="signin-block")
	private WebElement butsign;

	public WebElement getButsign() {
		return butsign;
	}
	@FindBy(id="signInLink")
	private WebElement dragover;

	public WebElement getDragover() {
		return dragover;
	}

	
	
}
