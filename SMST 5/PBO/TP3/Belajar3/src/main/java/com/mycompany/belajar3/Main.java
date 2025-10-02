/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.belajar3;

/**
 *
 * @author Fyrza
 */
public class Main {
    public static void main(String[] args) {
        Prodi pr1 = new Prodi();
        pr1.setKode("IF");
        pr1.setNama("Informatika");
        
        Prodi pr2 = new Prodi();
        pr2.setKode("IT");
        pr2.setNama("Teknologi Informasi");
        
        Prodi pr3 = new Prodi();
        pr3.setKode("DS");
        pr3.setNama("Sains Data");
        
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.setNim("1030312325879");
        mhs1.setNama("John Smith");
        mhs1.setProdi(pr1);
        mhs1.setIPK(3.1);
        
        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.setNim("103032521132");
        mhs2.setNama("Tommy Stark");
        mhs2.setProdi(pr2);
        mhs2.setIPK(4.0);
  
        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.setNim("103059821543");
        mhs3.setNama("Tin Man");
        mhs3.setProdi(pr3);
        mhs3.setIPK(2.9);

        Mahasiswa mhs4 = new Mahasiswa();
        mhs4.setNim("103019821344");
        mhs4.setNama("Ben 7");
        mhs4.setProdi(pr1);
        mhs4.setIPK(1.8);
        
        Mahasiswa[] arr = {mhs1, mhs2, mhs3, mhs4};
        
        for (int i = 0; i< arr.length; i++){
            System.out.println("Mahasiswa " + (i + 1));
            System.out.println("NIM       : " + arr[i].getNim());
            System.out.println("Nama      : " + arr[i].getNama());
            System.out.println("Prodi     : " + arr[i].getProdi().getKode() +
                               " (" + arr[i].getProdi().getNama() + ")");
            System.out.println("Angkatan  : " + arr[i].getAngkatan());
            System.out.println("IPK       : " + arr[i].getIPK());
            System.out.println();
        }
    }
}