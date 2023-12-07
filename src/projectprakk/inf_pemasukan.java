/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectprakk;

/**
 *
 * @author USER
 */
public class inf_pemasukan extends Keuanganelektronik {

    int pemasukan, penjualan, jual, UntungBrg;
    private int kodebrg;
    String bulan;

    @Override
    public int totalpayment(int harga, int jumlahbeli) {
        return totalpayment();
    }

    @Override
    int untungbrg() {
        totalutg = (harga - hargabeli);
        return totalutg;
    }

    void untungBrg(int UntungBrg) {
        this.UntungBrg = UntungBrg;
    }

    void Jual(int jual) {
        this.jual = jual;
    }

    void setpenjualan(int penjualan) {
        this.penjualan = penjualan;
    }

    void bulan(String bulan) {
        this.bulan = bulan;
    }

    int pemasukan() {
        return pemasukan;
    }

    int getpenjualan() {
        return penjualan;
    }

    
    public void setKodebrg(int kodebrg) {
        this.kodebrg = kodebrg;
    }

    public int getKodebrg() {
        return kodebrg;
    }

    void harga(int Harga) {
        this.harga = Harga;
    }
}
