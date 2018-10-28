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

public class BarangAntik {
    int umur;

    public BarangAntik(int umur) {
        this.umur = umur;
    }

    public void tampilUmur() {
        Radio radio = new Radio(234);
        System.out.println("Umur barang antik ini adalah : " + umur + " tahun.");
    }
}
