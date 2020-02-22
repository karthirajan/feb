package com.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.objectrepository.AddCustomerPage;
import com.objectrepository.HomePage;
import com.resources.FunctionalLibrary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddCustomer extends FunctionalLibrary{

	HomePage hp=new HomePage();
	AddCustomerPage cp=new AddCustomerPage();
	
	public void handleFrame() {
		try {
			Thread.sleep(3000);
			WebElement frame = driver.findElement(By.xpath("//iframe[@id='flow_close_btn_iframe']"));
			driver.switchTo().frame(frame);
			driver.findElement(By.xpath("//div[@id='closeBtn']")).click();
			driver.switchTo().defaultContent();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Given("User click on add customer button")
	public void user_click_on_add_customer_button(){
		handleFrame();
		click(hp.getAddCustomerBtn());
	}
	
	@When("User enters all the fields")
	public void user_enters_all_the_fields() {
		handleFrame();
		
		click(cp.getDoneBtn());
		insertText(cp.getFname(), "karthi");
		insertText(cp.getLname(), "rajan");
		insertText(cp.getEmail(), "rajan@gmail.com");
		insertText(cp.getAddr(), "tanjore");
		insertText(cp.getPhno(), "6526524");
		
			
	}
	
	@When("User enters all the fields with one dim list")
	public void user_enters_all_the_fields_with_one_dim_list(DataTable datas) {
		
		List<String> asList = datas.asList(String.class);
		
		handleFrame();
		driver.findElement(By.xpath("(//label[text()='Done'])[1]")).click();
	   	insertText(cp.getFname(), asList.get(0));
			driver.findElement(By.id("lname")).sendKeys(asList.get(1));
			driver.findElement(By.id("email")).sendKeys(asList.get(2));
			driver.findElement(By.name("addr")).sendKeys(asList.get(3));
			driver.findElement(By.id("telephoneno")).sendKeys(asList.get(4));
		
			
	}
	
	@When("User enters all the fields with one dim map")
	public void user_enters_all_the_fields_with_one_dim_map(DataTable datas) {
		
		Map<String, String> asMap = datas.asMap(String.class, String.class);
		
		handleFrame();
		driver.findElement(By.xpath("(//label[text()='Done'])[1]")).click();
			driver.findElement(By.id("fname")).sendKeys(asMap.get("fname"));
			driver.findElement(By.id("lname")).sendKeys(asMap.get("lname"));
			driver.findElement(By.id("email")).sendKeys(asMap.get("mail"));
			driver.findElement(By.name("addr")).sendKeys(asMap.get("addr"));
			driver.findElement(By.id("telephoneno")).sendKeys(asMap.get("phno"));
		
			
	}

	@When("User click on submit button")
	public void user_click_on_submit_button() {
		handleFrame();
		click(cp.getSubmitBtn());
	}
	@Then("User should be display cutomer id")
	public void user_should_be_display_cutomer_id() {
		handleFrame();
		Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[1]")).isDisplayed());
		String text1 = driver.findElement(By.xpath("(//td[@align='center'])[1]")).getText();
		String text2 = driver.findElement(By.xpath("(//td[@align='center'])[2]")).getText();
     
		
		System.out.println(text1+"is :"+text2);
	}



}
