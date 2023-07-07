package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//driver.get("http://183.82.103.245/nareshit/login.php");
		
		//Storing the application url in the string variable
		
		String url="http://183.82.103.245/nareshit/login.php";
		//Lunch the website
		driver.get(url);
		driver.manage().window().maximize();
		
		//Storing Title name in the string variable
		 String actualTitle = driver.getTitle();
		 System.out.println(actualTitle);
		 
		//Storing Excepted Title in String variable
		 String expectedTitle ="OrangeHRM - New Level of HR Management";
		 //verification
		 if(actualTitle.equals(expectedTitle))
		 {
			 System.out.println("The title of the page is "+actualTitle);
		 }else {
			 System.out.println("Title verification is failed");
			 System.out.println("Actual title name is"+actualTitle);
			 System.out.println("Expected Title name is "+expectedTitle);
		 }
		 
		 //Stroing the actual url in the string variable
		 String actualUrl = driver.getCurrentUrl();
		 System.out.println(actualUrl);
		 
		 
		 //Storing page source in string variable
		 String pagesource = driver.getPageSource();
		// System.out.println(pagesource);
		 
		 //storing page source length in int variable
		 int pageSourceLength = pagesource.length();
		 
		//Printing length of the page source on console
		 System.out.println("The total length of the page source is "+pageSourceLength);
	//close the browser
		// driver.close();
		 //one more page for using quit method
		 driver.quit();

	}

}
