package javaPackages.stringFunction;

public class StringFunctionDemo {

    public void stringFuncition() {

        String obj = new String("Lota");

        char firstLetter = obj.charAt(0);    //charAt start with index ,we want to print L here.
        System.out.println(firstLetter);

        int length = obj.length();
        System.out.println(length);

        String lower = obj.toLowerCase();
        System.out.println(lower);

        String upper = obj.toUpperCase();
        System.out.println(upper);

        String newSpling = obj.replace("o", "a");
        System.out.println(newSpling);

        String addfullName = obj.concat(" Mahmud");
        System.out.println(addfullName);

        String[] twonames = addfullName.split(" ");
        System.out.println(twonames[0]);
        System.out.println(twonames[1]);   //here i have problem


    }

    public static void stringFuncition2() {
        String firstString = ("   We are learning java as part of the Automation Course   ");
       String allUpper = firstString.toUpperCase();  //calling the method java created
        System.out.println(allUpper);

       String allLower = firstString.toLowerCase();
        System.out.println(allLower);

        int length = firstString.length();
        System.out.println(length);

       char firstLetter = firstString.charAt(0);
       System.out.println(firstLetter);

       String oneWord = firstString.substring(3,6);    //substring start with 0 and ends with add index+1
        System.out.println(oneWord);

       boolean javaWord = firstString.contains("java");
        System.out.println(javaWord);

        boolean word = firstString.contains("Selinuam");
        System.out.println(word);

        String[]words = firstString.split(" ");
        System.out.println(words.length);

       String trim = firstString.trim();  //trim like remove spech.
        System.out.println(trim);
    }

    public void reverseString(){
        String name= "lota";   //atol  reverse interview can ask
        char lastLetter = name.charAt(3);

        for(int i = name.length()-1; i>=0; i--){
            System.out.println(name.charAt(i));
        }
    }
    //Another way of reverse
    public void reverseString2(){
        String name = "Taseen";
        String reverse = "";
        for(int i =name.length()-1; i>=0; i--){
            reverse = reverse + name.charAt(i);  //char+String=String

        }
        System.out.println(reverse);

    }
    //take any String and validate it is palindrome or not
    public void palindrome(){
        String name="kayak";  //mom,level,dad,madam,
        String reverse= "";

        for(int i =name.length()-1; i>=0; i--){
            reverse = reverse + name.charAt(i);    //char+String=String

        }
        System.out.println(reverse);

        if(reverse.equals(name)){
            System.out.println("This is palindrome");
        }
        else{
            System.out.println("This is not a plindrome");
        }
    }



    public static void stringToInt(){
       // int a=200;
        //System.out.println(a+100);
        String dollat = "200";
        int newDollar = Integer.valueOf(dollat);
           System.out.println(newDollar+100);

    }
    //what are the java exception?
    public static void stringBuffer(){
        StringBuffer sb =new StringBuffer("Hello");
        sb.append(" Batch7");
        System.out.println(sb);

        sb.insert(6,"Participant ");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

    }

    public static void intToString(){
        int a = 300;
        System.out.println(a+300);

        String newaValu = String.valueOf(a);
        System.out.println(newaValu+300);
    }


    public static void main(String[] args) {
        StringFunctionDemo obj =new StringFunctionDemo();

       //stringFuncition2();   //calling the method i created
       // obj.stringFuncition();
        //obj.reverseString();
     // obj.intToString();
        //obj.reverseString2();
        //obj.palindrome();
        //stringToInt();
       // intToString();
        stringBuffer();

    }
}