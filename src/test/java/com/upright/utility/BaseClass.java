package com.upright.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseClass {
//Webdriver is Interface IT has no body.
    WebDriver driver;
     String myBrowser;
    // method
    // Initialize the browser
    // different browser has its own driver...chromedriver, firefoxdriver,(gecko driver)
    // iedriver, operadriver, safaridriver, edgedriver
    //launc means start open Inisitetd
    //we use one driver at a time .we learn how to use both driver


    public void loadproperties() throws IOException {     //we conect extarnal file here
//Two type compile  type exceptioni:i.FileInputeStream ii.Thread.seelp
        FileInputStream obj = new FileInputStream("C:\\Users\\tm_98\\IdeaProjects\\LotaBatch7Maven\\src\\test\\java\\info.properties");
        Properties obj2 = new Properties();
        obj2.load(obj);
        myBrowser = obj2.getProperty("browser");
       System.out.println(myBrowser);

    }






    public void launchBrowser() throws InterruptedException {
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\tm_98\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        //driver = new ChromeDriver();

        System.setProperty("webdriver.gecko.driver","C:\\Users\\tm_98\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
        driver=new FirefoxDriver();

        driver.get("http://lota2023.s3-website-us-east-1.amazonaws.com ");  //it will wait till the page gets loded
       //we did here cros browser testing

        if(myBrowser.equals("chrome")){
            driver = new ChromeDriver();
        }
        else if(myBrowser.equals("firefox")){
            driver = new FirefoxDriver();
        }
        else{
            System.out.println("Please Check your driver");
        }

        driver.navigate().to("https://uprightforum.tech"); //It is not wait till the driver gets loded+
        driver.navigate().to("https://netflix.com");
        Thread.sleep(4000);
        driver.navigate().back();
        driver.navigate().forward();
       driver.navigate().refresh();

        //QA:what are the different between driver.get va navigate?
        //How to ckeck current url

        String myCurrentURL = driver.getCurrentUrl();
        System.out.println(myCurrentURL);

        //how to get title
        String myTitale = driver.getTitle();
        System.out.println(myTitale);


       // driver.manage().window().maximize();   //this maximize the window
    }

    public static void main(String[] args) throws InterruptedException, IOException {
        BaseClass obj = new BaseClass();

        obj.loadproperties();
        obj.launchBrowser();
    }
}