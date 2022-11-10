package takescreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
	
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		Thread.sleep(2000);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
	    File src  = ts.getScreenshotAs(OutputType.FILE);
	    
	    File f1 = new File("C:/Users/priya/Desktop/Testing/Workspace/Git_Sample_TakeScreenshot/src/test/ts.png");
	
		FileUtils.copyFile(src, f1);
		

	}

}
