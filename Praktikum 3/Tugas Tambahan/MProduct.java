// Nama     : Aura Arfannisa Az Zahra
// NIM      : 24060122130097
// Deskripsi: Program untuk mendemokan asersi
// Tanggal  : 10 Maret 2024

public class MProduct {
    public static void main(String[] args) {
        Product product = new Product("Laptop", 4, 500);
        System.out.println("Product Name: " + product.getName());
        System.out.println("Product Stock: " + product.getStock());
        System.out.println("Product Price: " + product.getPrice());
        product.purchaseProduct(5);
        System.out.println("Product Stock: " + product.getStock());
        }
}
