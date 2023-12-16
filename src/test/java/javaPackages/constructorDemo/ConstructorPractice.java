package javaPackages.constructorDemo;

public class ConstructorPractice {

    String name;
    int id;
    int batch;

    String location;
/*
what is constrattor? details of constractor?
Ans: constractor is a special type of method whose name is same name as class name.
note:
The main purpose of constructor is to initiallze the object.
construction is not return  anything.

 */

public ConstructorPractice(String name,int id, int batch){

    this.name=name;    //assinge my local to global variable.
    this.id=id;
   this.batch=batch;

}

    public ConstructorPractice(String location)  {

    this.location=location;
    }




    public static void main(String[] args) {
        ConstructorPractice obj =new ConstructorPractice("lota",101,1);
        //obj.name="lotamahmud";
       // obj.id=101;
        //obj.batch=1;

        System.out.println(obj.name);
        System.out.println(obj.id);
        System.out.println(obj.batch);

        System.out.println(".............");

        ConstructorPractice obj1 =new ConstructorPractice("taseen",102,2);
       // obj1.name="taseen";
       // obj1.id=102;
       // obj1.batch=2;

        System.out.println(obj1.name);
        System.out.println(obj1.id);
        System.out.println(obj1.batch);


        System.out.println(".............");


        ConstructorPractice obj2 =new ConstructorPractice("tahrwat",103,3);
       // obj2.name="tahrwat";
       // obj2.id=103;
       // obj2.batch=3;


        System.out.println(obj2.name);
        System.out.println(obj2.id);
        System.out.println(obj2.batch);


        ConstructorPractice obj4 =new ConstructorPractice("Boston");
        System.out.println(obj4.location);


    }




}
