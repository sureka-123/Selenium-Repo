package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class learndropdown {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		

		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.close();
		
		driver.findElement(By.id("user name")).sendKeys("demosalesmanager");
		webelement passwod=driver.findElement(By.id("pssword"));
		 
	 password.sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.close();
		driver.findElement()
		
	}

}
