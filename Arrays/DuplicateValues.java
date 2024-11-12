package Arrays;

public class DuplicateValues {
    public void findDuplicates(int[] arr) {
        System.out.print("Duplicates: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        DuplicateValues obj = new DuplicateValues();
        int[] arr = {10, 20, 30, 20, 40, 10};
        obj.findDuplicates(arr);
    }
}
