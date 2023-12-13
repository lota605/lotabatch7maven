package javaPackages.constructorDemo;

public class ConstructorPractice {

    String name;
    int id;
    int batch;

    String location;


public ConstructorPractice(String name,int id, int batch){

    this.name=name;
    this.id=id;
   this.batch=batch;

}

    public ConstructorPractice(String location){
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
