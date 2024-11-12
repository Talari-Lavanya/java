package Arrays;

public class MissingNumber {
    public int findMissingNumber(int[] arr, int n) {
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        
        for (int num : arr) {
            actualSum += num;
        }
        
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        MissingNumber obj = new MissingNumber();
        int[] arr = new int[99];
        int missingNumber = 57; 

        
        for (int i = 0, j = 1; i < 99; j++) {
            if (j != missingNumber) {
                arr[i++] = j;
            }
        }

        System.out.println("Missing number: " + obj.findMissingNumber(arr, 100));
    }
}
