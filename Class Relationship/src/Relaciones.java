import java.util.ArrayList;
import java.util.List;

public class Relaciones {
     public static void main(String[] args){
         Auto aut = new Auto();

         aut.setId(1L);//La L mayuscula es porque el tipo de dato es un long
         aut.setMarca("Renault");
         aut.setModelo("Duster");

         List<Propietario> listProp = new ArrayList<Propietario>();

         Propietario listProp1 = new Propietario();
         Propietario listProp2 = new Propietario();

         listProp1.setId(2L);//La L mayuscula es porque el tipo de dato es un long
         listProp2.setId(25L);

     }
}
