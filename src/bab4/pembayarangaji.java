/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab4;

/**
 *
 * @author USER
 */
public class pembayarangaji {
    private String nomorrekening;
    private String input;
    private double saldo;
 
    public pembayarangaji(){
this.nomorrekening = "12345";
this.saldo = 1000000;
}
    public String getnorekening (){
        return nomorrekening;
}
    public void setnomorrekening (String nomorrekening){
        this.nomorrekening = this.nomorrekening;
    }
     public double getsaldo (){
        return saldo;
     }
      public void setsaldo (double saldo){
        this.saldo = saldo;
      }
      public String getinput (){
        return input;
      }
      
    public void setinput (String input){
        this.input = input;
    }
    public double ceksaldo (){
        if (getnorekening().equals(getinput()));
        return getsaldo ();
    }
    else{
    return 0;
}
}
        }
  
        




