package com.utspaw;

import java.util.ArrayList;
import java.util.Date;

public class CustomerHotel {
    private String noKTP;
    private String nama;
    private String alamat;
    private String nomorKamar;

    public CustomerHotel(String noKTP, String nama, String alamat, String nomorKamar) {
        this.noKTP = noKTP;
        this.nama = nama;
        this.alamat = alamat;
        this.nomorKamar = nomorKamar;
    }

    public void infoTamu() {
        System.out.println("Info Tamu:");
        System.out.println("No. KTP: " + noKTP);
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Nomor Kamar: " + nomorKamar);
    }

    public void waktuCheckin(Date checkin) {
        System.out.println("Waktu Check-in: " + checkin);
    }

    public void waktuCheckout(Date checkout) {
        System.out.println("Waktu Check-out: " + checkout);
    }

    public void informasiPembayaran(double totalBiaya) {
        System.out.println("Informasi Pembayaran:");
        System.out.println("Total Biaya: " + totalBiaya);
    }

    public void pesananMakanan(ArrayList<String> pesanan) {
        System.out.println("Pesanan Makanan:");
        for (String makanan : pesanan) {
            System.out.println("- " + makanan);
        }
    }

    public static void main(String[] args) {
        CustomerHotel customer1 = new CustomerHotel("32031109491", "Aldi Raihan", "Bantul", "13");
        customer1.infoTamu();
        
        Date checkinDate = new Date();
        customer1.waktuCheckin(checkinDate);

        Date checkoutDate = new Date(checkinDate.getTime() + 24 * 60 * 60 * 1000); // Check-out setelah 1 hari (dalam milidetik / 24 jam)
        customer1.waktuCheckout(checkoutDate);

        ArrayList<String> pesananMakanan = new ArrayList<>();
        pesananMakanan.add("Nasi Goreng");
        pesananMakanan.add("Ayam Bakar");
        customer1.pesananMakanan(pesananMakanan);

        customer1.informasiPembayaran(218000.0);
    }
}
