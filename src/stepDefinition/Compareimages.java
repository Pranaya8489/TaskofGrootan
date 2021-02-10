package stepDefinition;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import library.utility;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class Compareimages {

	@Test

	@Given("^Open Chrome and Open the Grootan technologies site$")
	public  void  open () throws Throwable {
		
		

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pranaya\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		Thread.sleep(5000);
		WebDriver driver = new ChromeDriver();
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://www.grootan.com/");
		Thread.sleep(5000);

		
         driver.findElement(By.xpath("//*[@id=\"main-nav\"]/div[1]/ul/li[2]/a[5]")).click();
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/section[2]/div/div/div/div/div/div[1]/div[1]/img")).click();
		 driver.findElement(By.xpath("//*[@id=\"root\"]/main/button/div")).click();
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/footer/div[1]/div/div[2]/button")).click();
		 Thread.sleep(5000);
		 utility.getscreenshot(driver, "CTO & Co-Founder");

		 
		
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/section[2]/div/div/div/div/div/div[1]/div[2]/img")).click();
		 utility.getscreenshot(driver, "HR Manager");
         BufferedImage bufferfileInput = ImageIO.read(getClass().getResource("C://Users//pranaya//eclipse-workspace//Seleniumcucmberproject//Folder3//CTO.png"));
	     BufferedImage bufferfileOutPut = ImageIO.read(getClass().getResource("C://Users//pranaya//eclipse-workspace//Seleniumcucmberproject//Folder4//HR.png"));
         ImageDiffer  imgdiffer = new ImageDiffer();
	        ImageDiff diff = imgdiffer.makeDiff(bufferfileInput,bufferfileOutPut);
	     
	        if(diff.hasDiff() ==true)
	     	   
	        {
	        		System.out.println("Images are NOT same");

	     	}
	        
	        else
	     	   
	        {
	     		System.out.println("Images are  same");

	     	}}
		
		}
		

		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
