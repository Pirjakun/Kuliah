/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jurnal10;

import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Mahasiswa {
    
    private String nim;
    private String nama;
    private Date tanggalLahir;
    private double IPK;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) throws Exception {
        if (nim == null || nim.isEmpty()) {
            throw new Exception("NIM tidak boleh kosong");
        }
        BigInteger _ = new BigInteger(nim);
        if (nim.length() != 12) {
            throw new Exception("NIM harus 12 digit");
        }
        
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) throws Exception {
        if (nama == null || nama.isEmpty()) {
            throw new Exception("Nama tidak boleh kosong");
        } else if (nama.length() < 8) {
            throw new Exception("Nama minimal 8 karakter");
        }

        this.nama = nama;
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        this.tanggalLahir = sdf.parse(tanggalLahir);
    }

    public double getIPK() {
        return this.IPK;
    }

    public void setIPK(double IPK) throws Exception {
        if (IPK < 0 || IPK > 4) {
            throw new Exception("IPK antara 0.00-4.00");
        }
        this.IPK = IPK;
    }
}