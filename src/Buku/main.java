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
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        tampilkanMenu.paket();
        
        Buku buku = new Buku();
        
        
        switch(tampilkanMenu.pilih){
            case 1:
                buku.Teknologi();
                buku.display();
                buku.Tekonologi2();
                buku.display();
            break;
            case 2:
                buku.Filsafat();
                buku.display();
                buku.Filsafat2();
                buku.display();
            break;
            case 3:
                buku.Sejarah();
                buku.display();
                buku.Sejarah2();
                buku.display();
            break;
            case 4:
                buku.Agama();
                buku.display();
                buku.Agama2();
                buku.display();
            break;
            case 5:
                buku.Psikologi();
                buku.display();
                buku.Psikologi2();
                buku.display();
            break;
            case 6:
                buku.Politik();
                buku.display();
                buku.Politik2();
                buku.display();
            break;
            case 7:
                buku.Fiksi();
                buku.display();
                buku.Fiksi2();
                buku.display();
            break;
        }
        
        
        
        
        
    }
    
    
}
