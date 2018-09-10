/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midletest2;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class Midletest2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        byte ulangi;
        do {
            int pilihan;
            Scanner masukan = new Scanner(System.in);
            System.out.println("------ SELAMAT DATANG DI PROGRAM KAMI ------");
            System.out.println();
            System.out.println();
            System.out.println("Pilihlah salah satu yang akan anda gunakan : ");
            System.out.println("1. Menghitung volume balok");
            System.out.println("2. Menghitung volume tabung");
            System.out.println("3. Menghitung volume prisma segitiga sama sisi");
            System.out.println("4. Menghitung volume bola");

            System.out.print("Masukan pilihan anda : ");
            pilihan = masukan.nextInt();

            //Balok
            if (pilihan == 1) {
                System.out.println("1. Luas Permukaan");
                System.out.println("2. Volume");
                System.out.print("Pilih Operasi : ");
                int operasi = masukan.nextInt();
                if (operasi == 1) {
                    System.out.print("masukkan panjang : ");
                    double panjang = masukan.nextDouble();

                    System.out.print("masukkan lebar : ");
                    double lebar = masukan.nextDouble();

                    System.out.print("masukkan tinggi : ");
                    double tinggi = masukan.nextDouble();

                    double hasil = 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
                    System.out.println("Luas Permukaan = " + hasil);
                }

                if (operasi == 2) {
                    System.out.print("masukkan panjang : ");
                    double panjang = masukan.nextDouble();

                    System.out.print("masukkan lebar : ");
                    double lebar = masukan.nextDouble();

                    System.out.print("masukkan tinggi : ");
                    double tinggi = masukan.nextDouble();

                    double hasil = (panjang * lebar * tinggi);
                    System.out.println(" volume=  " + hasil);
                }
                if (operasi >= 3) {
                    System.out.println("Silahkan Ulangi Program dan Pilih Operasi");
                }
            }
            //Tabung

            if (pilihan == 2) {

                System.out.println("1. Luas Permukaan");
                System.out.println("2. Volume");
                System.out.print("Pilih Operasi : ");
                int operasi = masukan.nextInt();
                if (operasi == 1) {
                    System.out.print("masukan jari jari : ");
                    double r = masukan.nextDouble();
                    double d = 2 * r;
                    System.out.print("Masukan tinggi : ");
                    double t = masukan.nextDouble();

                    double phi = 3.14;
                    double hasil = ((2 * phi * r * r) + ((phi * d) * t));
                    System.out.println("Luas Permukaan : " + hasil);
                }
                if (operasi == 2) {
                    System.out.print("masukan jari jari : ");
                    double jari = masukan.nextDouble();

                    System.out.print("Masukan tinggi : ");
                    double tinggi = masukan.nextDouble();

                    double phi = 3.14;

                    double hasil = (phi * jari * jari * tinggi);
                    System.out.println("Volume = " + hasil);
                }
                if (operasi >= 3) {
                    System.out.println("Silahkan Ulangi Program dan Pilih Operasi");
                }
            }
            //Prisma Segitiga
            if (pilihan == 3) {
                System.out.println("1. Luas Permukaan");
                System.out.println("2. Volume");
                System.out.print("Pilih Operasi : ");
                int operasi = masukan.nextInt();
                if (operasi == 1) {
                    System.out.print("masukkan alas segitiga : ");
                    double a = masukan.nextDouble();
                    System.out.print("masukkan tinggi segitiga : ");
                    double tinggi1 = masukan.nextDouble();

                    System.out.print("masukan tinggi prisma : ");
                    double tinggi2 = masukan.nextDouble();

                    double hasil = (2 * a * tinggi1 / 2) + ((a * 3) * tinggi2);
                    System.out.println("Luas Permukaan : " + hasil);

                }
                if (operasi == 2) {
                    System.out.print("masukkan alas segitiga : ");
                    double alas = masukan.nextDouble();

                    System.out.print("masukkan tinggi segitiga : ");
                    double tinggi1 = masukan.nextDouble();

                    System.out.print("masukan tinggi prisma : ");
                    double tinggi2 = masukan.nextDouble();

                    double hasil = (alas * tinggi1 * tinggi2 / 2);
                    System.out.println(" volume= " + hasil);
                }
                if (operasi >= 3) {
                    System.out.println("Silahkan Ulangi Program dan Pilih Operasi");
                }
            }
            //Bola

            if (pilihan == 4) {
                System.out.println("1. Luas Permukaan");
                System.out.println("2. Volume");
                System.out.print("Pilih Operasi : ");
                int operasi = masukan.nextInt();

                if (operasi == 1) {
                    System.out.print("masukan jari jari : ");
                    double r = masukan.nextDouble();

                    double phi = 3.14;
                    double hasil = 4 * phi * r * r;
                    System.out.println("Luas Permukaan : " + hasil);
                }
                if (operasi == 2) {
                    System.out.print("masukan jari jari : ");
                    double r = masukan.nextDouble();

                    double phi = 3.14;
                    double hasil = phi * r * r * r * 4 / 3;

                    System.out.println("Volume : " + hasil);

                }
                if (operasi >= 3) {
                    System.out.println("Silahkan Ulangi Program dan Pilih Operasi");
                }
            }
            if (pilihan >= 5) {
                System.out.println();
                System.out.println("Program Error,Silahkan Ulangi Program dan Masukkan Pilihan");
            }
            System.out.println();
            System.out.print("Ulangi Program (1/0) : ");
            ulangi = masukan.nextByte();
            System.out.println();
        } while (ulangi == 1);
        System.out.println();
        System.out.println();
        System.out.println("------ PROGRAM SELESAI ------");

    }

}
