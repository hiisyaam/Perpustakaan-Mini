/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buku;

/**
 *
 * @author User
 */
public class Buku{
   private String namaBuku;
   private String penulis1;
   private String penulis2;
    
//    void setNama(String nama){
//        this.namaBuku = nama;
//    }
//    void setPenulis1(String penulis){
//        this.penulis1 = penulis;
//    }
//    void setPenulis2(String penulis){
//        this.penulis2 = penulis;
//    }
    
//   Kategori : Teknologi
//
//Judul Buku : Homo Deus
//Penulis - 1: Yuval Noah
//Penulsi -2 : -
//
//Judul Buku : Life 3.0
//Penulis - 1: Max Tegmark
//Penulsi -2 : -
   
    void Teknologi() {
        this.namaBuku = "Homo Deus";
        this.penulis1 = "Yuval Noah";
        this.penulis2 = "-";
    }
    
    void Tekonologi2(){
        this.namaBuku = "Life 3.0";
        this.penulis1 = "Max Tegmark";
        this.penulis2 = "-";
    }
    
//    Kategori : Filsafat
//
//Judul Buku : Filosofi Teras
//Penulis - 1: Henry Manampiring
//Penulsi -2 : -
//
//Judul Buku : Dunia Sophie
//Penulis - 1: Jostein Gaarder
//Penulsi -2 : -
    
    void Filsafat(){
        this.namaBuku = "Filosofi Teras";
        this.penulis1 = "Henry Manampiring";
        this.penulis2 = "-";
    }
     void Filsafat2(){
        this.namaBuku = "Dunia Sophie";
        this.penulis1 = "Jostein Gaarder";
        this.penulis2 = "-";
    }
     
//    Kategori : Sejarah
//
//Judul Buku : Sejarah Dunia yang disembunyikan
//Penulis - 1: Jonathan Black
//Penulsi -2 : -
//
//Judul Buku : Max Havelaar
//Penulis - 1: Multatuli
//Penulsi -2 : -
    void Sejarah(){
        this.namaBuku = "Sejarah Dunia yang disembunyikan";
        this.penulis1 = "Jonathan Black";
        this.penulis2 = "-";
    }
    void Sejarah2(){
        this.namaBuku = "Max Havelaar";
        this.penulis1 = "Multatuli";
        this.penulis2 = "-";
    }

    void Agama() {
        this.namaBuku = "Kitab Tauhid";
        this.penulis1 = "Dr. Shalih bin";
        this.penulis2 = "-";
    }

    void Agama2() {
        this.namaBuku = "Kisah Para Nabi";
        this.penulis1 = "Ibnu Katsir";
        this.penulis2 = "-";
    }
    
    void Psikologi(){
        this.namaBuku = "The Art of Choosing";
        this.penulis1 = "Sheena Iyengar";
        this.penulis2 = "-";
    }
    
    void Psikologi2(){
        this.namaBuku = "Atomic Habits";
        this.penulis1 = "James Clear";
        this.penulis2 = "-";
    }
    
    void Politik(){
        this.namaBuku = "Dramaturgi Politik Indonesia";
        this.penulis1 = "Muhammad Sulhan";
        this.penulis2 = "-";
    }
    
    void Politik2(){
        this.namaBuku = "The Republic";
        this.penulis1 = "Plato";
        this.penulis2 = "-";
    }
    
    void Fiksi(){
        this.namaBuku = "Bumi";
        this.penulis1 = "Tere Liye";
        this.penulis2 = "-";
    }
    
    void Fiksi2(){
        this.namaBuku = "Laskar Pelangi";
        this.penulis1 = "Andrea hirata";
        this.penulis2 = "-";
    }
    
    public void display() {
        System.out.println("Judul Buku  : "  +namaBuku);
        System.out.println("Penulis - 1 : " + penulis1);
        System.out.println("Penulis - 2 : " + penulis2);
        System.out.println("");
    }

    

    

    
}
