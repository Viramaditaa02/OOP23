/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectPrak;

/**
 *
 * @author USER
 */
public class main_elektonik {
    public static void main (String args[]){
    Keuanganelektronik elektronik = new Keuanganelektronik(); 
        System.out.println("Nama barang : "+ elektronik.namabarang);
        System.out.println("Jumlah beli : " + elektronik.jumlahbeli);
        System.out.println("Harga : "+elektronik.harga);
        System.out.println("Total payment : "+elektronik.total);
        System.out.println("Untung per pcs : "+ elektronik.untung);
}  
}
