package com.utspaw;

import java.util.Scanner;

public class NilaiMahasiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nilai mahasiswa: ");
        double nilai = scanner.nextDouble();
        scanner.close();
        
        String grade = "";
        
        if (nilai >= 80.00) {
            grade = "A";
        } else if (nilai >= 77.50) {
            grade = "A-";
        } else if (nilai >= 75.00) {
            grade = "A/B";
        } else if (nilai >= 72.50) {
            grade = "B+";
        } else if (nilai >= 70.00) {
            grade = "B";
        } else if (nilai >= 67.50) {
            grade = "B-";
        } else if (nilai >= 65.00) {
            grade = "B/C";
        } else if (nilai >= 62.50) {
            grade = "C+";
        } else if (nilai >= 60.00) {
            grade = "C";
        } else if (nilai >= 55.00) {
            grade = "C-";
        } else if (nilai >= 50.00) {
            grade = "C/D";
        } else if (nilai >= 45.00) {
            grade = "D+";
        } else if (nilai >= 40.00) {
            grade = "D";
        } else {
            grade = "E";
        }
        
        System.out.println("Nilai: " + grade);
    }
}
