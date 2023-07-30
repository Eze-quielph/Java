import java.util.ArrayList;
import java.util.*;

public class EjercicioVideojuego {

    public static void main(String[] args){
        List<Videojuegos> game= new ArrayList<Videojuegos>();

        Videojuegos video1= new Videojuegos(123, "Banjo Kazooie", "Nintendo 64", 4, "Plataforma");
        Videojuegos video2= new Videojuegos(12, "Mario Bros", "Nintendo 64", 4, "Plataforma");
        Videojuegos video3= new Videojuegos(10, "Banjo", "Nintendo 64", 4, "Plataforma");
        Videojuegos video4= new Videojuegos(13, "Kazooie", "Nintendo 64", 4, "Plataforma");
        Videojuegos video5= new Videojuegos(143, "Hero", "Nintendo 64", 4, "Plataforma");

        game.add(video1);
        game.add(video2);
        game.add(video3);
        game.add(video4);
        game.add(video5);

        for(Videojuegos video : game){
            System.out.println("Titulo:" + video.getTitulo() + " Consola: "+ video.getConsola() + " Jugadores: " + video.getCantJugadores());
        }

        video2.setTitulo("Nuevo name");
        video1.setCantJugadores(3);

        for(Videojuegos video : game){
            if(video.getConsola().equals("Nintendo 64")){
                System.out.println("Este juego es compatible con la nintendo: " + video.toString());
            }
        }

    }
}
