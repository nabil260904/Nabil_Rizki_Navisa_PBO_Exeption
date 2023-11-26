public class Transaksi extends Produk implements TotalTagihan {
    private int noFaktur;
    private String namaPelanggan;
    private int jumlahBeli;

    public Transaksi(int noFaktur, String namaPelanggan, String namaProduk, double hargaProduk, int jumlahBeli) {
        super(namaProduk, hargaProduk);
        this.noFaktur = noFaktur;
        this.namaPelanggan = namaPelanggan;
        this.jumlahBeli = jumlahBeli;
    }

    @Override
    public double hitungTotalTagihan() {
        return hargaProduk * jumlahBeli;
    }

    public void tampilkanTransaksi() {
        System.out.println("No Faktur: " + noFaktur);
        System.out.println("Nama Pelanggan: " + namaPelanggan);
        tampilkanInfo(); // Memanggil method dari kelas parent
        System.out.println("Jumlah Beli: " + jumlahBeli);
        System.out.println("Total Bayar: " + hitungTotalTagihan());
    }
}

