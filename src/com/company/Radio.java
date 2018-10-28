package com.company;

/**
 * @author
 * NAMA                 : Joseph Armando Carvallo
 * KELAS                : PBO2
 * NIM                  : 10117077
 * Deskripsi Program    : Manampilkan barang antik. Clild class dipanggil oleh Parent class, di
 *                        class BarangAntik(parent class) terdapat prosedur tampilUmur untuk
 *                        menampilkan umur barang antik
 **/

public class Radio extends BarangAntik {
    private String nama;

    public Radio(int umur) {
        super(umur);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
