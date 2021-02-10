package stepDefinition;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class JuniorEngineers {
	
	@Test
	public void writeexcel() throws Exception{
	System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pranaya\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		Thread.sleep(5000);
		WebDriver driver = new ChromeDriver();
		Thread.sleep(5000);
		driver.manage().window().maximize();
		 System.out.println("a");
			
		 
		Thread.sleep(5000);
		driver.get("https://www.grootan.com/");
		

		Thread.sleep(5000);
		
	    driver.findElement(By.xpath("//*[@id=\"main-nav\"]/div[1]/ul/li[2]/a[5]")).click();
	

		Thread.sleep(5000);
	  //  driver.findElement(By.xpath("//*[@id=\"root\"]/main/button/div")).click();
	 //   Thread.sleep(5000);
	 //   driver.findElement(By.xpath("//*[@id=\"root\"]/div/footer/div[1]/div/div[2]/button")).click();
	    

		 XSSFWorkbook workbook = new XSSFWorkbook();
		 XSSFSheet spreadsheet = workbook.createSheet( "Junior Engineers");
		 XSSFRow row;
		 
		 
	    Map<String, Object[]> data = new TreeMap<String, Object[]>(); 
	    
		String Karan = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section[2]/div/div/div/div/div/div[4]/div[2]/h3")).getText();
	    System.out.println(Karan);
	    String Sangeetha = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section[2]/div/div/div/div/div/div[4]/div[3]/h3")).getText();
	    System.out.println(Sangeetha);
	    String Sarath  = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section[2]/div/div/div/div/div/div[5]/div[4]/h3")).getText();
	    System.out.println(Sarath);
	    String Arjun = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section[2]/div/div/div/div/div/div[6]/div[4]/h3")).getText();
	    System.out.println(Arjun);
	    String Balaji = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section[2]/div/div/div/div/div/div[7]/div[1]/h3")).getText();
	    System.out.println(Balaji);
	    String Gokul = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section[2]/div/div/div/div/div/div[8]/div[2]/h3")).getText();
	    System.out.println(Gokul);
	    String GokulRaj = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section[2]/div/div/div/div/div/div[8]/div[3]/h3")).getText();
	    System.out.println(GokulRaj);
	    String Julian = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section[2]/div/div/div/div/div/div[8]/div[4]/h3")).getText();
	    System.out.println(Julian);
	    String Sanjai = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section[2]/div/div/div/div/div/div[9]/div[1]/h3")).getText();
	    System.out.println(Sanjai);
	    String sesha = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section[2]/div/div/div/div/div/div[9]/div[2]/h3")).getText();
	    System.out.println(sesha);
	    String Sharang = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section[2]/div/div/div/div/div/div[9]/div[3]/h3")).getText();
	    System.out.println(Sharang);
	    String Chethana = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section[2]/div/div/div/div/div/div[9]/div[4]/h3")).getText();
	    System.out.println(Chethana);
	    String Priya = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section[2]/div/div/div/div/div/div[10]/div[1]/h3")).getText();
	    System.out.println(Priya);
	    
	    
	    Set<String> keyset = data.keySet(); 
	    int rownum = 0; 
        for (String key : keyset) { 
        
			// this creates a new row in the sheet 
            Row row1 =spreadsheet.createRow(rownum++); 
            Object[] objArr = data.get(key); 
            int cellnum = 0; 
            for (Object obj : objArr) { 
                // this line creates a cell in the next column of that row 
                Cell cell = row1.createCell(cellnum++); 
                if (obj instanceof String) 
                    cell.setCellValue((String)obj); 
                else if (obj instanceof Integer) 
                    cell.setCellValue((Integer)obj); 
                
                
            } 
            
            try { 
                // this Writes the workbook gfgcontribute 
                FileOutputStream out = new FileOutputStream(new File("C:\\Users\\pranaya\\Pictures\\Write data.xlsx")); 
                workbook.write(out); 
                out.close(); 
                System.out.println("Data Written sucessfully in excel"); 
            } 
            catch (Exception e) { 
                e.printStackTrace();
        } 
	    
	   


	    
	   

	    
	    
}}}

