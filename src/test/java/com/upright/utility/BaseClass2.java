package com.upright.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass2 {



    // driver.close();   //driver.close will close the current window/tab even though it open another window.
    //also it won't clear the background  process.
    // driver.quit();  //It will close all the tabs/window opened by the selenium
    //that means it will close the session.also it will clear the background process.


    /*There are two types of Exception
    i.Implicity wait:it will wait a certain period(seconds) before throwing an exception during runtime and
    application to all over the script whatever the class is extended
    ii.Explicity wait:it will wait a certain period(seconds) before throwing an exception during runtime and is
    applicable to only a certain element.
     */

    WebDriver driver;

    public void myMethod() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\tm_98\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://lotamahmud.com.s3-website-us-east-1.amazonaws.com");
       // driver.navigate().to("https://www.amazon.com");
        Thread.sleep(3000);
       // driver.navigate().back();
       // driver.navigate().forward();
       // driver.navigate().refresh();


        String myCurrentURL = driver.getCurrentUrl();
        System.out.println(myCurrentURL);

        //how to get title
        String myTitale = driver.getTitle();
        System.out.println(myTitale);

    }

    public static void main(String[] args) throws InterruptedException {
        BaseClass2 obj = new BaseClass2();
        obj.myMethod();
    }










}
