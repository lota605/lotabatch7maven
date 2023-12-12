package javaPackages. opperator;

public class ArithmaticOperators {

   //java = is call assinging

    public void arithmatic(){
        int a = 15;
        int b =30;
        int c =a+b;
        int d = c;
        int e =d;
        System.out.println("15+30= "+ e);  //+ is called concatenation
        int f =b-a;
        System.out.println("30-15= "+ f);
        int g=a*b;
        System.out.println("15*30= "+ g);
        int h =b/a;
        System.out.println("30/15= " + h);



    }

    public static void newArithmatic(int a, int b){
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);

    }
    public static void addData(int l, int m){

        System.out.println(l+m);
        System.out.println(l-m);
        System.out.println(l*m);
        System.out.println(l/m);
    }
    public void myMethod(String lota){  //this non-static method
        System.out.println(lota +" is my name");

    }


    public static void main(String[] args) {
        ArithmaticOperators obj= new ArithmaticOperators();  //created obj of the class
        obj.arithmatic();

        newArithmatic(20,10);  //argument
        System.out.println("print some thing");
        newArithmatic(10,5);
        System.out.println("print different thing");
        newArithmatic(11,11);
        System.out.println("Both are same number");
        newArithmatic(100,50);
        System.out.println("----------------");

        addData(100,50);
        System.out.println("print frisr data");
        addData(500,100);
        System.out.println("print 2nd data");
        addData(300,100);
        System.out.println("print 3rd data");
        addData(600,100);
        System.out.println("print 4th data");

       obj. myMethod("Lota");
        obj.myMethod("Xyra");
        obj.myMethod("Taseen");
       obj. myMethod("Tahrwat");



    }





}
