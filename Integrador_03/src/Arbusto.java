public class Arbusto extends Planta{
    private int AnchoArbusto;
    private Boolean esDomestico;
    private String VariedadDeArbusto;
    private String colorDeHojas;
    private Boolean sePodaONo;

    public Arbusto() {
    }

    public Arbusto(String name, int tallo, Boolean tieneHojas, String climaIdeal) {
        super(name, tallo, tieneHojas, climaIdeal);
    }

    public Arbusto(float anchoArbusto, Boolean esDomestico, String variedadDeArbusto, String colorDeHojas, Boolean sePodaONo) {
        AnchoArbusto = (int) anchoArbusto;
        this.esDomestico = esDomestico;
        VariedadDeArbusto = variedadDeArbusto;
        this.colorDeHojas = colorDeHojas;
        this.sePodaONo = sePodaONo;
    }

    public Arbusto(String name, int tallo, Boolean tieneHojas, String climaIdeal, float anchoArbusto, Boolean esDomestico, String variedadDeArbusto, String colorDeHojas, Boolean sePodaONo) {
        super(name, tallo, tieneHojas, climaIdeal);

        this.esDomestico = esDomestico;
        VariedadDeArbusto = variedadDeArbusto;
        this.colorDeHojas = colorDeHojas;
        this.sePodaONo = sePodaONo;
    }

    public String getSaludo(){
        System.out.println("Hola soy un arbusto");
        return null;
    }

    public float getAnchoArbusto() {
        return AnchoArbusto;
    }

    public void setAnchoArbusto(float anchoArbusto) {
        AnchoArbusto = (int) anchoArbusto;
    }

    public Boolean getEsDomestico() {
        return esDomestico;
    }

    public void setEsDomestico(Boolean esDomestico) {
        this.esDomestico = esDomestico;
    }

    public String getVariedadDeArbusto() {
        return VariedadDeArbusto;
    }

    public void setVariedadDeArbusto(String variedadDeArbusto) {
        VariedadDeArbusto = variedadDeArbusto;
    }

    public String getColorDeHojas() {
        return colorDeHojas;
    }

    public void setColorDeHojas(String colorDeHojas) {
        this.colorDeHojas = colorDeHojas;
    }

    public Boolean getSePodaONo() {
        return sePodaONo;
    }

    public void setSePodaONo(Boolean sePodaONo) {
        this.sePodaONo = sePodaONo;
    }
}
