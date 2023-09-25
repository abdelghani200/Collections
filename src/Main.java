import java.lang.reflect.Type;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int tab[] = new int[2];
        /*
        List arrayList = new ArrayList();

        arrayList.add(12);
        arrayList.add("ana");
        arrayList.add(true);

        for (Object element : arrayList){
            System.out.println(element);
        }
        */




        List<Integer > aList = new ArrayList ();
        List<Integer> list = new LinkedList();
        long avantA, aprèsA, avantL, aprèsL;
        avantA = System. currentTimeMillis();
        for (int i=0; i<100000;i++)
            aList.add (0,1);
        aprèsA= System. currentTimeMillis();
        System.out.println("Le temps passé est "+(aprèsA-avantA));
        avantL = System.currentTimeMillis();
        for (int i=0;i<100000;i++)
            list.add (0,1);
        aprèsL = System.currentTimeMillis();
        System.out.println ("Le temps passé est "+(aprèsL-avantL));


    }
}