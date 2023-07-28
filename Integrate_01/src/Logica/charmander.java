package Logica;

public class charmander extends Pokemon implements IFuego{

    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy charmander este es mi ataque placaje");
    }

    @Override
    protected void araniazo() {
        System.out.println("Soy charmander este es mi ataque araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Soy charmander este es mi ataque mordisco");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Soy charmander este es mi ataque Punio de fuego");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Soy charmander este es mi ataque lanzallama");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Soy charmander este es mi ataque Ascuas");
    }
}
