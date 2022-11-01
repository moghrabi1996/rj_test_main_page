package rj.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rj_mainPage_test {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\newWebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.rj.com");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("/html/body/div[2]/section[2]/div[2]/div/div/div/div/div[2]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"onlineBookingorigion_flexselect\"]")).sendKeys("amman");
		driver.findElement(By.xpath("//*[@id=\"onlineBookingdestination_flexselect\"]")).sendKeys("abu dahbi");
		driver.findElement(By.xpath("//*[@id=\"onlineBookingdestination_flexselect\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"rangeLightPicker0\"]")).click();
		driver.findElement(
				By.xpath("//*[@id=\"rangeLightPickerContainer0\"]/section/div/div[2]/section[2]/div[2]/div[2]"))
				.click();
		driver.findElement(
				By.xpath("//*[@id=\"rangeLightPickerContainer0\"]/section/div/div[2]/section[2]/div[2]/div[3]"))
				.click();
		driver.findElement(By.xpath("//*[@id=\"btntoggleTravelerContainer\"]")).click();
		for (int i = 0; i < 5; i++) {
			driver.findElement(By.xpath("//*[@id=\"divTravelerContainer\"]/div[1]/div/i[2]")).click();
		}
		;
		for (int i = 0; i <= 1; i++) {
			driver.findElement(By.xpath("//*[@id=\"divTravelerContainer\"]/div[2]/div/i[2]")).click();
		}
		;
		for (int i = 0; i <= 0; i++) {
			driver.findElement(By.xpath("//*[@id=\"divTravelerContainer\"]/div[3]/div/i[2]")).click();
		}
		;
		for (int i = 0; i <= 2; i++) {
			driver.findElement(By.xpath("//*[@id=\"divTravelerContainer\"]/div[4]/div/i[2]")).click();
		}
		;
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"button\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"onlineBookingForm\"]/button")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.navigate().back();

	}

}
