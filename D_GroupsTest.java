package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class D_GroupsTest
  {
	public WebDriver driver;
	String pageTitle = "Utakarshaa academy";
  @Test ( groups = "Regression")
  public void Starting_point() {
	  
	  driver = new ChromeDriver();
	  driver.get("https://www.utkarshaaacademy.com");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
   }
  @Test ( groups = "Sanity")
  public void checkTitle () {
	 
	 
	 String ActualTitle = driver.getTitle();
	 Assert.assertEquals(ActualTitle,pageTitle);
	 System.out.println("TestPass");
   }
  @Test( groups = "Regression")
  public void ClickonElement() {
	  
	driver.findElement(By.xpath("//nav//a[text()='Automation Practice']")).click();
System.out.println(driver.getCurrentUrl()); 
	 
  }
  
}
