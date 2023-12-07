/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class gaji {
    //atribut
    int gapok;
    int hadir,lembur,gatot,thadir,jlembur;
    
    //cons
    public gaji(int gapok, int thadir, int jlembur) {
      this.gapok = gapok;
       this.thadir = thadir;
       this.jlembur = jlembur;
    }

    gaji() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    //method hitung gaji karywan
    int hitgaji(){
        gatot=gapok ;
        return gatot;
    }
    
     //method hitung gaji 2 sekretaris
     int hitgaji(int hadir){
        gatot=gapok + (hadir * thadir);
        return gatot;
     }
    //method hitung gaji 3 mnajer
    int hitgaji(int hadir, int lembur){
        gatot=gapok + (hadir * thadir)+ (lembur *jlembur);
        return gatot;
    }
   
}
