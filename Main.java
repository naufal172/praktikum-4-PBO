package com;


public class Main {

    public static void main(String[] args) {
	Buku buku = new Buku("Harry Potter", "J,K Rowling", "300000");
	Buku buku1 = new Buku("UML", "Ivar Jacobson", "400000");

	System.out.println("Daftar Buku : " );
	System.out.println();
	System.out.println("Judul : " + buku.getJudul() + "\n" + "Pengarang : " + buku.getPengarang() + "harga : " + buku.getHarga());
	System.out.println();
	System.out.println("Judul : " + buku.getJudul() + "\n" + "Pengarang : " + buku.getPengarang() + "harga : " + buku.getHarga());

    }
}
