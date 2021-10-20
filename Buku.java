package com;

public class Buku {
    private String judul;
    private String pengarang;
    private double harga;

    public Buku(String judul, String pengarang, double harga) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.harga = harga;
    }


    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getJudul() {
        return judul;
    }

    public double getHarga() {
        return harga;
    }

    public String getPengarang()
    {
        return pengarang;
    }
}
