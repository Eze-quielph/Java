package Logica;

public class squirture extends Pokemon implements IAgua{

    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy squirture este es mi ataque placaje");
    }

    @Override
    protected void araniazo() {
        System.out.println("Soy squirture este es mi ataque araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Soy squirture este es mi ataque mordisco");
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Soy squirture este es mi ataque hidrobomba");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Soy squirture este es mi ataque burbuja");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Soy squirture este es mi ataque pistola de agua");
    }
}
