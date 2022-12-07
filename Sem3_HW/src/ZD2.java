import java.util.ArrayList;

public class ZD2 {
    public static ArrayList<Integer> RemoveEven(ArrayList<Integer> nums) {
        for (int i = nums.size() - 1; i >= 0; i--) {
            if (nums.get(i) % 2 == 0) {
                nums.remove(i);
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>() {
            {
                add(-5);
                add(-4);
                add(5);
                add(1);
                add(-8);
                add(18);
            }
        };
        System.out.println("Исходные данные: \n" + nums);
        System.out.println("Удалены четные числа: \n" + RemoveEven(nums));
    }
}
