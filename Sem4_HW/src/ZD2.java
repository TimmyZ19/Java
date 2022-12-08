/*
Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя.
 */

import java.util.LinkedList;
import java.util.Scanner;

public class ZD2 {
    public static LinkedList<Integer> fillLinkedList() {
        LinkedList<Integer> ii = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            ii.add((int) (Math.random()*100));
        }
        System.out.println(ii);
        return ii;
    }

    public static void enqueue(LinkedList<Integer> ii, int element) {
        ii.addLast(element);
    }

    public static int dequeue(LinkedList<Integer> ii) {
        return ii.removeFirst();
    }

    public static int first(LinkedList<Integer> ii) {
        return ii.peekFirst();
    }

    public static void queue(LinkedList<Integer> ii) {
        try (Scanner scanner = new Scanner(System.in)) {
            choice: while (true) {
            System.out.print("Введите:\n1 - для добавления числа\n2 - для вывода и удаления первого элемента\n" +
                    "3 - для вывода первого элемента\nq - для заверщения программы\n");
            String input = scanner.nextLine();
            switch (input) {
                case ("1"):
                    System.out.println("Введите число: ");
                    input = scanner.nextLine();
                    int choice = Integer.parseInt(input);
                    enqueue(ii, choice);
                    System.out.println("Список: " + ii);
                    break;
                case ("2"):
                    System.out.printf("Элемент %d удален\n", dequeue(ii));
                    System.out.println("Список: " + ii);
                    break;
                case ("3"):
                    int firstElement = first(ii);
                    System.out.printf("Первый элемент списка: %d\n", firstElement);
                    System.out.println("Список: " + ii);
                    break;

                case ("q"):
                    break choice;
            }
            }
        }
        catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> ii = fillLinkedList();
        queue(ii);
    }
}
