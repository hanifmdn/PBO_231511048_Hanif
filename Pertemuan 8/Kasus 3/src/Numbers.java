import java.util.Scanner;
public class Numbers {
    public static void main (String[] args) {
        Integer[] intList;
        int size;

        Scanner scan = new Scanner(System.in);

        System.out.print("\nHow many integers do you want to sort? ");
        size = scan.nextInt();
        intList = new Integer[size];
        System.out.println("\nEnter the numbers...");
        for (int i = 0; i < size; i++) {
            intList[i] = scan.nextInt();
        }
        Sorting.insertionSort(intList);

        System.out.printf("\nSorted list:\n");
        for (int i = 0; i < size; i++) {
            System.out.println(intList[i]);
        }

        scan.close();
    }
}