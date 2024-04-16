package com.tcs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ProjectA {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.wpjobboard.net/wp-admin/profile.php");
		Thread.sleep(2000);
		
		WebElement jobBoard = driver.findElement(By.xpath("//div[text()='Job Board']"));
		
		Actions action = new Actions(driver);
		action.moveToElement(jobBoard).perform();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[text()='Applications ']")).click();
		Thread.sleep(1000);
		
		String text = driver.findElement(By.xpath("//a[text()='Web Editor']")).getText();
		Thread.sleep(1000);
		
		System.out.println(text);
		Thread.sleep(1000);
		
		
		String text1 = driver.findElement(By.xpath("//a[text()='Web Editor']//parent::td//preceding-sibling::td[@data-colname=\"E-mail\"]")).getText();
		Thread.sleep(1000);
		
		System.out.println(text1);
		Thread.sleep(1000);
		
		List<WebElement> elements = driver.findElements(By.xpath("//a[text()='Web Editor']//parent::td//preceding::td[@data-colname=\"E-mail\"]"));
		Thread.sleep(1000);
		
		for (int i = 0; i <elements.size(); i++) {
			String text2 = elements.get(i).getText();
			System.out.println(text2);
			
		}		
		
	}
	
}