import  java.util.List;

public class ArrayList {
    public static void main(String[] args){
            //Start List
        List<Persona> list = new java.util.ArrayList<Persona>();
        list.add(new Persona(1, "ezequiel", 19));
        list.add(new Persona(2, "ezequ", 16));
        list.add(new Persona(3, "eze", 25));
        list.add(new Persona(4, "ezequie", 13));

        //Recorrer por indice
        for(int i = 0; i < list.size(); i++){
            System.out.println("Prueba: " + list.get(i).getName());
        }

        //Delete of position
        list.remove(1);

        //Recorrer por indice usando ForEach
        for(Persona perso:list){
            System.out.println("Prueba: "+ perso.getName());
        }

    }
}
