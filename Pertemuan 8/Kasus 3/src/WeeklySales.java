import java.util.Scanner;
public class WeeklySales {
    public static void main (String[] args) {
//        Salesperson[] salesStaff = new Salesperson[10];
//
//        salesStaff[0] = new Salesperson("Jane", "Jones", 3000);
//        salesStaff[1] = new Salesperson("Daffy", "Duck", 4935);
//        salesStaff[2] = new Salesperson("James", "Jones", 3000);
//        salesStaff[3] = new Salesperson("Dick", "Walter", 2800);
//        salesStaff[4] = new Salesperson("Don", "Trump", 1570);
//        salesStaff[5] = new Salesperson("Jane", "Black", 3000);
//        salesStaff[6] = new Salesperson("Harry", "Taylor", 7300);
//        salesStaff[7] = new Salesperson("Andy", "Adams", 5000);
//        salesStaff[8] = new Salesperson("Jim", "Doe", 2850);
//        salesStaff[9] = new Salesperson("Walt", "Smith", 3000);
        // input
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of salespeople: ");
        int numSalespeople = scan.nextInt();
        scan.nextLine();

        Salesperson[] salesStaff = new Salesperson[numSalespeople];

        for (int i = 0; i < numSalespeople; i++) {
            System.out.print("Enter first name of salesperson " + (i + 1) + ": ");
            String firstName = scan.nextLine();

            System.out.print("Enter last name of salesperson " + (i + 1) + ": ");
            String lastName = scan.nextLine();

            System.out.print("Enter total sales for " + firstName + " " + lastName + ": ");
            int totalSales = scan.nextInt();
            scan.nextLine();

            salesStaff[i] = new Salesperson(firstName, lastName, totalSales);
        }

        Sorting.insertionSort(salesStaff);

        System.out.println("\nRangking of Sales for the Week\n");

        for (Salesperson s : salesStaff) {
            System.out.println(s);
        }
    }
}
