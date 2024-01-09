package com.upright.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class UprightFroumRegistration {

    WebDriver driver;

    @Test   //@Test annotation
    public void openRegistration() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\tm_98\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://uprightforum.tech/registration/");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);

       // Inserting UserName
       WebElement username = driver.findElement(By.name("your-username"));
       username.sendKeys("lotamahmud");
        Thread.sleep(1000);

        // Inserting FirstName
        WebElement name = driver.findElement(By.name("your-first-name"));
        name.sendKeys("LOTA");
        Thread.sleep(1000);

        // Inserting LastName
        WebElement lastname = driver.findElement(By.name("your-last-name"));
        lastname.sendKeys("MAHMUD");
        Thread.sleep(1000);

        // Inserting emile
        WebElement emile = driver.findElement(By.name("your-email"));
        emile.sendKeys("lotamahmud989@gmail.com");
        Thread.sleep(1000);

        // Inserting password
       WebElement password = driver.findElement(By.name("your-password"));
       password.sendKeys("Lm7812673858@");
        Thread.sleep(1000);

        // Inserting confirme password
       WebElement con_password= driver.findElement(By.name("your-confirm-password"));
       con_password.sendKeys("Lm7812673858@");
        Thread.sleep(1000);

        WebElement element = driver.findElement(By.name("your-role"));
        Select dropdown = new Select(element);
        dropdown.selectByIndex(1);
        Thread.sleep(3000);

        WebElement element2 = driver.findElement(By.id("your-country"));
         Select dropdown2 =new Select(element2);
         dropdown2.selectByVisibleText("United States");
         Thread.sleep(2000);

         WebElement regester=driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/div/form/div[9]/button"));
         regester.click();
        Thread.sleep(2000);

        driver.close();

        // driver.close();   //driver.close will close the current window/tab even though it open another window.
        //also it won't clear the background  process.
      // driver.quit();  //It will close all the tabs/window opened by the selenium
        //that means it will close the session.also it will cleare the background process.




    }


    /*There are two types of Exception
    i.Implicity wait:it will wait a certain period(seconds) before throwing an exception during runtime and
    application to all over the script whereever the class is extended
    ii.Explicity wait:it will wait a certain period(seconds) before throwing an exception during runtime and is
    applicable to only a certain element.
     */
}
