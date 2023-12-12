package javaPackages.exceptionsDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionsPractice {
    /*
    There are two type exceptions
    1.Compile Time Exception
    a.InterruptedException
    b.FileNotFound Exception


    2.Run Time Exceptions
    a.ArrayIndexoutofBound Exception
    b.StringIndexoutofBound Exception
    c.numberFormat Exception
     */

    public void comileTimeException() throws InterruptedException, FileNotFoundException {

        System.out.println(3+3);
        Thread.sleep(5000);
        System.out.println(4*4);
        Thread.sleep(3000);
        System.out.println(12-6);
        Thread.sleep(4000);

        FileInputStream fs = new FileInputStream("src/test/java/info.properties");
       // int number = fs.available();
        //System.out.println(number);
    }

    public void runtimeException(){
        String []name ={"Arafat","Emu","lota"};
        System.out.println(name[4]);

        String location ="pennsylvania";     //.StringIndexoutofBound Exception
        char lastLeeter = location.charAt(15);
        int locationNumber = Integer.valueOf(location);    //numberFormat Exception
        System.out.println(locationNumber);
    }


    public static void main(String[] args) throws InterruptedException, FileNotFoundException {

        ExceptionsPractice obj =new ExceptionsPractice();
        obj.comileTimeException();
       // obj.runtimeException();


    }



}
