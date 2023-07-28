import java.util.*;

public abstract class Person {
    //class of Structure code

    //Atributte
    public String name;

    //Num Ramdon
    Random random = new Random();

    //Library static class Math


    //Methods
    public String getName(){
        return name;
    }
}

class Animal {
    //Funtion of run, compilate main, return void and accept String of arguments
    public  static void  main(String... args){
        //Run function example
        example("Ezequiel", "Benitez");
    }

    private static void example(String... args){
        //Args[0] run use in 1 args || example: Va`lues: EzequielBenitez
        System.out.println("Values: " + args[0] + args[1]);
    }
}
