package Tokopedia;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tokopedia {
	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    driver.get("https://www.tokopedia.com");
	driver.manage().window().maximize();
	
	//==========Search Item==========//
	driver.findElement(By.xpath("//*[@id=\"header-main-wrapper\"]/div[2]/div[5]/button[1]")).click();
	driver.findElement(By.xpath("//*[@id=\"email-phone\"]")).sendKeys("jihandesy12@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"email-phone-submit\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"password-input\"]")).sendKeys("desyjihan12");
	driver.findElement(By.xpath("//span[@class='css-16s5os-unf-checkbox__area e3y1k2n1']")).click();
	driver.findElement(By.xpath("//span[@aria-label='login-button']")).click();
	driver.findElement(By.xpath("//*[@id=\"header-main-wrapper\"]/div[2]/div[2]/div[1]/div/div/div")).click();
	driver.findElement(By.xpath("//*[@id=\"header-main-wrapper\"]/div[2]/div[2]/div[1]/div/div/div/input")).sendKeys("Flatshoes");
	driver.findElement(By.xpath("//*[@id=\"header-main-wrapper\"]/div[2]/div[2]/div[1]/div/div/div/input")).sendKeys(Keys.ENTER);
	delay(3);
//	scroll(200);
	driver.findElement(By.xpath("//*[@id=\"zeus-root\"]/div/div[2]/div/div[2]/div[3]/div[2]/div[2]")).click();
	
	delay(3);
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
	
//	static void scroll(int vertikal) {
//		JavascriptExecutor js =(JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,"+vertikal+")");
//	}

}
