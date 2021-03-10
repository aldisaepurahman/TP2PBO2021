/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*Saya Aldi Saepurahman mengerjakan evaluasi Tugas Praktikum 2 dalam mata kuliah
Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak
melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.*/
package tp2pbo2021;

/**
 *
 * @author Aldi Saepurahman
 */
public class Mobil {
    //buat atribut private dari class Mobil seperti merk, plat, warna dan jenis
    private String merk;
    private String plat;
    private String warna;
    private String jenis;
    //constructor mobil
    public Mobil(String merk, String plat, String warna, String jenis){
        this.merk = merk;
        this.plat = plat;
        this.warna = warna;
        this.jenis = jenis;
    }
    //buat getter setiap atribut
    public String getMerk(){
        return this.merk;
    }
    
    public String getPlat(){
        return this.plat;
    }
    
    public String getWarna(){
        return this.warna;
    }

    public String getJenis(){
        return this.jenis;
    }
    
}
