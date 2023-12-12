package javaPackages.parameterization;

public class ParameterDemo {

    //parameterization is part of the method signature

    public void eat(String food){    //This is method ( paramiter)

        System.out.println(food);
    }


    public static void main(String[] args) {
        ParameterDemo lota=new ParameterDemo();  //obj of the class
        lota.eat("rice");   //argument

        ParameterDemo taseen=new ParameterDemo();   //obj of the class
        taseen.eat("pancake");  //argument



        ParameterDemo tahrwat=new ParameterDemo();   //obj of the class
        tahrwat.eat("banana");  //argument



        ParameterDemo xyra=new ParameterDemo();   //obj of the class
        xyra.eat("rost");  //argument

    }





}
