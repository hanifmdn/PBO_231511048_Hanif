package com.polban.jtk.exercise3;
import java.util.GregorianCalendar;
import java.util.Calendar;


class Manager extends Employee {
    public Manager (String n, double s, int d, int m, int y){
        super(n, s, d, m, y);
        secretaryName = "Udin";
    }

    public void raiseSalary(double byPercent){
        // add 1/2% bonus for every year of service
        GregorianCalendar todaysDate = new GregorianCalendar();
        int currentYear = todaysDate.get(Calendar.YEAR);
        double bonus = 0.5 * (currentYear - hireYear());
        super.raiseSalary(byPercent + bonus);
    }
    public String getSecretaryName(){
        return secretaryName;
    }
    @Override
    public void print(){
        System.out.println(super.getName() + " " + super.getSalary() + " " + super.hireYear() + " " + getSecretaryName());
    }
    private String secretaryName;



}