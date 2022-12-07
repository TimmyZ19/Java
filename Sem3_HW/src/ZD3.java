import java.util.ArrayList;

public class ZD3 {
    public static int Min(ArrayList<Integer> nums) {
        int min = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (min > nums.get(i)) {
                min = nums.get(i);
            }
        }
        return min;
    }
    public static int Max(ArrayList<Integer> nums) {
        int max = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (max < nums.get(i)) {
                max = nums.get(i);
            }
        }
        return max;
    }

    public static float Average(ArrayList<Integer> nums) {
        float x = 0;
        for (int i = 0; i < nums.size(); i++) {
            x += nums.get(i);
        }
        return x / nums.size();
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = (new ArrayList<Integer>() {
            {
                add(-5);
                add(-4);
                add(5);
                add(1);
                add(-8);
                add(18);
            }
        });
        System.out.println(nums);
        System.out.println("Минимальное значение: " +Min(nums));
        System.out.println("Максимальное значение: " +Max(nums));
        System.out.println("Среднееарифметическое значение: " +Average(nums));
    }
}
