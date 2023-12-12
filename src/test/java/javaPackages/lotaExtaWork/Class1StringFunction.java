package javaPackages.lotaExtaWork;

public class Class1StringFunction {

    public static void stringwithOBJ(){

        String obj = new String("This is my Extra Work");

        String OneWord = obj.substring(17,21);
        System.out.println(OneWord);

       boolean thisWord =  obj.contains("Extra");
        System.out.println(thisWord);

        boolean thisWord2 =  obj.contains("extra");
        System.out.println(thisWord2);

       String changei = obj.replace('i','e');
       System.out.println(changei);

      int number = obj.length();
        System.out.println(number);

        String lowercase = obj.toLowerCase();
        System.out.println(lowercase);


    }
    //here we String to int convert .
    public static void stringToint(){
        String money = "500";   //declar as a String 500, then convert it is int.
      int convert =Integer.valueOf(money);   //Integer.valueof() this is syntex, and ind datatype convert
      System.out.println(convert +200);      //use  variable.After Run come 500+200=700

    }
    //string datatype we do reverse here with for loop.
    public static void reverseString(){
        String batch= "Batch7";   //we work with index here,5 is index number
        char newLetter = batch.charAt(5);   //newLetter is another veriable
        for(int i= 5; i>=0; i--){
            System.out.println(batch.charAt(i));
        }
        
    }
    //Another way reverse this
    public static void reverseString2(){
        String home= "Lynn";
        String reverse ="";

        for(int i=home.length()-1; i>=0; i--){
          reverse = reverse+ home.charAt(i);  //String=char=String

        }
        System.out.println(reverse);

    }

    public static void intToString(){
        int number=100;
        String newNumber = String.valueOf(number);  //newNumber is String and 500 is int so come together100500
        System.out.println(newNumber +500);
    }

    public static void palindrome(){
        String name="madam";
        String reverse= "";
        for(int i=name.length()-1; i>=0; i--){
            reverse=reverse +name.charAt(i);
        }
        System.out.println(reverse);

        if(reverse.equals(name)){
            System.out.println("This is palindrome");
        }
        else{
            System.out.println("This is not palindrome");
        }
    }

    public static void StringBuffer(){
        StringBuffer sb =new StringBuffer("I know her ");
        sb.append("Lota Mahmud");   //append meand add something
        System.out.println(sb);

        sb.insert(10,"Name is "); //10 came from I knoe her index number.here index is 9 but use 10
        System.out.println(sb);            //bcz 1 use foe spech, so that why 10.



    }


    public static void main(String[] args) {
       // stringwithOBJ();
       // stringToint();
       // reverseString();
       // intToString();
       // reverseString2();
       // palindrome();
        //StringBuffer();
    }
}
