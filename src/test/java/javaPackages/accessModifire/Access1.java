package javaPackages.accessModifire;

public class Access1 {

    public int houre=24;    //public is acceessbile througout the project

    private int minutes=60;  //is accessbile only its own class

    String day="Tuesday";    //no access/default modifier is accessible within hte package

    protected int year=365;  //it can be used in other package but needs inheritance.


    public void printHours(){
        System.out.println("This is a public method");
    }


    private void printMinutes(){
        System.out.println("This is private method");
    }

    void printDay(){
        System.out.println("This is package private access modifiers");
    }

    protected void printYear(){
        System.out.println("This is a protected method");
    }



    public static void main(String[] args) {
        Access1 obj =new  Access1();
        System.out.println(obj.houre);
        System.out.println(obj.day);
        System.out.println(obj.minutes);
        System.out.println(obj.year);

    }
}
