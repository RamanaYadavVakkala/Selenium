package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Test5 {

	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//open web site
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		WebElement dropDown= driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select"));
		//verify the country drop down list is displayed
		if(dropDown.isDisplayed()) {
			System.out.println("Country DropDown is displayed");
		}
		else {
			System.out.println("Country DropDwon list is not displayed");
		}
		//verify the country drop down list is enabled
		if(dropDown.isEnabled()) {
			System.out.println("Country Drop Down is Enabled");
		}else {
			System.out.println("Country Drop Down is not Enabled");
		}
		//To select the Item from the drop Down
		//creating the select object
		Select down=new Select(dropDown);
		
		down.selectByVisibleText("India");
		
		down.selectByIndex(4);//American Samoa
		
		down.selectByValue("Aruba");
		
		
		driver.close();
		

	}

}
