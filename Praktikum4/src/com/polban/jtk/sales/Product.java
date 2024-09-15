
// Kelas Product
public class Product {
    // Atribut private untuk menyembunyikan informasi produk
    private String productName;
    private double price;
    private int stock;
    // Constructor untuk inisialisasi atribut produk
    public Product(String productName, double price, int stock)
    {
        this.productName = productName;
        this.price = price;
        this.stock = stock;
    }
    // Getter dan Setter untuk mengontrol akses ke atribut private
    // Getter untuk mendapatkan nama produk
    public String getProductName() {
        return productName;
    }
    // Getter untuk mendapatkan harga produk
    public double getPrice() {
        return price;
    }
    // Setter untuk memperbarui harga produk
    // Hanya memperbarui jika harga lebih dari 0, jika tidak maka akan tidak valid
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Harga tidak valid!");
        }
    }
    // Getter untuk mendapatkan stok produk
    public int getStock() {
        return stock;
    }
    // Menambah stok produk
    public void addStock(int amount) {
        if (amount > 0) {
            this.stock += amount;
        } else {
            System.out.println("Jumlah stok tidak valid!");
        }
    }
    // Menjual produk dan mengurangi stok
    public void sellProduct(int quantity) {
        if (quantity > 0 && quantity <= stock) {
            stock -= quantity;
            System.out.println(quantity + " " + productName + " terjual.");
        } else {
            System.out.println("Jumlah stok tidak cukup untuk penjualan.");
        }
    }
}