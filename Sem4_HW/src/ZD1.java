// 1.Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

import java.util.LinkedList;

public class ZD1 {
    public static LinkedList<Integer> fillLinkedList() {
        LinkedList<Integer> ii = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            ii.add((int) (Math.random() * 100));
        }
        System.out.println(ii);
        return ii;
    }
    public static void reverceLinkedList(LinkedList<Integer> ii) {
        LinkedList<Integer> revercell = new LinkedList<>();
        for (int i = ii.size() - 1; i >= 0 ; i--) {
            revercell.add(ii.get(i));
        }
        System.out.println(revercell);
    }

    public static void main(String[] args) {
        reverceLinkedList(fillLinkedList());
    }
}
