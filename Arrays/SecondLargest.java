package Arrays;

public class SecondLargest {
    public int findSecondLargest(int[] arr) {
        int max = arr[0];
        int secondMax = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        SecondLargest obj = new SecondLargest();
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Second Largest: " + obj.findSecondLargest(arr));
    }
}

