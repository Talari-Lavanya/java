package Arrays;

public class ReverseArray {
    public int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - i - 1];
        }
        return reversed;
    }

    public static void main(String[] args) {
        ReverseArray obj = new ReverseArray();
        int[] arr = {10, 20, 30, 40, 50};
        int[] result = obj.reverseArray(arr);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}

