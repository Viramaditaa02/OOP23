/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectPrak;

/**
 *
 * @author USER
 */
public class main_kendaraan {
    public static void main(String[] args) {
        kendaraan mobil= new kendaraan();
       // kendaraan mobil= new kendaraan(null," ","automobili-lamborghini"-365);
        System.out.println("nama kendaraan : "+mobil.nama);
        System.out.println("Warna kendaraan : "+mobil.warna);
        System.out.println("Pabrikan kendaraan : "+mobil.pabrikan);
        System.out.println("kecepatan max : "+mobil.speed +" km/jam\n");
        
    }
    
}
