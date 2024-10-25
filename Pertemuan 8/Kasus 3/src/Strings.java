import java.util.Scanner;

public class Strings {
    public static void main (String[] args) {
        String[] stringList;
        int size;

        Scanner scan = new Scanner(System.in);

        System.out.print("\nHow many strings do you want to sort? ");
        size = scan.nextInt();
        scan.nextLine();
        stringList = new String[size];
        System.out.println("\nEnter the strings...");
        for (int i = 0; i < size; i++) {
            stringList[i] = scan.nextLine();
        }
        scan.close();

        Sorting.selectionSort(stringList);

        System.out.printf("\nSorted list:\n");
        for (int i = 0; i < size; i++) {
            System.out.println(stringList[i]);
        }
    }
}
