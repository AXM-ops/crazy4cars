package page_class;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pageclass 
{
	
	WebDriver driver;
		
	@FindBy(xpath="/html/body/div[1]/header/div/div[2]/div/div/div[3]/div[2]/a/span[2]")
	WebElement login;
	
	@FindBy(xpath="/html/body/font/font/div[3]/form/p[1]/input[1]")
	WebElement emailLogin;
	
	@FindBy(xpath="/html/body/font/font/div[3]/form/p[2]/span/input")
	WebElement passLogin;
	
	@FindBy(xpath="/html/body/font/font/div[3]/form/p[3]/button")
	WebElement loginbtn;     
	
	@FindBy(xpath="/html/body/div[1]/header/div/div[3]/div/div/div[2]/div/ul/li[2]/a")
	WebElement dropdown;
	
	@FindBy(xpath="/html/body/div[1]/header/div/div[3]/div/div/div[2]/div/ul/li[2]/div/div/ul/li[1]/a")
	WebElement collectorshub;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/main/div/div[3]/div[2]/div[1]/div/div[2]/div[2]/a")
	WebElement cart;
	
	public Pageclass(WebDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	public void test1(String emaill,String passwd) throws Exception
	{
		Thread.sleep(2000);
		login.click();
		emailLogin.sendKeys(emaill);
		passLogin.sendKeys(passwd);
		loginbtn.click();
		
	}	
	public void drpdown()
	{
		dropdown.click();
		collectorshub.click();
		
	}
	public void cartt()
	{
		cart.click();
	}
}
		
