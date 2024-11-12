package Arrays;

public class EvenOddCount {
    public void countEvenOdd(int[] arr) {
        int evenCount = 0, oddCount = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Even count: " + evenCount);
        System.out.println("Odd count: " + oddCount);
    }

    public static void main(String[] args) {
        EvenOddCount obj = new EvenOddCount();
        int[] arr = {10, 15, 20, 25, 30};
        obj.countEvenOdd(arr);
    }
}

