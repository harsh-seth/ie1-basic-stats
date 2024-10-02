import java.util.stream.IntStream;

public class MinMaxCalculation {
    public static void main(String[] args) {
        System.err.println("Hello World, from Team 48!");

        int[] newArr = new int[]{1,2,3,4,5,6,7,8,9};
        int[] ans = findMinMax(newArr);
        System.out.println("Min value: " + ans[0] + "\nMax value: " + ans[1]);
    }

    public static int[] findMinMax(int[] nums) {
        
        int min_num = IntStream.of(nums).min().getAsInt();;

        return new int[]{min_num, Integer.MAX_VALUE};
    }
}
