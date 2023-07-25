import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
/*
        int number = 10;
        double flot = 1.20;
        String text = "Hello";
        char letra = 'a';
        boolean trueAndFalse = true;
*/

        //exercise numbers
        int numberOne = 6;
        int numberTwo = 7;
        int aux = numberTwo;

        numberTwo = numberOne;
        numberOne = aux;

        if (numberOne > numberTwo) {
            System.out.println(numberOne);
        } else {
            System.out.println(numberTwo);
        }
/*    switch (numberOne){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
            case 10:
                System.out.println("ten");
                break;
            default:
                System.out.println("default");
                break;
    }

    */

        //Exercise Two
        double sueldo = 0;
        int categoria;

        Scanner teclado = new Scanner( System.in);

        System.out.println("Ingrese su categoria");
        categoria = teclado.nextInt();

        if(categoria == 1){
            sueldo = 15890 + (15890*0.10);
        }
        else if(categoria == 2){
            sueldo = 25630.89;
        }
        else if (categoria ==3){
            sueldo = 35560.20 - (35560.20 *0.11);
        }else{
            System.out.println("Ingrese una categoria valida");
        }
       if (categoria == 1 || categoria ==2 || categoria == 3){
           System.out.println("Su sueldo es: " + sueldo);
       }

       int count = 0;
       while(count < 10){
           count++;
           System.out.println(count);
       }
       
       for (int i=0; i<=10; i++){
           System.out.println(i);
       }

       //Declaracion de vertor
        int vector [];
       //Declaracion con vector de X posiciones
        int vectorTwo [] = new int[5];

        //Asignacion de valor manual
        vectorTwo[0]=2;
        vectorTwo[4]=4;

        // Asignacion por teclado
        Scanner tecladoTwo = new Scanner (System.in);

        //recorrido
        for (int i =0; i <= vectorTwo.length; i++){
            vectorTwo[i] = tecladoTwo.nextInt();
            System.out.println(vectorTwo[i]);
        }

        //        Matrices      //

        //Declaracion:
        //Tres columnas * Tres filas
        int matriz [][] = new int [3][3];

        //Asignacion manual
        matriz[0][2] =5; //Fila 0 Columna 2 = 5

        //recorrido
        for(int i = 0; i<= matriz.length; i++){
            for(int j = 0; j<= matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
