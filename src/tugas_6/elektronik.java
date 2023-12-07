/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_6;

/**
 *
 * @author USER
 */
public abstract class elektronik {
     String kode_barang;
    String  nama_elektronik,jenis, warna,metode;
    int harga,jumblah;
 void datajenis(String jenis){
 this.jenis= jenis;
 } 
 void datawarna(String warna){
 this.warna = warna;
 }
 void datametode(String tipe){
 this.metode = metode;
 } 
 void datajumblah(int jumblah){
 this.jumblah = jumblah;
 }
 void dataharga(int harga){
 this.harga = harga;
 }
 void kdhp(String kd){
 this.kode_barang= kd;
 }


 
 
 String cetakjenis(){
 return jenis;     
 }
 String cetakwarna(){
 return warna;
 }
 String cetaktipe(){
 return metode;
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
 
abstract String kode_barang();
}
