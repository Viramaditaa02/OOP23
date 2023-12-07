/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class gajimaneger extends gaji{
    int jmlHadir, jmlLembur;
     public gajimaneger() {
        super(3200000, 15000, 40000);
    }

 @Override
 int hitgaji() {
 return gapok + (jmlHadir * thadir) + (jmlLembur *
lembur);
 }
}
