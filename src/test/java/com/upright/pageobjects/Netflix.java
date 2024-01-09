package com.upright.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

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

        WebElement signIn = driver.findElement(By.id("signIn"));
        signIn.click();

        WebElement email = driver.findElement(By.id("id_userLoginId"));
        email.sendKeys("lotamahmud989@gmail.com");

        WebElement password = driver.findElement(By.id("id_password"));
        password.sendKeys("Lm123456");

        WebElement click_sign = driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[1]/form/button"));
        click_sign.click();


    }
}