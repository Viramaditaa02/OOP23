/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectprakk;

import javax.swing.JTextField;

/**
 *
 * @author USER
 */
public class Keuanganelektronik {

    String kodebarcode_barang;
    public String namabarang;
    int total, jumlahbeli, jumlahbayar, bayar, kembalian, keuntungan,hargabeli;
    int totalutg;
    double kembali;
    int totalpayment, harga;

    
    void hargabeli(int Harga){
        this.hargabeli = Harga;
    }
    void hargajual(int Hargajual){
        this.harga = Hargajual;
    }

    void kbb(String kbb) {
        this.kodebarcode_barang = kbb;
    }

    // Metode totalpayment yang sekarang mengembalikan int
    public int totalpayment() {
        total = harga * jumlahbeli;
        return total;
    }

    // Overload metode totalpayment yang juga mengembalikan int
    public int totalpayment(int harga, int jumlahbeli) {
        total = harga * jumlahbeli;
        return total;
    }

    void namabarang(String namabarang) {
        this.namabarang = namabarang;
    }

    void datatotalpayment(int totalpayment) {
        this.totalpayment = totalpayment;
    }
    void totaluntung(int totalutg){
        this.totalutg = totalutg;
    }

    public int getHarga() {
        return harga;
    }

    // Modify setHarga to accept double
    public void setHarga(int harga) {
        this.harga =  harga;  // Convert to int
    }

    // Metode kembalian yang sekarang mengembalikan double
    public double kembalian() {
        return kembali;
    }

    // Metode jumlahbayar yang sekarang mengembalikan int
    public int jumlahbayar() {
        return jumlahbayar;
    }

    // Metode setter untuk kembalian
    public void kembalian(double kembali) {
        this.kembali = kembali;
    }

    // Metode setter untuk jumlahbayar
    public void jumlahbayar(int bayar) {
        this.jumlahbayar = bayar;
    }

    public void setNamabarang(String namabarang) {
        this.namabarang = namabarang;
    }

    public String getNamabarang() {
        return namabarang;
    }

    int untungbrg() {
        return totalutg;
    }
}
