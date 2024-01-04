package com.upright.stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Profile {

 WebDriver driver;
  String myTitle;
    @Given("The profile link is loaded in the browser")
    public void the_profile_link_is_loaded_in_the_browser() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\tm_98\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://sadiahera.click");

    }


    @When("user take capture the title")
    public void user_take_capture_the_title() {
       myTitle = driver.getTitle();



    }
    @Then("the title should be something meaningful")
    public void the_title_should_be_something_meaningful() {
  if (myTitle.equalsIgnoreCase("lota's profile")){
      System.out.println("The title is meaningful");
  }
  else {
      System.out.println("The title is not meaninful");
  }



    }



}
