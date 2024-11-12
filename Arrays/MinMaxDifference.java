package Arrays;

public class MinMaxDifference {
    public int differenceMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max - min;
    }

    public static void main(String[] args) {
        MinMaxDifference obj = new MinMaxDifference();
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Difference: " + obj.differenceMinMax(arr));
    }
}

