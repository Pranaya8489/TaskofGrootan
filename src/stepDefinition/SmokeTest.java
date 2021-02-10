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

public class SmokeTest {

	WebDriver driver;

	
	@Test
	@Given("^Open Chrome and Open the Grootan technologies site$")
	public void Open_Chrome_and_Open_the_Grootan_technologies_site() throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pranaya\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		Thread.sleep(5000);
		WebDriver driver = new ChromeDriver();
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://www.grootan.com/");
		Thread.sleep(5000);
		utility.getscreenshot(driver, "Opened the site");
		driver.findElement(By.xpath("//*[@id=\"main-nav\"]/div[1]/ul/li[2]/a[1]")).click();
		utility.getscreenshot(driver, "Home");
		driver.findElement(By.xpath("//*[@id=\"main-nav\"]/div[1]/ul/li[2]/a[2]")).click();
		utility.getscreenshot(driver, "services");
		driver.findElement(By.xpath("//*[@id=\"main-nav\"]/div[1]/ul/li[2]/a[3]")).click();
		utility.getscreenshot(driver, "OpenSource");
		driver.findElement(By.xpath("//*[@id=\"main-nav\"]/div[1]/ul/li[2]/a[4]")).click();
		utility.getscreenshot(driver, "Blog");
		driver.findElement(By.xpath("//*[@id=\"main-nav\"]/div[1]/ul/li[2]/a[5]")).click();
		utility.getscreenshot(driver, "Team");
		driver.findElement(By.xpath("//*[@id=\"main-nav\"]/div[1]/ul/li[2]/a[6]")).click();
		utility.getscreenshot(driver, "Careers");
		driver.findElement(By.xpath("//*[@id=\"main-nav\"]/div[1]/ul/li[2]/a[7]")).click();
		utility.getscreenshot(driver, "Contactus");

        
        BufferedImage bufferfileInput = ImageIO.read(getClass().getResource("./Folder1/\"+Screenshotname +\".png"));
 
                        
        BufferedImage bufferfileOutPut = ImageIO.read(getClass().getResource("./Folder2/\"+Screenshotname +\".png"));

        
        
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
	

	
