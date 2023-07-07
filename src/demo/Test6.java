package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//open web site
		driver.get("https://www.nareshit.in/student-registration/");
		
		WebElement titleValidation = driver.findElement(By.id("page-title"));
		//verify the Registration title is displayed
		if(titleValidation.isDisplayed()) {
			System.out.println("Title is displayed");
		}else {
			System.out.println("Title is not displayed");
		}
		//Validating the actual and expected text
		String expectedText = "Student Registration";
		
		String actualText = titleValidation.getText();
		//comparing the text
		if(actualText.equals(expectedText)) {
			System.out.println("Same");
		}else {
			System.out.println("Different Title");
		}
		//submit
		driver.findElement(By.name("submit")).click();
		

	}

}

