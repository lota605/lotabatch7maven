package testNG_Basic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Pre_Requisit {


@BeforeClass
    public void beforeRun(){
    System.out.println("Before Class Run Frist");
    }



    @AfterClass
    public void afterRun(){
        System.out.println("After Class Run Allows Last");


    }



}
