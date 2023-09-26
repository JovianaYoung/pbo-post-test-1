/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.posttest1;
import java.util.ArrayList;
/**
 *
 * @author Asus
 */
public class Posttest1 {

    public static void main(String[] args) {
      ArrayList<Mobil> cars = new ArrayList<>();
        System.out.println("**************************************************");
        System.out.println("               DAFTAR JENIS MOBIL                 ");
        System.out.println("**************************************************");
        // Isi ArrayList dengan objek dari kelas Mobil
        cars.add(new Mobil("Mitsubishi", "Xpander", 2017));
        cars.add(new Mobil("Toyota", "Corolla Cross", 2020));
        cars.add(new Mobil("Honda", "City Hatchback", 2020));
        cars.add(new Mobil("Wuling", "Alvez", 2023));
        cars.add(new Mobil("Hyundai", "Ioniq 5", 2022));

        // Perulangan untuk menampilkan informasi mobil
        for (int i = 0; i < cars.size(); i++) {
            Mobil mobil = cars.get(i);
            System.out.println(i + 1 + ". Mobil " + mobil.getMerek() + " " + mobil.getModel() + " tahun produksi " + mobil.getTahunProduksi());
        }
    }
}
