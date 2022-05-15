/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notortalamasi;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class NotOrtalamasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double VizeNotu[] = new double[9];
        double FinalNotu[] = new double[9];
        double VizeOrtalamasi[] = new double[9];
        double FinalOrtalamasi[] = new double[9];
        double Ogr_sayisi[] = new double[5];
        double NotOrtalamasi[] = new double[9];

        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= Ogr_sayisi.length; i++) {
            System.out.println(i + ".ogrencinin Vize notunu gir");

            VizeNotu[i] = input.nextDouble();
            VizeOrtalamasi[i] = VizeNotu[i] * 0.4;
            System.out.println(i + ".ogrencinin Final notunu gir");

            FinalNotu[i] = input.nextDouble();
            FinalOrtalamasi[i] = FinalNotu[i] * 0.6;

            NotOrtalamasi[i] = VizeNotu[i] * 0.4 + FinalNotu[i] * 0.6;

        }
        for (int j = 1; j <= Ogr_sayisi.length; j++) {

            System.out.println(j + ".Ogrenci Vize Ortalamasi = " + VizeOrtalamasi[j]);
            System.out.println(j + ".Ogrenci Final Ortalamasi = " + FinalOrtalamasi[j]);
            System.out.println(j + " .Ogrenci Not Oratalmasi = " + NotOrtalamasi[j]);
            if (NotOrtalamasi[j] > (90.0)) {
                System.out.println("AA ile dersi geçtiniz.");
            } else if (NotOrtalamasi[j] > 85) {
                System.out.println("BA ile dersi geçtiniz.");
            } else if (NotOrtalamasi[j] > 80) {
                System.out.println("BB ile dersi geçtiniz.");
            } else if (NotOrtalamasi[j] > 75) {
                System.out.println("CB ile dersi geçtiniz.");
            } else if (NotOrtalamasi[j] >= 60) {
                System.out.println("Kosullu geçtiniz.");
            } else {
                System.out.println("Derste kaldiniz.");

            }

        }

       
            System.out.println("ogrencilarin sayisi = " + Ogr_sayisi.length);
        
    }
}
