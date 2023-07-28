package Logica;

public class picachu extends Pokemon implements  Ielectrico{

    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy picachu este es mi ataque placaje");
    }

    @Override
    protected void araniazo() {
        System.out.println("Soy picachu este es mi ataque araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Soy picachu este es mi ataque Mordisco");
    }

    @Override
    public void atacarImpacTrueno() {
        System.out.println("Soy picachu este es mi ataque Impacto Trueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Soy picachu este es mi ataque Punio Trueno");
    }
}
