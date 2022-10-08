package Tokopedia;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tokopedia {
	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    driver.get("https://www.tokopedia.com");
	driver.manage().window().maximize();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	/* SEARCH ITEM */
	driver.findElement(By.xpath("//*[@id=\"header-main-wrapper\"]/div[2]/div[2]/div[1]/div/div/div")).click();
	System.out.println("Button Search");
	driver.findElement(By.xpath("//*[@id=\"header-main-wrapper\"]/div[2]/div[2]/div[1]/div/div/div/input")).sendKeys("Flatshoes");
	System.out.println("Input Search Item");
	delay(2);
	driver.findElement(By.xpath("//*[@id=\"header-main-wrapper\"]/div[2]/div[2]/div[1]/div/div/div/input")).sendKeys(Keys.ENTER);
	System.out.println("Success Input Item");
	delay(3);

	js.executeScript("window,scrollBy(0,400)");
	Thread.sleep(400);
	
	/* CHOOSE ITEM */
	driver.findElement(By.xpath("//img[@alt='FARADELA Xandria Flatshoes Wanita Cute Mode Premium F01-14.3']")).click();
	System.out.println("Show Item");
	delay(3);
	
	js.executeScript("window,scrollBy(0,100)");
	Thread.sleep(400);
	delay(3);
	
	driver.findElement(By.xpath("//*[@id=\"pdpVariantContainer\"]/div[1]/div[1]/div/div[4]")).click();
	System.out.println("Choose Color");
//	delay(3);
	driver.findElement(By.xpath("//*[@id=\"pdpVariantContainer\"]/div[1]/div[2]/div/div[3]")).click();
	System.out.println("Choose Size");
	
	delay(5);
	driver.quit();
	}
	
	static void delay(int detik)
	{
		try {
			Thread.sleep(1000*detik);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}

	}
}
