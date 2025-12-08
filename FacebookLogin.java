package learnautomation1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException{
		//Launch the browser
		ChromeDriver driver=new ChromeDriver();
		
		//load the url
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("sample@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("sample password");
		
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
		driver.quit();
	}

}
