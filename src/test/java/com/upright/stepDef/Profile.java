package com.upright.stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Profile {

 WebDriver driver;
  String myTitle;
  String myURl;
    @Given("The profile link is loaded in the browser")
    public void the_profile_link_is_loaded_in_the_browser() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\tm_98\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://lotamahmud.com");   //this is application

    }


    @When("user take capture the title")
    public void user_take_capture_the_title() {
       myTitle = driver.getTitle();        //capture the title come from application



    }
    @Then("the title should be something meaningful")
    public void the_title_should_be_something_meaningful() {
 // if (myTitle.equalsIgnoreCase("lota's profile")){    //here lota's profile give the PO
   //   System.out.println("The title is as per A/C");
 // }
  //else {
  //    System.out.println("The title is not as per A/C");
 // }
       // Two way we can validation : i.If else statement ii.assert.assertEquals

        Assert.assertEquals(myTitle,"lota Profile");   //assert we can also validation

    }

    @When("User  captur the url")
    public void user_captur_the_url() {

         myURl = driver.getCurrentUrl();
         System.out.println("the Url capture bt selenium is " + myURl);



    }
    @Then("the url should be with http and the name")
    public void the_url_should_be_with_http_and_the_name() {

        Assert.assertEquals(myURl,"http://lotamahmud.com");



    }










}
