import java.util.Arrays;

public class index{
    public static void main(String[] args) {
        int[] nums = {6, 6, 3, 5, 7, 10, 20, 12, 234, 24, 11, 1, 2};

        System.out.println("Original Array: " + Arrays.toString(nums));

        bubbleSort(nums);

        System.out.println("Sorted Array: " + Arrays.toString(nums));

        for (int i : nums) {
            System.out.print(i);
        }
    }

    public static void bubbleSort(int nums[]) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }
}