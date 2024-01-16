package com.upright.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class Netflix {

    WebDriver driver;

    @Test   //@Test annotation

    public void netflix() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tm_98\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://netflix.com");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

      //  SoftAssert obj =new SoftAssert();

        WebElement signIn = driver.findElement(By.id("signIn"));
        signIn.click();
        Thread.sleep(2000);

        WebElement email = driver.findElement(By.xpath("//input[@name='userLoginId']"));
        email.sendKeys("lota.us606@gmail.com");
        Thread.sleep(2000);

        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("Lm123456");
        Thread.sleep(2000);

        WebElement click_sign = driver.findElement(By.xpath("//button[@type='submit']"));
        click_sign.click();
      //  obj.assertAll();


    }
}