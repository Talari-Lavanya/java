package Loops;

public class EvenOddSwitch {
    public static void main(String[] args) {
        int number = 5;
        switch (number % 2) {
            case 0:
                System.out.println(number + " is EVEN");
                break;
            case 1:
                System.out.println(number + " is ODD");
                break;
        }
    }
}

