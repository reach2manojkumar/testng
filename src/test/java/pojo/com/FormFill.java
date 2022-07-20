package pojo.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import Baseclass.BaseClass;

public class FormFill extends BaseClass {

	public FormFill() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//form[@id=\"userForm\"]/div[1]/div[2]/input")
	private WebElement firstName;

	
	 @FindBy(xpath="//form[@id=\"userForm\"]/div[1]/div[4]/input")
	 private WebElement lastName; 
	 
	 @FindBy(xpath="//*[@placeholder='name@example.com']")
	 private WebElement eMail; 
	 
	 @FindBy(xpath="//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")
	 private WebElement genderM;
	

	 @FindBy(id="dateOfBirthInput")
	 private WebElement dataBirth;
	 	 
	 @FindBy(id="userNumber")
	 private WebElement mobileNum;
	 
	 
	
	 @FindBy(id="subjectsContainer")
	 private WebElement subjectName;
	 
	 @FindBy(xpath="//label[text()='Sports']")
	 private WebElement hobbiesName;
	 
	 @FindBy(id="uploadPicture")
	 private WebElement pictureUpload;
	 
	 @FindBy(id="currentAddress")
	 private WebElement CurrentAddress;
	 
	 @FindBy(xpath="//*[@id=\"state\"]/div/div[1]")
	 private WebElement SelState; 
	 
	 @FindBy(xpath="//*[@id=\"state\"]/div[1]/div[1]")
	 private WebElement selCity;
	 
	 @FindBy(id="city")
	 private WebElement subMit;
	 
	 public WebElement getLastName() {
		return lastName;
	}

	public WebElement geteMail() {
		return eMail;
	}

	public WebElement getGenderM() {
		return genderM;
	}


	public WebElement getDataBirth() {
		return dataBirth;
	}

	public WebElement getMobileNum() {
		return mobileNum;
	}

	public WebElement getSubjectName() {
		return subjectName;
	}

	public WebElement getHobbiesName() {
		return hobbiesName;
	}

	public WebElement getPictureUpload() {
		return pictureUpload;
	}

	public WebElement getCurrentAddress() {
		return CurrentAddress;
	}

	public WebElement getSelState() {
		return SelState;
	}

	public WebElement getSelCity() {
		return selCity;
	}

	public WebElement getSubMit() {
		return subMit;
	}

	
	 
	public WebElement getFirstName() {
		return firstName;
	}

}
