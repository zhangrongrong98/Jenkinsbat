package openbaidu;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class openbaidu {
@Test
	public void openbaidu() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	String url1="https://www.baidu.com/";
	driver.get(url1);
	driver .findElement(By.id("kw")).sendKeys("admin");
	driver .findElement(By.id("su")).click();
	}
	
}
