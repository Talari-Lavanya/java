package Arrays;

public class MinMaxArray {
    public int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        MinMaxArray obj = new MinMaxArray();
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Min: " + obj.findMin(arr));
        System.out.println("Max: " + obj.findMax(arr));
    }
}

