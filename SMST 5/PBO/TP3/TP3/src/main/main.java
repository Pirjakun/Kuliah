/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author Fyrza
 */
public class main {
    public static void main(String[] args) {
        Prodi pr1 = new Prodi();
        Prodi pr2 = new Prodi();
        
        pr1.setNama("S1 Teknologi Informasi");
        pr2.setNama("S1 Sastra Mesin");
        
        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();
        
        mhs1.setNama("Bruce Wayne");
        mhs1.setProdi(pr1);
        
        mhs2.setNama("Tony Stark");
        mhs2.setProdi(pr2);
        
        System.out.println("============= Data Mahasiswa =============");
        mhs1.displayMahasiswa();
        mhs2.displayMahasiswa();
    }
    
}
