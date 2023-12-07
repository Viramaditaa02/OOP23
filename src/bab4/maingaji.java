/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab4;

/**
 *
 * @author USER
 */
public class maingaji {
    public static void main(String[] args) {
        pembayarangaji gaji = new pembayarangaji ();
        gaji.setinput("12345");
        System.out.println("rekening yang anda masukkan :" +gaji.getinput());
        System.out.println("jumlah saldo anda : "+gaji.ceksaldo());
    }
}
