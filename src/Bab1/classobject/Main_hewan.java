/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab1.classobject;

/**
 *
 * @author USER
 */
public class Main_hewan {
    public static void main (String[]args){
        Hewan_Vira kucing;
        kucing = new Hewan_Vira();
        kucing.Nama = "LILI";
        kucing.Warnabulu = "Coklat";
        kucing.Jumlahkaki = 4;
        kucing.Jeniskelamin = "Perempuan";
        kucing.Berat = "3 KG";
        kucing.Asal ="Malang"; 
        
        System.out.println("Nama Kucing : "+kucing.Nama );
        System.out.println("Warna Bulu : "+kucing.Warnabulu);
        System.out.println("Jumlah Kaki Kucing : "+kucing.Jumlahkaki);
        System.out.println("Jenis Kelamin : "+kucing.Jeniskelamin);
        System.out.println("Berat Kucing : " +kucing.Berat);
        System.out.println("Asal Kucing : "+kucing.Asal);
        System.out.println("============================");
        System.out.println("CARA KUCING BERGERAK");
        System.out.println("Saat Senang : ");
        kucing.berguling();
        System.out.println("Saat gabut : ");
        kucing.berjalan();
        System.out.println("Saat dikejar : ");
        kucing.berlari();
        kucing.melompat();
    }
    
}
