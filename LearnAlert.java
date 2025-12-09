package learnautomation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.leafground.com/alert.xhtml");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[Text()='show']")).click();
            
		Alert simpleAlert = driver.switchTo().alert();
		
	    simpleAlert.accept();
		
		// TODO Auto-generated method stub

	}

}