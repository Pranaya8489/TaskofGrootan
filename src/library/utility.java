package library;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.io.FileHandler;

public class utility {
	
	public static void getscreenshot(WebDriver driver, String Screenshotname) throws IOException 
	
	{

		try {
			File takescreenshot =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(takescreenshot,new File("./Folder1/"+Screenshotname +".png"));
			System.out.println("PASS");
		
		} 
		
		catch (IOException e) {
			System.out.println("FAIL");
			
			
		}
        
		
		try {
			
			File takescreenshot =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(takescreenshot,new File("./Folder2/"+Screenshotname +".png"));
			System.out.println("PASS");
		
		}
		
		catch (IOException e) {
			System.out.println("FAIL");
		}
		
		
		
		
	}
}
