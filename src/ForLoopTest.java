import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ForLoopTest {

    public static void main(String[] args) {
//        List<Integer> arrayList = new LinkedList<>();
//        for (int i = 0; i < 100000; i++) {
//            arrayList.add(i);
//        }
//
//        long arrayListStartTime = System.currentTimeMillis();
//        for (int i = 0; i < arrayList.size(); i++) {
//            arrayList.get(i);
//        }
//
//        long arrayListCost = System.currentTimeMillis() - arrayListStartTime;
//        System.out.println("ArrayList for loop traversal cost: " + arrayListCost);
//
//        long arrayListForeachStartTime = System.currentTimeMillis();
//        for (Integer integer : arrayList) {
//
//        }
//
//        long arrayListForeachCost = System.currentTimeMillis() - arrayListForeachStartTime;
//
//
//        System.out.println("ArrayList foreach traversal cost: " + arrayListForeachCost);


        final int MAX_VAL = 10000;
        List<Integer> linkedList = new LinkedList<Integer>();
        List<Integer> arrayList = new ArrayList<Integer>();
        for(int i = 0; i < MAX_VAL; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }
        long time = System.nanoTime();
        for(int i = 0; i < MAX_VAL/2; i++) {
            linkedList.remove(MAX_VAL/2);
        }
        System.out.println("LL time: " + (System.nanoTime() - time));
        time = System.nanoTime();
        for(int i = 0; i < MAX_VAL/2; i++) {
            arrayList.remove(MAX_VAL/2);
        }
        System.out.println("AL time: " + (System.nanoTime() - time));


        time = System.nanoTime();
        for(int i = 0; i < MAX_VAL; i++) {
            linkedList.add(MAX_VAL/2, i);
        }
        System.out.println("AL time: " + (System.nanoTime() - time));
    }
}