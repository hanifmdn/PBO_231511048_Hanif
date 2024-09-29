package com.polban.jtk.exercise3;

public class ManagerTest{
    public static void main (String[] args){
        Employee[] staffEmployee = new Employee[2];
        staffEmployee[0] = new Employee("Antonio Rossi", 2500000, 1, 10, 1989);
        staffEmployee[1] = new Employee("Isabel Vidal", 2000000, 1, 11, 1993);

        Manager[] staff = new Manager[4];
        staff[0] = new Manager("Maria Bianchi", 2500000, 1, 12, 1991);
        staff[1] = new Manager("Udin Mark", 8000000, 4, 4, 1995);
        staff[2] = new Manager("John Son", 7000000, 11, 2, 1992);
        staff[3] = new Manager("Ujang Lewis", 4000000, 12, 6, 1998);

        System.out.println("\nEmployee:");
        for (int i = 0; i < 2; i++)
            staffEmployee[i].raiseSalary(5);
        for (int i = 0; i < 2; i++)
            staffEmployee[i].print();

        System.out.println("\nManager:");
        int i;
        for (i = 0; i < 4; i++)
            staff[i].raiseSalary(5);
        for (i = 0; i < 4; i++)
            staff[i].print();

        System.out.println("\nShell Sort:\n");
        Sortable.shell_sort(staff);
        for (Manager manager : staff) {
            manager.print();
        }
    }
}