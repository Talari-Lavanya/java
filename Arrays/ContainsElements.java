package Arrays;

public class ContainsElements {
    public boolean containsBoth(int[] arr, int val1, int val2) {
        boolean foundVal1 = false, foundVal2 = false;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val1) foundVal1 = true;
            if (arr[i] == val2) foundVal2 = true;
        }
        
        return foundVal1 && foundVal2;
    }

    public static void main(String[] args) {
        ContainsElements obj = new ContainsElements();
        int[] arr = {10, 12, 23, 30, 40};
        System.out.println("Contains 12 and 23: " + obj.containsBoth(arr, 12, 23));
    }
}

