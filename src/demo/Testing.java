package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Testing {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.manage().window().maximize();
		//it is a timer for waiting
		Thread.sleep(3000);
		//Example bye name locator
		driver.findElement(By.name("txtUserName")).sendKeys("Ramana");
		driver.findElement(By.name("txtPassword")).sendKeys("ramana@455");
		//Example by id locator
		driver.findElement(By.id("")).sendKeys("");
		//Example by Link Locator
		driver.findElement(By.linkText("")).click();
		//Example by partial Link Text
		driver.findElement(By.partialLinkText("")).click();
		
		
		
		
		
		
		
		
		//it automatically close the window
		driver.close();

	}

}
