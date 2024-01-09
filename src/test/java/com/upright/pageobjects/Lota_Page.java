package com.upright.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Lota_Page {

    WebDriver driver;

@Test
    public void browser() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\tm_98\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://lotamahmud.com.s3-website-us-east-1.amazonaws.com");   //this is application

    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

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
        //selecting travaling
        driver.findElement(By.xpath("/html/body/doctype/u1/form/label[2]/input")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/doctype/u1/form/p[2]/label[2]/input")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/doctype/u1/form/p[3]/a")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/doctype/u1/form/p[4]/a")).click();

/*There are two types of Exception
    i.Implicity wait:it will wait a certain period(seconds) before throwing an exception during runtime and
    application to all over the script whereever the class is extended
    ii.Explicity wait:it will wait a certain period(seconds) before throwing an exception during runtime and is
    applicable to only a certain element.
     */

        //driver.close();
        driver.quit();
    }
    //xpath two typs:1.Absolute xpath:it start from root from the html
    //2.Relative xpath

}
