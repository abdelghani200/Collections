import java.util.PriorityQueue;

public class ExemplePriorityQueue {
    public static void main(String[] args) {
        // Création d'une PriorityQueue d'entiers (triée par ordre croissant par défaut)
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        // Ajout d'éléments à la PriorityQueue
        queue.add(30);
        queue.add(10);
        queue.add(20);

        // Retrait des éléments de la PriorityQueue
        int premierElement = queue.poll(); // Retire et renvoie l'élément de plus haute priorité (10)
        int deuxiemeElement = queue.poll(); // Retire et renvoie le deuxième élément de plus haute priorité (20)

        System.out.println(premierElement);  // Affiche 10
        System.out.println(deuxiemeElement); // Affiche 20
    }
}
