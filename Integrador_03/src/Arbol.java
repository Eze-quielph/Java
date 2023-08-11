public class Arbol extends Planta{
    private  String variedad;
    private  String tipoDeTronco;
    private String color;
    private String TipoDeHojas;

    public Arbol(String variedad, String tipoDeTronco, String color, String tipoDeHojas) {
        this.variedad = variedad;
        this.tipoDeTronco = tipoDeTronco;
        this.color = color;
        TipoDeHojas = tipoDeHojas;
    }

    public Arbol(String name, int tallo, Boolean tieneHojas, String climaIdeal, String variedad, String tipoDeTronco, String color, String tipoDeHojas) {
        super(name, tallo, tieneHojas, climaIdeal);
        this.variedad = variedad;
        this.tipoDeTronco = tipoDeTronco;
        this.color = color;
        TipoDeHojas = tipoDeHojas;
    }

    public String getSaludo(){
        System.out.println("Hola soy un arbol");
        return null;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public String getTipoDeTronco() {
        return tipoDeTronco;
    }

    public void setTipoDeTronco(String tipoDeTronco) {
        this.tipoDeTronco = tipoDeTronco;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoDeHojas() {
        return TipoDeHojas;
    }

    public void setTipoDeHojas(String tipoDeHojas) {
        TipoDeHojas = tipoDeHojas;
    }
}
