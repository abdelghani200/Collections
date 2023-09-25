import java.util.ArrayDeque;
import java.util.Deque;

public class ExempleDeque {
    public static void main(String[] args) {
        // Création d'une Deque d'entiers
        Deque<Integer> deque = new ArrayDeque<>();

        // Ajout d'éléments en tête
        deque.addFirst(10);
        deque.addFirst(20);

        // Ajout d'éléments en queue
        deque.addLast(30);

        // Retrait d'éléments de la tête
        int premierElement = deque.removeFirst(); // Retire et renvoie 20

        // Retrait d'éléments de la queue
        int dernierElement = deque.removeLast();   // Retire et renvoie 30

        System.out.println(premierElement);  // Affiche 20
        System.out.println(dernierElement);  // Affiche 30
    }
}
