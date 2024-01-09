package com.upright.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MacysSignIn {

    WebDriver driver;

    @Test   //@Test annotation

    public void signin() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tm_98\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.macys.com/account/createaccount?cm_sp=my_account-_-sign_in-_-create_account");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        //click sign in icon
        WebElement sign_in =driver.findElement(By.xpath("/html/body"));
        sign_in.click();
        Thread.sleep(2000);

        //Inserting FristName
        WebElement name = driver.findElement(By.id("ca-profile-firstname"));
        name.sendKeys("Lota");
        Thread.sleep(2000);

        //Inserting LastName
        WebElement last_name = driver.findElement(By.name("ca-profile-lastname"));
        last_name.sendKeys("Mahmud");
        Thread.sleep(1000);

        //Inserting email
        WebElement email = driver.findElement(By.id("ca-profile-email"));
        email.sendKeys("lota.us606@gmail.com");
        Thread.sleep(1000);

        //Inserting password
        WebElement password= driver.findElement(By.name("password"));
        password.sendKeys("Lm123456");
        Thread.sleep(1000);

         //select month
        WebElement month =driver.findElement(By.id("ca-profile-birth-month"));
        Select dropdown1 = new Select(month);
        dropdown1.selectByVisibleText("January");
        Thread.sleep(1000);

        //select dayte
        WebElement day = driver.findElement(By.name("ca-profile-birth-day"));
        Select dropdown2 = new Select(day);
        dropdown2.selectByIndex(6);
        Thread.sleep(1000);

       //click send emile
        WebElement send_email =driver.findElement(By.id("ca-profile-send-email"));
        send_email.click();
        Thread.sleep(2000);

        //click create account
        WebElement account =driver.findElement(By.id("ca-profile-submit"));
        account.click();

        driver.quit();


        //driver.quit();
    }
}