package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		
		Thread.sleep(3000);
		//click on cart link
		driver.findElement(By.xpath("//*[@id=\"nav-cart-text-container\"]/span[2]")).click();
		
		Thread.sleep(3000);
		
		//go back to perivous page
		driver.navigate().back();
		
		Thread.sleep(3000);
		//navigate to forward page
		driver.navigate().forward();
		
		Thread.sleep(3000);
		//refresh the browser
		driver.navigate().refresh();
		//navigate to customer service page
		Thread.sleep(3000);
		driver.navigate().to("https://www.amazon.in/gp/help/customer/display.html?nodeId=200507590&ref_=nav_cs_help");
		
		Thread.sleep(3000);
		driver.close();

	}

}
