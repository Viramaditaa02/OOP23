/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectprakk;

/**
 *
 * @author USER
 */
public class inf_stokbrg extends Keuanganelektronik implements class_interface {
    int kodebrg;
    private String deskripsi;
    int stok;

    void kodebrg(int kodebrg) {
        this.kodebrg = kodebrg;
    }

    void stok(int stok) {
        this.stok = stok;
    }

    void deskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    int stok() {
        return stok;
    }

    String deskkripsi() {
        return deskripsi;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    @Override
    public String Malang() {
        return "disimpan di gudang malang";
    }

    @Override
    public String Surabaya() {
        return "disimpan di gudang surabaya";
    }
}
