package Logica;

public class POO {
    public static void main(String[] args){
        Alumno alu1 = new Alumno();
        Alumno alu2 = new Alumno(1, "ezequiel", "benitez");

        System.out.println("La id del alumno 2 es: " + alu2.getId());
        alu2.setName("brian");
        System.out.println("El name de alumno 2 es: " + alu2.getName());
    }
}
