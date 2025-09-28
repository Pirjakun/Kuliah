/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Fyrza
 */
public class Mahasiswa {
    private String nama;
    private Prodi prodi;
    
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setProdi(Prodi prodi){
        this.prodi = prodi;
    }
    public String getNama(){
        return nama;
    }
    public String getProdi(){
        return prodi.getNama();
    }
    
    public void displayMahasiswa(){
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("Nama Prodi : " + prodi.getNama());
        System.out.println();
    }
}
