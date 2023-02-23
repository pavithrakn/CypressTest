package New;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homepage {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bavit\\eclipse-workspace\\Task\\chromedriver.exe");
	 	WebDriver driver=new ChromeDriver();
	 	driver.get("http://localhost:3000/signin");
	 	driver.manage().window().maximize();
		WebElement uname = driver.findElement(By.id("username"));
		uname.sendKeys("testuser");
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("testuser");
		
		
	}

}
