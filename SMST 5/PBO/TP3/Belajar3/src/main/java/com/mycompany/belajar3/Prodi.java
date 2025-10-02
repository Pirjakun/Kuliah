/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajar3;

/**
 *
 * @author Fyrza
 */
public class Prodi {
    private String kode;
    private String nama;

    public void setKode(String kode){
        if (kode == null || kode.isEmpty() || kode.length() !=2){
            System.out.println("Kode Prodi harus 2 karakter!");
        } else{
            this.kode = kode;
        }
    }
    public void setNama(String nama){
        if (nama == null || nama.isEmpty()){
            System.out.println("Nama Prodi tidak boleh kosong!");
        }else{
            this.nama = nama;
        }
    }
    public String getKode(){
        return kode;
    }
    public String getNama(){
        return nama;
    }
}
