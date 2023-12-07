/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;

/**
 *
 * @author USER
 */
public class PIN {
    String nama;
    private String pin;
    private String inputuser;
    String hasilcocok;

    public PIN() {
        pin = "2218002";
    }

    public void setInputuser(String inputuser) {
        this.inputuser = inputuser;
    }
  String cocokkanpin(){
        if (pin.compareTo(inputuser)==0) {
hasilcocok= "pin benar";
}
        else {
hasilcocok= "pin salah";
        }
return hasilcocok;
        }  
    
}

