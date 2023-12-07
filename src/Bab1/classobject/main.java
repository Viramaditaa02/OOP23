/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab1.classobject;

/**
 *
 * @author USER
 */
public class main {
    public static void main (String[]args){
        kendaraan mobil = new kendaraan();
        mobil.nama ="mobil";
        mobil.warna ="merah";
        mobil.merk="toyota";
        System.err.println("Nama kendaraan : " + mobil.nama);
        System.out.println("warna kendaraan : "+mobil.warna);
        System.out.println("merk kendaraan : "+ mobil.merk);
        System.out.println("Jumlah roda : "+mobil.jmlroda(4)+"\n");
        System.out.println("cara kendaraan bergerak ");
        mobil.kendaraanmaju();
        System.out.println("saat mundur");
        mobil.kendaraanmundur();
        System.out.println("saat berhenti");
        mobil.kendaraanberhenti();
        
           
    }
    
}
