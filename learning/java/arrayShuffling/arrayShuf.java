import java.util.Arrays;

public class arrayShuf {
    public static void main(String[] args) {

        int[] info = {1, 2, 3, 4, 5};

        System.out.println("Original array: " + Arrays.toString(info));

        shuffle(info);

        System.out.println("Shuffled array: " + Arrays.toString(info));

    }

    public static void shuffle(int[] info) {
        for (int i = info.length - 1; i > 0; i--) {
            int j = (int) (Math.random() * (i + 1));

            int temp = info[i];
            info[i] = info[j];
            info[j] = temp;
        }
    }
}
