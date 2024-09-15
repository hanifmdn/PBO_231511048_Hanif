import com.polban.jtk.sales.*;// import seluruh yang ada di com.polban.jtk.sales

public class Soal3 {
    public static void main(String[] args) {
        // Membuat objek produk bernama Laptop dengan harga 15 juta dan stok 10
        Product Laptop = new Product("Laptop", 15000000, 10);

        // Membuat objek Sales untuk mengelola produk Laptop
        Sales salesLaptop = new Sales(Laptop);

        // Menjual 3 unit Laptop
        salesLaptop.sellProduct(3);

        // Menambah stok 5 unit Laptop
        salesLaptop.restockProduct(5);

        // Memperbarui harga Laptop menjadi 14 juta
        salesLaptop.updateProductPrice(1.4E7);

        // Mencoba memperbarui harga dengan nilai negatif (akan gagal)
        salesLaptop.updateProductPrice(-1);
    }
}