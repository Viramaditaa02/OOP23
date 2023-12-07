/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectPrak;

/**
 *
 * @author USER
 */
public class Keuanganelektronik {
    String namabarang;
    int total, harga, jumlahbeli,jumlahbayar, untung,hargabeli, totalpayment, kembalian;
    
    //meng inisialisasi harga modal beli seluruh barang yang dijual dengan construct
    public Keuanganelektronik() {
        this.namabarang= "Laptop";
        this.hargabeli = 300000;
        this.harga= 500000;
        this.jumlahbeli= 2;
        this.total= 1000000;
        this.untung= 200000;
       }
    
    //method
    public int totalpayment(){
       total = harga*jumlahbeli;
        return total;
    }       
       public int untungbarang(){
  untung = (harga-hargabeli)*jumlahbeli;
return untung;
}  
public int chage(){
    kembalian = jumlahbayar - total;
        return kembalian;
}    
}
