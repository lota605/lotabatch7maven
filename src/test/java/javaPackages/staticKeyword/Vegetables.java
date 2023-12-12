package javaPackages.staticKeyword;

public class Vegetables {

    //diclare variable, they are global variable
    String name;
    String colore;
    String size;
   static char vitamin='A';
   // Class-Vegetables, objects--Tomatoo, Cucumber, Potato, Carrots

    public static void eat(){
        String  lota ="rice"; //local variable , declare an initialize
        System.out.println(lota);  //use the variable
    }
    public void price(int amount){
        System.out.println(amount);
    }


    public static void main(String[] args) {

        Vegetables cucumber=new Vegetables ();   //create object

        cucumber.name="Cucumber";
        cucumber.colore="Green";
        cucumber.size="Long";
        //cucumber.vitamin='A';
        cucumber.price(12);
        eat();

        System.out.println(cucumber.name);
        System.out.println(cucumber.colore);
        System.out.println(vitamin);
        System.out.println(cucumber.size);

        Vegetables tomato=new Vegetables ();
        tomato.name="tomato";
        tomato.colore="red";
        tomato.size="round";
       // tomato.vitamin='A';
        eat();
        tomato.price(11);

        System.out.println(tomato.name);
        System.out.println(tomato.colore);
        System.out.println(vitamin);
        System.out.println(tomato.size);

        Vegetables potato=new Vegetables ();
        potato.name="potato";
        potato.colore="white";
        potato.size="round";
       // potato.vitamin='A';
        eat();
        potato.price(8);

        System.out.println(potato.name);
        System.out.println(potato.colore);
        System.out.println(vitamin);
        System.out.println(potato.size);


        Vegetables carrot=new Vegetables ();
        carrot.name="carrot";
        carrot.colore="orange";
        carrot.size="long";
       // carrot.vitamin='A';
        eat();
        carrot.price(5);

        System.out.println(carrot.name);
        System.out.println(carrot.colore);
        System.out.println(vitamin);
        System.out.println(carrot.size);



    }
}
