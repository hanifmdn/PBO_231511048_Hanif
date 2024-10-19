public class Commission extends Hourly {
    private Double totalSales;
    private Double commisionRate;

    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, Double commisionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commisionRate = commisionRate;
        this.totalSales = 0.0;
    }

    public void addSales (double sales) {
        this.totalSales += sales;
    }

    @Override
    public double pay()
    {
        double payment = super.pay() + this.totalSales * this.commisionRate/100;
        this.totalSales = 0.0;
        return payment;
    }

    @Override
    public String toString () {

        return super.toString() + "\ntotalSales: " + this.totalSales;
    }
}