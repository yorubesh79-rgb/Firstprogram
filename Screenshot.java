package learnautomation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver=  new ChromeDriver();
		
         driver.get("https://www.amazon.in/");
         driver.manage().window().maximize();
         File source =driver.getScreenshotAs(OutputType.FILE);
         File destination = new File("./RUBY/amazonpage.png");
         FileUtils.copyFile(source, destination);
         
        
	}
}
