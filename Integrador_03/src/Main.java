public class Main {
    public static void main(String[] args){
        Arbol arbolito = new Arbol("Planta", "Gande", "Rojo", "Grandes");
        Flor florcita = new Flor("Planta", 3, "Rojo", "Grandes", "Verano");
        Arbusto Arbustito = new Arbusto(22, true, "Rojo", "Grandes", true);

        arbolito.getSaludo();
        florcita.getSaludo();
        Arbustito.getSaludo();

    }
}
