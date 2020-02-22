package com.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class AddCustomerPage extends FunctionalLibrary{
	
	public AddCustomerPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="(//label[text()='Done'])[1]")
	private WebElement  DoneBtn;
	
	@FindBy(id="fname")
	private WebElement  fname;
	
	@FindBy(id="lname")
	private WebElement  lname;
	
	@FindBy(id="email")
	private WebElement  email;
	
	@FindBy(name="addr")
	private WebElement  addr;
	
	@FindBy(id="telephoneno")
	private WebElement  phno;
	
	@FindBy(xpath="(//input[@value='Submit'])[1]")
	private WebElement  submitBtn;

	public WebElement getDoneBtn() {
		return DoneBtn;
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getAddr() {
		return addr;
	}

	public WebElement getPhno() {
		return phno;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	
	

}


