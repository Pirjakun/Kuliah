/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajar3;

/**
 *
 * @author Fyrza
 */
public class Mahasiswa {
    private String nim;
    private String nama;
    private Prodi prodi;
    private double IPK;
    
    public void setNim(String nim){
        if (nim == null || nim.isEmpty() || nim.length() < 5){
            System.out.println("NIM tidak valid!");
        }else{
            this.nim = nim;
        }
    }
    public void setNama(String nama){
        if (nama == null || nama.isEmpty()){
            System.out.println("Nama tidak boleh kosong!");
        }else{
            this.nama = nama;
        }
    }
    public void setProdi(Prodi prodi){
        this.prodi = prodi;
    }
    public void setIPK(double IPK){
        if (IPK < 0.0 || IPK >4.0){
            System.out.println("IPK TIDAK VALID!");
        }else{
            this.IPK = IPK;
        }
    }
    public String getNim(){
        return nim;
    }
    public String getNama(){
        return nama;
    }
    public Prodi getProdi(){
        return prodi;
    }
    public int getAngkatan(){
        if (nim != null && nim.length() >= 7) {
            String yy = nim.substring(5, 7);
            try {
                int two = Integer.parseInt(yy);
                int year;
                if (two >= 90) {
                    year = 1900 + two;
                } else {
                    year = 2000 + two;
                }
                return year;
            } catch (NumberFormatException e) {
                return 0;
            }
        }
        return 0;
    }
    
    public String getIPK(){
        if (IPK >= 3.9 && IPK <= 4.0) return IPK + "(Summa Cumlaude)";
        else if (IPK >= 3.5) return IPK + " (Cumlaude)";
        else if (IPK >= 3.0) return IPK + " (Sangat Memuaskan)";
        else if (IPK >= 2.5) return IPK + " (Memuaskan)";
        else if (IPK >= 2.0) return IPK + " (Cukup)";
        else return IPK + " (Kurang)";
    }
}
