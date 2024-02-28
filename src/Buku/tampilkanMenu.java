/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buku;

import java.util.Scanner;

/**
 *
 * @author User
 */
class tampilkanMenu {
    static int pilih;
    public static int paket(){
        Scanner in = new Scanner(System.in);
        menu();
        pilih = in.nextInt();
        menu2(pilih);
        return pilih;
    }

    public static void menu() {
        System.out.println("Nama: Faris Hisyam H");
        System.out.println("NIM: 235150600111037");
        System.out.println("Pilih: ");
        System.out.println("1. Teknologi\n2. Filsafat\n3. Sejarah\n4. Agama"
                + "\n5. Psikologi\n6. Politik\n7. Fiksi");
        System.out.println("");
        System.out.println("Masukan pilihan anda : ");
    }
    public static void menu2(int a) {
        System.out.println("=============================");
        System.out.println("");
        System.out.println("Kategori : " + kategori(a));
    }
    
    public static String kategori(int a) {
        String pil = null;
        switch (a){
            case 1:
                pil = "Teknologi";
            break;
            case 2:
                pil = "Filsafat";
            break;
            case 3:
                pil = "Sejarah";
            break;
            case 4:
                pil = "Agama";
            break;
            case 5:
                pil = "Psikolog";
            break;
            case 6:
                pil = "Politik";
            break;
            case 7:
                pil = "Fiksi";
            break;
        }
        return pil;
    }
}
