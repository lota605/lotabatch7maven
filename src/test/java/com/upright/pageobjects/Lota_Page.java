package com.upright.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lota_Page {

    WebDriver driver;

@Test
    public void browser() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\tm_98\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://lotamahmud.com");   //this is application

        driver.findElement(By.id("Project Management and Bug tracking Tool")).sendKeys("JIRA");
        Thread.sleep(2000);
        driver.findElement(By.id("documentation tool")).sendKeys("CONFLUENCE");
        Thread.sleep(2000);
        driver.findElement(By.name("Java")).sendKeys("JAVA");
        Thread.sleep(2000);
        driver.findElement(By.name("Selenium")).sendKeys("SELENIUM");
        Thread.sleep(2000);
        driver.findElement(By.id("API Testing Tool")).sendKeys("POSTMAN");
        Thread.sleep(2000);
        driver.findElement(By.name("SQL")).sendKeys("SQL");
        Thread.sleep(2000);
        driver.findElement(By.id("Mobile Automation Testing Tool")).sendKeys("APPIUM");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/doctype/u1/form/label[2]/input")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("female")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/doctype/u1/form/p[3]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/doctype/u1/form/p[4]/a")).click();
    }
    //xpath two typs:1.Absolute xpath:

}
