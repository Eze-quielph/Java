public class Planta {
    private String name;
    private int tallo;
    private Boolean tieneHojas;
    private String climaIdeal;

    public Planta() {
    }

    public Planta(String name, int tallo, Boolean tieneHojas, String climaIdeal) {
        this.name = name;
        this.tallo = tallo;
        this.tieneHojas = tieneHojas;
        this.climaIdeal = climaIdeal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTallo() {
        return tallo;
    }

    public void setTallo(int tallo) {
        this.tallo = tallo;
    }

    public Boolean getTieneHojas() {
        return tieneHojas;
    }

    public void setTieneHojas(Boolean tieneHojas) {
        this.tieneHojas = tieneHojas;
    }

    public String getClimaIdeal() {
        return climaIdeal;
    }

    public void setClimaIdeal(String climaIdeal) {
        this.climaIdeal = climaIdeal;
    }
}
