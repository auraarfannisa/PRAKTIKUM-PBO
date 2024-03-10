// Nama     : Aura Arfannisa Az Zahra
// NIM      : 24060122130097
// Deskripsi: Program untuk menunjukkan asersi 
// Tanggal  : 10 Maret 2024

public class Product {
    // Atribut
    private String name;
    private int stock;
    private int price;

    // Konstruktor
    public Product() {
        this.name = "";
        this.stock = 0;
        this.price = 0;
    }

    public Product(String name, int stock, int price) {
        this.name = name;
        this.stock = stock;
        this.price = price;
    }

    // Method
    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public int getPrice() {
        return price;
    }

    // Asersi
    public void setName(String name) {
        // Set atribut name    
        this.name = name;

        // Asersi jika name yang dimasukkan berupa string kosong
        assert (!name.isEmpty()) : "Nama tidak boleh berupa string kosong!";
    }

    public void setStock(int stock) {
        // Set atribut stock
        this.stock = stock;

        // Asersi bahwa jumlah stock yang dimasukkan harus bilangan positif
        assert (stock >= 0): "Stock harus berupa bilangan positif!";
    }

    public void setPrice(int price) {
        // Set atribut price
        this.price = price;

        // Asersi bahwa price harus berupa bilangan positif
        assert (price > 0): "Price harus berupa bilangan positif!";
    }

    public void purchaseProduct(int quantity) {
        // Kode untuk mengurangi stok produk jika dilakukan pembelian
        stock = stock - quantity;

        // Asersi quantity yang dimasukkan harus bilangan positif 
        assert (quantity > 0): "Quantity harus berupa bilangan positif!";

        // Asersi jika stok produk yang tersedia tidak mencukupi
        assert (quantity <= stock): "Stock tidak tersedia!";
    }

    public void addStock(int quantity) {
        // Kode untuk menambah stok produk
        stock = stock + quantity;

        // Asersi dimana quantity yang dimasukkan harus bilangan positif
        assert (quantity > 0): "Quantity harus berupa bilangan positif!";
    }
}