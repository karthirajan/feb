package com.stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.resources.FunctionalLibrary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddTariffPlanSteps extends FunctionalLibrary {
	
	

	
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
	
	@Given("User click on add tariff plan button")
	public void user_click_on_add_tariff_plan_button() {
		handleFrame();
		driver.findElement(By.xpath("(//a[text()='Add Tariff Plan'])[1]")).click();
	
	}

	@When("User enters all the fields with two dim list")
	public void user_enters_all_the_fields_with_two_dim_list(io.cucumber.datatable.DataTable datas) {

		List<List<String>> asLists = datas.asLists(String.class);
		
		driver.findElement(By.id("rental1")).sendKeys(asLists.get(3).get(0));
		driver.findElement(By.id("local_minutes")).sendKeys(asLists.get(2).get(1));
		driver.findElement(By.id("inter_minutes")).sendKeys(asLists.get(3).get(2));
		driver.findElement(By.id("sms_pack")).sendKeys(asLists.get(3).get(3));
		driver.findElement(By.id("minutes_charges")).sendKeys(asLists.get(3).get(4));
		driver.findElement(By.id("inter_charges")).sendKeys(asLists.get(3).get(5));
		driver.findElement(By.id("sms_charges")).sendKeys(asLists.get(1).get(6));
		
	}
	
	@When("User enters all the fields with two dim map")
	public void user_enters_all_the_fields_with_two_dim_map(io.cucumber.datatable.DataTable datas) {

		List<Map<String, String>> asMaps = datas.asMaps(String.class, String.class);
		
		driver.findElement(By.id("rental1")).sendKeys(asMaps.get(3).get("MR"));
		driver.findElement(By.id("local_minutes")).sendKeys(asMaps.get(2).get("FIS"));
		driver.findElement(By.id("inter_minutes")).sendKeys(asMaps.get(3).get("FLM"));
		driver.findElement(By.id("sms_pack")).sendKeys(asMaps.get(3).get("FSP"));
		driver.findElement(By.id("minutes_charges")).sendKeys(asMaps.get(3).get("LMC"));
		driver.findElement(By.id("inter_charges")).sendKeys(asMaps.get(3).get("IMC"));
		driver.findElement(By.id("sms_charges")).sendKeys(asMaps.get(1).get("SMS"));
		
	}
	
	@When("User enters all the fields {string},{string},{string},{string},{string},{string},{string}")
	public void user_enters_all_the_fields(String a, String b, String c, String d, String e, String f, String g) {
	   handleFrame();
		
		driver.findElement(By.id("rental1")).sendKeys(a);
		driver.findElement(By.id("local_minutes")).sendKeys(b);
		driver.findElement(By.id("inter_minutes")).sendKeys(c);
		driver.findElement(By.id("sms_pack")).sendKeys(d);
		driver.findElement(By.id("minutes_charges")).sendKeys(e);
		driver.findElement(By.id("inter_charges")).sendKeys(f);
		driver.findElement(By.id("sms_charges")).sendKeys(g);
	}
	
	@When("User clicks on submit button")
	public void user_clicks_on_submit_button() {
		driver.findElement(By.xpath("(//input[@value='submit'])")).click();
	}

	@Then("User should be display confirm message")
	public void user_should_be_display_confirm_message() {
	    
	}

}
