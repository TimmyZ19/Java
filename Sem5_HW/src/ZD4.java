/*
На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.
*/


public class ZD4 {
    public static void Board(int[] arr) {

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (arr[j] == i) {
                    System.out.printf("%3s", "Q|");
                } else {
                    System.out.printf("%3s", "_|");
                }
            }
            System.out.println();
        }
    }

    static int[] chessboard = {0, 0, 0, 0, 0, 0, 0, 0};
    static int index = 0;
    static int version = 1;

    public static void main(String[] args) {

        while (chessboard[0] < 8) {
            if (checking()) {
                if (index == 7) {
                    System.out.println("Вариант " + version++);
                    Board(chessboard);
                    System.out.println();
                    chessboard[index]++;
                } else {
                    index++;
                }
            } else {
                chessboard[index]++;
            }
        }
    }

    static boolean checking() {
        int i;
        if (index == 0) {
            return true;
        }
        if (chessboard[index] > 7) {
            chessboard[index] = 0;
            index--;
            return false;
        }
        for (i = 0; i < index; i++) {
            if ((chessboard[index] == chessboard[i]) | ((Math.abs(chessboard[index] -
                    chessboard[i])) == (index - i))) {
                return false;
            }
        }
        return true;
    }
}