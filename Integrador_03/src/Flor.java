public class Flor extends Planta{
    private String colorPetalos;
    private int CantidadPromedio;
    private String colorPistillos;
    private String variedadDePlanta;
    private String estacion;

    public Flor() {
    }

    public Flor(String name, int tallo, Boolean tieneHojas, String climaIdeal) {
        super(name, tallo, tieneHojas, climaIdeal);
    }

    public Flor(String colorPetalos, int cantidadPromedio, String colorPistillos, String variedadDePlanta, String estacion) {
        this.colorPetalos = colorPetalos;
        CantidadPromedio = cantidadPromedio;
        this.colorPistillos = colorPistillos;
        this.variedadDePlanta = variedadDePlanta;
        this.estacion = estacion;
    }

    public Flor(String name, int tallo, Boolean tieneHojas, String climaIdeal, String colorPetalos, int cantidadPromedio, String colorPistillos, String variedadDePlanta, String estacion) {
        super(name, tallo, tieneHojas, climaIdeal);
        this.colorPetalos = colorPetalos;
        CantidadPromedio = cantidadPromedio;
        this.colorPistillos = colorPistillos;
        this.variedadDePlanta = variedadDePlanta;
        this.estacion = estacion;
    }

    public String getSaludo(){
        System.out.println("Hola soy una Flor");
        return null;
    }

    public String getColorPetalos() {
        return colorPetalos;
    }

    public void setColorPetalos(String colorPetalos) {
        this.colorPetalos = colorPetalos;
    }

    public int getCantidadPromedio() {
        return CantidadPromedio;
    }

    public void setCantidadPromedio(int cantidadPromedio) {
        CantidadPromedio = cantidadPromedio;
    }

    public String getColorPistillos() {
        return colorPistillos;
    }

    public void setColorPistillos(String colorPistillos) {
        this.colorPistillos = colorPistillos;
    }

    public String getVariedadDePlanta() {
        return variedadDePlanta;
    }

    public void setVariedadDePlanta(String variedadDePlanta) {
        this.variedadDePlanta = variedadDePlanta;
    }

    public String getEstacion() {
        return estacion;
    }

    public void setEstacion(String estacion) {
        this.estacion = estacion;
    }
}
