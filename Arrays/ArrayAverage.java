package Arrays;

public class ArrayAverage {
    public double calculateAverage(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (double) sum / arr.length;
    }

    public static void main(String[] args) {
        ArrayAverage obj = new ArrayAverage();
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Average: " + obj.calculateAverage(arr));
    }
}
