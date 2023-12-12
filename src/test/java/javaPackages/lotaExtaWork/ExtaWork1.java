package javaPackages.lotaExtaWork;

public class ExtaWork1 {

    public void assignmentOperator(){
        int a;
        a=10;  //simple assignment operator
        System.out.println(a);
        //compound operator(2 operator can be used together(ex:<=)
      
    }

    public static void main(String[] args) {
        ExtaWork1 obj =new ExtaWork1();
        obj.assignmentOperator();
        int a=5;
        int b;
      //  System.out.println(++a);
       // System.out.println(a++);
       // System.out.println(a++ +4);
      //  System.out.println(a); //output=8
        //a=8
       b= ++a +8 + a++;
      // System.out.println(b);

    }

}
