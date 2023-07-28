package herencia;

public class Consultor extends Persona {
    String name_consultora;
    int num_consultor;

    // Constructor
    public Consultor(int id, String dni, String nombre, String apellido, String domicilio, String telefono, String name_consultora, int num_consultor) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.name_consultora = name_consultora;
        this.num_consultor = num_consultor;
    }

    public Consultor(int id, String dni, String nombre, String apellido, String domicilio, String telefono) {
        super(id, dni, nombre, apellido, domicilio, telefono);
    }

    //Getter and Setter
    public String getName_consultora() {
        return name_consultora;
    }

    public void setName_consultora(String name_consultora) {
        this.name_consultora = name_consultora;
    }

    public int getNum_consultor() {
        return num_consultor;
    }

    public void setNum_consultor(int num_consultor) {
        this.num_consultor = num_consultor;
    }
}

