import java.util.ArrayList;
import java.util.List;


public class List_exemple {

    public class ExempleListe {
        public static void main(String[] args) {
            // Création d'une liste d'entiers
            List<Integer> liste = new ArrayList<>();

            // Ajout d'éléments à la liste
            liste.add(10);
            liste.add(20);
            liste.add(30);

            // Accès aux éléments par indice
            int premierElement = liste.get(0); // premierElement vaut 10
            int deuxiemeElement = liste.get(1); // deuxiemeElement vaut 20

            // Parcours de la liste
            for (int nombre : liste) {
                System.out.println(nombre);
            }
        }
    }


}
