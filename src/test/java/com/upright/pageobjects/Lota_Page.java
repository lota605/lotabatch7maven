package com.upright.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class Lota_Page {

    WebDriver driver;
    WebElement travaling;

@Test
    public void browser() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\tm_98\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://lotamahmud.com.s3-website-us-east-1.amazonaws.com");   //this is application

    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

  //Varify "My Frist profile" text is there in the page or not
    SoftAssert obj =new SoftAssert();
    WebElement profile =driver.findElement(By.xpath("//h1[text() = 'My Frist Profile']"));
    try{
        boolean profileTexisdisplayedorNot= profile.isDisplayed();
        if(profileTexisdisplayedorNot==true){
            String myProfileTex = profile.getText(); //get the text from application
            obj.assertEquals(myProfileTex,"My Frist profile");

        }
    }
    catch (Exception e){
        System.out.println(e);
    }




   // Assert.assertEquals(myProfileTex,"My Frist Profile");   //frist one come from application and 2nd one expected
                                                                     //if both same then console did not give anything.
        WebElement jira = driver.findElement(By.xpath("//input[@id='Project Management and Bug tracking Tool']"));
        jira.sendKeys("JIRA");
        Thread.sleep(2000);

        WebElement conflunce = driver.findElement(By.xpath("//input[@id='documentation tool']"));
        conflunce.sendKeys("CONFLUENCE");
        Thread.sleep(2000);

       WebElement java = driver.findElement(By.xpath("//input[@id='Object Oriented Programming Language']"));
        java.sendKeys("JAVA");
        Thread.sleep(2000);

      WebElement selenium =  driver.findElement(By.xpath("//input[@id='Automation Testing Tool']"));
      selenium.sendKeys("SELENIUM");
        Thread.sleep(2000);

       WebElement postman = driver.findElement(By.xpath("//input[@id='API Testing Tool']"));
       postman.sendKeys("POSTMAN");
        Thread.sleep(2000);

        WebElement sql = driver.findElement(By.xpath("//input[@id='Backend Tool']"));
        sql.sendKeys("SQL");
        Thread.sleep(2000);

        WebElement appium = driver.findElement(By.xpath("//input[@id='Mobile Automation Testing Tool']"));
        appium.sendKeys("APPIUM");
        Thread.sleep(2000);
        //we use try catch block for hendle exception.
      try {
          //selecting travaling
           travaling = driver.findElement(By.xpath("//input[@id='travelling']"));

      }
      //we can write catch(NoSuchElementException e)If we write this way in console not coming short line.
      catch (Exception e){
          System.out.println(e);

      }
      //finally is allwose run
      finally {
          System.out.println("Finally");
      }
    boolean travalingSelectedOrNot = travaling.isSelected();
    System.out.println(travalingSelectedOrNot);
    if (travalingSelectedOrNot == false) {

    }
    travaling.click();

        WebElement women = driver.findElement(By.xpath("//label[@for='female']"));
        women.click();
        Thread.sleep(2000);

        WebElement facebook = driver.findElement(By.xpath("//a[@href='https://www.facebook.com/lota.mahmud.5/']"));
         facebook.click();
        Thread.sleep(3000);

       WebElement link = driver.findElement(By.xpath("//a[@href='https://linkedin.com/in/lota-mahmud-704857290']"));
       link.click();

         obj.assertAll();
        //driver.close();
       // driver.quit();
    }

/*There are two types of Exception
    i.Implicity wait:it will wait a certain period(seconds) before throwing an exception during runtime and
    application to all over the script whereever the class is extended
    ii.Explicity wait:it will wait a certain period(seconds) before throwing an exception during runtime and is
    applicable to only a certain element.

    //xpath two typs:1.Absolute xpath:it stat from root from the html
    //2.Relative xpath: It stat from // and use syntex :// tagname[@ attribute="value"]
*/
}
