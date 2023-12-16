package javaPackages.methodReturnDemo;

public class MetgodReturnDemo {


//this method not return anything.bcz void not return anything just print inside the code.
    public void location(){
        System.out.println("Hello");
    }

    //this method must return String. bez we declare String in method.
    public String location1(){
        String location= "Boston";
        return location;
    }


    //this method return int value and must be return int.
    public int Zipcode(){
        int myZip=1234;
        return myZip;
    }

    public static void main(String[] args) {
        MetgodReturnDemo obj =new  MetgodReturnDemo();
        obj.location();
         System.out.println(obj.location1());
       // System.out.println(obj.Zipcode());
        int myZipfromClass = obj.Zipcode();
        System.out.println(myZipfromClass);

       /* int a=12;
        int b=a;
        int c=a;
        System.out.println(a);
*/



    }
}
