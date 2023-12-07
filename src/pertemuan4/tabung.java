/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class tabung extends lingkaran{ //mengambil atau mewariskan method dan property dari kelas lingkaran
        double tinggi,vol,luas;
    //method tabung
        double Hitluas(){
        luas = (2*phi*r*r)+(2*phi*r*tinggi);
        return luas;
    }
    double hitvol(){
        vol = phi*r*r*tinggi;
        return vol;
    }
    
    //construct tabung
    public tabung(double r, double tinggi) {
        super(r);
        this.tinggi = tinggi;
    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("input jari-jari tabung: ");
        double r = input.nextDouble();
        System.out.print("input tinggi tabung : ");
        double tinggi = input.nextDouble();
        tabung tbng = new tabung(r,tinggi);
        double vol = tbng.hitvol();
        double luas = tbng.Hitluas();

        System.out.println("Volume tabung adalah : " + tbng.hitvol()+ " CM^3");
        System.out.println("Luas permukaan tabung adalah : " + luas + " CM^2");
double kebutuhancat = 1.0; 
        double hitkebutuhancat = luas / 0.5 * kebutuhancat;
        System.out.println("cat yang dibutuhkan adalah : " + hitkebutuhancat+ " liter");
        input.close();
    }
}

    

