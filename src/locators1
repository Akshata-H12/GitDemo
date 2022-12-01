import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ADMIN\\Documents\\geckodriver.exe");
		WebDriver Driver= new FirefoxDriver() ;
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Driver.get("https://rahulshettyacademy.com/locatorspractice/");
		Driver.findElement(By.id("inputUsername")).sendKeys("Akshata");
		Driver.findElement(By.name("inputPassword")).sendKeys("hello@123");
		Driver.findElement(By.className("signInBtn")).click();
		System.out.println(Driver.findElement(By.cssSelector("p.error")).getText());
		Driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		Driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Jyoti");
		Driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("jyoti@rsc.com");
		Driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		Driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("jyoti@gmail.com");
		Driver.findElement(By.xpath("//form/input[3]")).sendKeys("9874561233");
		Driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(Driver.findElement(By.cssSelector("form p")).getText());
		Driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(1000);
		Driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Akshata");
		Driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		Driver.findElement(By.id("chkboxOne")).click();
		Driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();

	}

}
