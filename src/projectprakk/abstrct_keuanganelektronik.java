/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectprakk;

/**
 *
 * @author USER
 */
public abstract class abstrct_keuanganelektronik {
    String kode_HP;
    String  nama_hp,jenis, warna,tipe;
    int harga,jumblah;
 void datajenis(String jenis){
 this.jenis= jenis;
 } 
 void datawarna(String warna){
 this.warna = warna;
 }
 void datatipe(String tipe){
 this.tipe=tipe;
 } 
 void datajumblah(int jumblah){
 this.jumblah = jumblah;
 }
 void dataharga(int harga){
 this.harga = harga;
 }
 void kdhp(String kd){
 this.kode_HP= kd;
 }


 
 
 String cetakjenis(){
 return jenis;     
 }
 String cetakwarna(){
 return warna;
 }
 String cetaktipe(){
 return tipe;
 }
 int cetakjumblah(){
 return jumblah;
 }
 int cetakharga(){
 return harga;
 }
 String input(String nama){
        return "Data "+nama+" Berhasil di Inputkan";
    }
 
abstract String kode_HP();
}
    

