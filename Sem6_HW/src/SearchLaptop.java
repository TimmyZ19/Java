import java.util.*;

public class SearchLaptop {
    public static Integer enterFilter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Поиск: ");
        System.out.println(
                "1 - объем оперативной памяти\n2 - объем SSD\n3 - Операционная система\n4 - Цвет\n");
        System.out.println("Введите значение параметра поиска: ");
        return scanner.nextInt();
    }

    public static void showResult(Map<String, Laptop> result) {
        for (var laptop : result.entrySet()) {
            System.out.printf("%s\n%s\n\n", laptop.getKey(), laptop.getValue().toString());
        }
    }

    public static void main(String[] args) {
        Map<Integer, String> filter = new HashMap<>();
        Map<String, Laptop> result = new LinkedHashMap<>();
        Set<Laptop> laptops = new HashSet<>();
        Laptop laptop1 = new Laptop("2 Gb", "256 Gb", "Windows 10", "Black");
        Laptop laptop2 = new Laptop("2 Gb", "1 Tb", "Ubuntu", "White");
        Laptop laptop3 = new Laptop("4 Gb", "512 Gb", "Mac OS", "Green");
        Laptop laptop4 = new Laptop("16 Gb", "1 Tb", "Mac OS", "Gray");
        Laptop laptop5 = new Laptop("8 Gb", "1 Tb", "Windows 11", "Red");
        laptops.add(laptop1);
        laptops.add(laptop2);
        laptops.add(laptop3);
        laptops.add(laptop4);
        laptops.add(laptop5);
        Scanner scanner = new Scanner(System.in);
        filter.put(1, "ram");
        filter.put(2, "ssd");
        filter.put(3, "os");
        filter.put(4, "color");
        Integer choice = enterFilter();
        if (filter.containsKey(choice)) {
            switch (choice) {
                case 1: {
                    System.out.println("Введите объем ОЗУ: ");
                    String input = scanner.next();
                    Laptop.byRam(laptops, input, result);
                    showResult(result);
                    break;
                }
                case 2: {
                    System.out.println("Введите объем SSD: ");
                    String input = scanner.next();
                    Laptop.bySSD(laptops, input, result);
                    showResult(result);
                    break;
                }
                case 3: {
                    System.out.println("Введите название оперативной системы: ");
                    String input = scanner.next();
                    Laptop.byOs(laptops, input, result);
                    showResult(result);
                    break;
                }
                case 4: {
                    System.out.println("Введите цвет: ");
                    String input = scanner.next();
                    Laptop.byColor(laptops, input, result);
                    showResult(result);
                    break;
                }
                default:
                    break;
            }
        }
        scanner.close();
    }
}