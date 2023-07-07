package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//open web site
		driver.get("https://demoqa.com/register");
		
		//firstName
		WebElement firstname= driver.findElement(By.id("firstname"));
		
		//verify the firstName is displayed
		if(firstname.isDisplayed()) {
			System.out.println("First Name is displayed");
		}else {
			System.out.println("First Name is not displayed");
		}
		//verify the fistName is enabled
		if(firstname.isEnabled()) {
			System.out.println("First Name is enabled");
		}else {
			System.out.println("First Name is disabled");
		}
		//Enter the first name
		if(firstname.isEnabled()) {
			firstname.sendKeys("Ramana");
			System.out.println("First Name value is entered");
		}
		else
		{
			System.out.println("Unable to enter the first name");
		}
		//Get the value from the first Name edit box
		String name = firstname.getAttribute("value");
		System.out.println("The value present in the first name field is "+name);
		//clear the value in the first name edit box
		Thread.sleep(3000);
		
		firstname.clear();
		//Get the value from the first Name edit box
		String fname = firstname.getAttribute("value");
	    System.out.println("The value present in the first name field is "+fname);
			
		
		
		
		
		driver.close();
		

	}

}
