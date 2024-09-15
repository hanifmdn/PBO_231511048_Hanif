
// Kelas Sales untuk mengelola transaksi penjualan
public class Sales {
    private Product product; // Produk yang akan dikelola
    // Constructor
    public Sales(Product product) {
        this.product = product;
    }
    // Metode untuk melakukan penjualan
    public void sellProduct(int quantity) {
        System.out.println("Memproses penjualan...");
        product.sellProduct(quantity); // Panggil metode sellProduct dari Product dengan kuantitas tertenu
        System.out.println("Stok setelah penjualan: " +
                product.getStock());
    }
    // Metode untuk menambah stok produk
    public void restockProduct(int quantity) {
        System.out.println("Menambah stok...");
        product.addStock(quantity); // Panggil metode addStock dari Product
        System.out.println("Stok setelah penambahan: " +
                product.getStock());
    }
    // Metode untuk memperbarui harga produk
    public void updateProductPrice(double newPrice) {
        System.out.println("Memperbarui harga produk...");
        product.setPrice(newPrice); // Panggil metode setPrice dari Product
        System.out.printf("Harga baru: %.2f", product.getPrice());
    }
}