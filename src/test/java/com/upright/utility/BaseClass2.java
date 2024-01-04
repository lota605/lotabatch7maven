package com.upright.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass2 {

    WebDriver driver;

    public void myMethod() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\tm_98\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://www.ebay.com");
        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(3000);
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();


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
