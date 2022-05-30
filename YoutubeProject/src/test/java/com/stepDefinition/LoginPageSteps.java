package com.stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageSteps {
	
	WebDriver driver;
	
	@Given("user on login page")
	public void user_on_login_page() {
	    WebDriverManager.chromedriver().setup();
	    driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.automationexercise.com/");
	    driver.findElement(By.xpath("//i[@class='fa fa-lock']")).click();
	    		
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("admin1@gmail.com");
		driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys("12345678");
	}

	@And("user clicks on login button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();
		
	}

	@Then("user sees message")
	public void user_sees_message() {
		driver.findElement(By.xpath("//form[@action='/login']/p")).getText();
		System.out.println("I got the text");
		driver.close();
	}

}
