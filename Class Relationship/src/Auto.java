import java.util.List;

public class Auto {

    private long id;
    private String marca;
    private String modelo;

    //Para asociar uso un objeto del tipo de la clase que le quiero asociar
  /*  private Propietario prop; // 1 a 1 unidireccional */

    //relacion 1 a N uso una coleccion de objetos propietarios
    private List<Propietario> prop;
    public Auto() {
    }


    public Auto(long id, String marca, String modelo, List<Propietario> prop) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.prop = prop;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public List<Propietario> getProp() {
        return prop;
    }

    public void setProp(List<Propietario> prop) {
        this.prop = prop;
    }
}
