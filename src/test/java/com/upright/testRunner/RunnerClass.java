package com.upright.testRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"C:\\Users\\tm_98\\IdeaProjects\\LotaBatch7Maven\\src\\test\\java\\com\\upright\\features\\profile.feature"},glue={"com.upright.stepDef"},
        //plugin = {"pretty", "com.aventstack.extentreporst.cucumber.adapter.ExtentCucumberAdapter:"},
        plugin ={"pretty", "html:target/cucumber-reports/Cucumber.html"},
         publish = true)


/*
Cucumber option is an annotation..it takes two parametets one is feature location
another is stepDef location.if we have lots of feature file in a package..give path only upto
package level like src/test/java/com.upright/features
 */




public class RunnerClass {




}
