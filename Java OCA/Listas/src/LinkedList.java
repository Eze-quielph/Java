import java.util.List;

public class LinkedList {
    public static void main(String[] args){
        //Start List
        List<Persona> list = new java.util.LinkedList<Persona>();

        list.add(new Persona(1, "ezequiel", 19));
        list.add(new Persona(2, "ezequ", 16));
        list.add(new Persona(3, "eze", 25));
        list.add(new Persona(4, "ezequie", 13));

        //Add first
        list.add(0, new Persona(6, "Prueba", 98));



        //Recorrer por indice usando ForEach
        for(Persona perso:list){
            System.out.println("Prueba: "+ perso.getName());
        }

    }
}
