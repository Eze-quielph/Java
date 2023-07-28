package Logica;

public class Bulbasor extends Pokemon implements IPlanta{



    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy bulbasor este es mi ataque placaje");
    }

    @Override
    protected void araniazo() {
        System.out.println("Soy bulbasor este es mi ataque araniaso");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Soy bulbasor este es mi ataque mordisco");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Soy bulbasor este es mi ataque Drenaje");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Soy bulbasor este es mi ataque Paralizar");
    }
}
