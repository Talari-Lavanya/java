package Arrays;

public class ArraySum {
    public int sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        ArraySum obj = new ArraySum();
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Sum: " + obj.sumArray(arr));
    }
}
