package javaPackages.finalKeyword;

public class FinalDemo2 extends FinalDemo {


//create by Dharti

    @Override    //annotation,  this is  comante
    public void myName(){
        System.out.println("Lota is my name");
        String anotherName ="Fayza";
        String anotherName2 ="Sadiea";
        System.out.println(anotherName+ " + " +anotherName2);
        System.out.println("Dharti");
    }
    /*
    if override method that time run  override one bcz it alrady update
    if method is final it can not override.
    What is the meaning of final keyword?
    Ans:Final Kew word can be use Three places in the class,in the method in the variable.
    if it in the class we can not extande class,if in the method nobody can not override,
    if it in the variable we can not change variable.
     */

    public static void main(String[] args) {

        FinalDemo2 obj =new FinalDemo2();
        obj.myName();
    }





}
