public class Produk {
    protected String namaProduk;
    protected double hargaProduk;

    public Produk(String namaProduk, double hargaProduk) {
        this.namaProduk = namaProduk;
        this.hargaProduk = hargaProduk;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga Produk: " + hargaProduk);
    }

}
