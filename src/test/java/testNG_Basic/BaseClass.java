package testNG_Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BaseClass {

    WebDriver driver;
    @Parameters("myBrowser")
    @Test

    public void launchBrowser(String myBrowser) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tm_98\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\tm_98\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
        driver = new FirefoxDriver();

       // driver.get("http://lota2023.s3-website-us-east-1.amazonaws.com");  //it will wait till the page gets loded

        //we did here cross browser testing

        if (myBrowser.equals("chrome")) {
            driver = new ChromeDriver();
        } else if (myBrowser.equals("firefox")) {
            driver = new FirefoxDriver();
        } else {
            System.out.println("Please Check your driver");
        }

    }
}