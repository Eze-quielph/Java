public class exception {
   public static void main(String[] args){

      try{
          int resultado = 3/1;
          if(resultado == 0){
              throw new Error("No se puede dividir por 0");
          }
      }
      catch (Exception e){
          System.out.println("No se puede dividir por 0");
      }

   }
}
