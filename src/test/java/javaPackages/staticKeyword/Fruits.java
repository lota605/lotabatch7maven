package javaPackages.staticKeyword;

public class Fruits {

    //instance/global variable or we can say property

    String name;                     //declaring the variable
    String color;                  //declaring the variable
    static String size="Small";     //static variable and methods belongs to class, not object
    char vitamin;                   //declaring the variable

    // we create static when we see the value of variables are common to all objects.
    /*
    Variable has three parts:
    1.Declare the variable
    2.Initialize the variable
    3.Use the variable
     */

    /* Every class differents differents property,object hold those property.


    Class-Fruits, objects--Banana, Apple, Avogado, Grape, Orange
    here Fruits properti is name,color, size, vitamin

    Class-Vegetables, objects--Tomatoo, Cucumber, Potato, Carrots
    vagetable property is name, colore, size, vitamin, nutrition

    Class-Cats, object--myCat, yourCat, Lota'sCat,
    Cats property is size, color, tail, eyes

    Class-UprightStudents,  object--Shorna,Majed,Kedy,Dharti
    UprightStudents property is name, ID, group,batch
    */
//one method can be called from other method

    public static void hello(){
        String location="USA"; //local variable , declare an initialize
        System.out.println(location);  //use the variable



    }
    public void price(int amount){    //inside () is called  paramiter
        System.out.println(amount);
        hello();
    }

    public static void main(String[] args) {  //this is main method
        Fruits banana = new Fruits();     //created an object of the class. means i instantiated class
        banana.name = "Banana";         //banana is a refrence variable or obj
        banana.color = "Yellow";        //initializing/defining the variable
        size = "Small";
        banana.vitamin = 'A';           //initializing/defining the variable

        System.out.println(banana.name);  //using the variable for print
        System.out.println(banana.color);
        System.out.println(banana.vitamin);
        System.out.println(size);
        System.out.println("..............");

        hello();  //calling the method ,here not need obj  bcz this is static method
        banana.price(10);  //this is regular method calling method need obj

        Fruits apple = new Fruits();   //created an object of the class. means i instantiated class
        apple.name="Apple";         //initializing/defining the variable
        apple.color="Red";          //initializing/defining the variable
        size="Small";
        apple.vitamin='D';         //initializing/defining the variable

        System.out.println(apple.name);   //using the variable for print
        System.out.println(apple.color);
        System.out.println(apple.vitamin);
        System.out.println(size);
        System.out.println(".............");

        hello();  //calling method
        apple.price(12);  //this is regular method calling method need obj


        Fruits mango= new Fruits();   //created an object of the class. means i instantiated class
        mango.name="mango";     //initializing/defining the variable
        mango.color="green";     //initializing/defining the variable
       // mango.size="small";
        mango.vitamin='B';      //initializing/defining the variable



        System.out.println(mango.name);   //using the variable for print
        System.out.println(mango.color);
        System.out.println(mango.vitamin);
        System.out.println(size);
        System.out.println("................");

        hello();  ////static method calling
        mango.price(6);  //this is regular method, calling method need obj, this is not static

        Fruits orange= new Fruits();     //created an object of the class. means i instantiated class
        orange.name="orange";      //initializing/defining the variable
        orange.color="orange";     //initializing/defining the variable
        // orange.size="small";
        orange.vitamin='C';       //initializing/defining the variable

        System.out.println(orange.name);   //using the variable for print
        System.out.println(orange.color);
        System.out.println(orange.vitamin);
        System.out.println(size);

          //static method calling
        orange.price(5);  //this is regular method calling not stastc
    }
}