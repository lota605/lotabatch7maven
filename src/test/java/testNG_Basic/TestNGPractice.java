package testNG_Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGPractice extends Pre_Requisit{
    WebDriver driver;
    //run class level when mulltipel mudioule are connected is call intigration test.
    /*
    What are the execution order of testNG annotation?
    befofe class
    befor method
    Test
    after method
    after class
     */
    @BeforeMethod
    public void bm(){
        System.out.println(("Before Method"));
    }

    @Test
    public  void test1(){       //run here is unit test, indevidual modual when run is unit test.
        System.out.println("Test1");
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tm_98\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.get("https://netflix.com");
//         System.out.println(driver.getTitle());
    }

    @Test(priority = 1)
    public  void test2() {
        System.out.println("Test2");
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tm_98\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.get("https://macys.com");
//        System.out.println(driver.getCurrentUrl());

    }




    @Test(priority = 2)
    public  void test3(){
        System.out.println("Test3");

    }

    @AfterMethod
    public void am(){
        System.out.println("After Method");
    }
}
