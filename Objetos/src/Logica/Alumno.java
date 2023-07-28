package Logica;

public class Alumno {

    //Attributes
    int id;
    String name;
    String last_name;

    //Constructure void
    public Alumno() {

    }

    //Construture of property
    public Alumno(int id, String name, String last_name) {
        this.id = id;
        this.name = name;
        this.last_name = last_name;
    }

    //Getters Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    //Methods
    public void getName(String name){
        System.out.println("Soy el alumno: "+name);
    }
    public void getNotes(double number){
        if(number >= 7 ){
            System.out.println("Aprobe la materia");
        }else{
            System.out.println("No aprobe la materia");
        }
    }
}
