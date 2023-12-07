/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;

/**
 *
 * @author USER
 */
public class lingkaran {
    double luas,kel,phi,r;
      //method lingkaran
    double Hitkel(){
        kel = 2 * phi * r;
        return kel;
    }
    double Hitluas(){
        luas = phi*r*r;
        return luas;
    }
        
      
    //construct lingkaran   
    public lingkaran(double r){ //dengan parameter
        this.r = r;
        this.phi = 3.14;
    }
    public lingkaran(){ //inisialisasi r construct tanpa parameter
        this.r=0;
    }}

    

