package com.test.Testselenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 
public class Demo01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sghosh\\Seleniumdriver\\chromedriver\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();  
	    /*
	    driver.get("http:www.google.com/");
	    driver.findElement(By.name("q")).sendKeys("Simplilearn");
	    driver.findElement(By.name("btnk")).click();
	    Thread.sleep(1000);
	    */
	    driver.get("https://www.selenium.dev/");
	    Thread.sleep(1000);
	    try
	    {
	    	 /*
	    // Click on the search text box and send value  
	    driver.findElement(By.name("q")).sendKeys("selenium");  
	          
	    // Click on the search button  
	    driver.findElement(By.name("btnK")).click(); 
	    Thread.sleep(1000);
	    */
	    System.out.println("Tile of page "+driver.getTitle());
	    
	    String actualTitle=driver.getTitle();
	    String expectedTitle="Selenium";
	   
        if(actualTitle.equals(expectedTitle))
	    {
	    	System.out.println("Verification successful correct url is opened ");
	    }
	    else
	    {
	    	System.out.print("Verification failed  incorret url");
	    
	    }
	    }
	    catch(Exception ex)
	     {
	       System.out.println("error"+ex);
	     }
	     finally
	     {
	    	driver.close();
	     }
	}

}
