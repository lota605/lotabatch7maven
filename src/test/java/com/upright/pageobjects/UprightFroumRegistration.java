package com.upright.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class UprightFroumRegistration {

    WebDriver driver;

    @Test (priority = 1)  //@Test annotation
    public void browser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tm_98\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://uprightforum.tech/registration/");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        WebElement registrion =driver.findElement(By.xpath("//a[@class='nav-link active']"));
      String REGISTRATION  =registrion.getText();

        SoftAssert obj1 = new SoftAssert();
        obj1.assertEquals(REGISTRATION, "REGISTRATION");
        // Inserting UserName
        WebElement username = driver.findElement(By.xpath("//input[@name='your-username']"));
        username.sendKeys("lotamahmud");
        Thread.sleep(1000);

        // Inserting FirstName
        WebElement name = driver.findElement(By.xpath("//input[@name='your-first-name']"));
        name.sendKeys("LOTA");
        Thread.sleep(1000);

        // Inserting LastName
        WebElement lastname = driver.findElement(By.xpath("//input[@name='your-last-name']"));
        lastname.sendKeys("MAHMUD");
        Thread.sleep(1000);

        // Inserting emile
        WebElement emile = driver.findElement(By.xpath("//input[@name='your-email']"));
        emile.sendKeys("lotamahmud989@gmail.com");
        Thread.sleep(1000);

        // Inserting password
        WebElement password = driver.findElement(By.xpath("//input[@name='your-password']"));
        password.sendKeys("Lm7812673858@");
        Thread.sleep(1000);

        // Inserting confirme password
        WebElement con_password = driver.findElement(By.xpath("//input[@name='your-confirm-password']"));
        con_password.sendKeys("Lm7812673858@");
        Thread.sleep(1000);

        //Select type of role
        WebElement element = driver.findElement(By.xpath("//select[@name='your-role']"));
        Select dropdown = new Select(element);
      //  dropdown.selectByIndex(0);
        Thread.sleep(1000);
       //"//*[@id=\"select2-your-country-container\"
       //select country
        WebElement element2 = driver.findElement(By.xpath("//select[@id='your-country']"));
        Select dropdown2 = new Select(element2);
        dropdown2.selectByVisibleText("United States");
        Thread.sleep(1000);

        //Click register button
        WebElement register = driver.findElement(By.xpath("//button[@type='submit']"));
        register.click();

        obj1.assertAll();

    }
    //click on Button and get a alert box
   // How did you handle alert?
    //Ans: I have to switch to alert,then I use different methods like gettext,accept,dismiss,sendkeys.

        @Test(priority =2, dependsOnMethods = "browser")
        public void handlingAlert() throws InterruptedException {

            //We use this because of validate the test.Po give the massage and what which one come from application
            //both are same or not.
            Thread.sleep(3000);
            String alertText = driver.switchTo().alert().getText();
            System.out.println(alertText);
            Assert.assertEquals(alertText, "Username is already exist");
            driver.switchTo().alert().accept();    //it will click ok or yes
            // driver.switchTo().alert().dismiss();    //it will click no not now or ignore
            // driver.switchTo().alert().sendKeys("hello");



            // we can validate other way if else statement

           /* if(alertText.equalsIgnoreCase("Username is alrady exist"));{
                System.out.println("Attempting to create a duplicate account");
            }
           */
            //driver.close();

        }

        // driver.close();   //driver.close will close the current window/tab even though it open another window.
        //also it won't clear the background  process.
      // driver.quit();  //It will close all the tabs/window opened by the selenium
        //that means it will close the session.also it will cleare the background process.


    /*There are two types of Exception
    i.Implicity wait:it will wait a certain period(seconds) before throwing an exception during runtime and
    application to all over the script whereever the class is extended
    ii.Explicity wait:it will wait a certain period(seconds) before throwing an exception during runtime and is
    applicable to only a certain element.
     */

}

