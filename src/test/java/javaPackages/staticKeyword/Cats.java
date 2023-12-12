package javaPackages.staticKeyword;

public class Cats {
   // declard vaeiable here
    String color;
    int size;
    String tail;
    byte eyes;

    //Class-Cats, object--myCat, yourCat, Lota'sCat,

    public static void main(String[] args) {
        Cats obj= new Cats();
         obj.color="white";
         obj.size=3;
         obj.tail="long";
         obj.eyes=2;

        System.out.println(obj.color);
        System.out.println(obj.size);
        System.out.println(obj.tail);
        System.out.println(obj.eyes);

        Cats mycats = new Cats();
        mycats.color="blck";
        mycats.size=1;
        mycats.tail="small";
        mycats.eyes=2;

        System.out.println(mycats.color);
        System.out.println(mycats.size);
        System.out.println(mycats.tail);
        System.out.println(mycats.eyes);

        Cats yourcats = new Cats();
        yourcats.color="gray";
        yourcats.size=5;
        yourcats.tail="tall";
        yourcats.eyes=2;

        System.out.println(yourcats.color);
        System.out.println(yourcats.size);
        System.out.println(yourcats.tail);
        System.out.println(yourcats.eyes);



    }


}











