/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package buku_alamat;

/**
 *
 * @author Dimas
 */
public class Buku_alamat {
   private String nama;
   private String alamat;
   private String no_telpon;
   private String email;
   
   private static int hitung;
    public Buku_alamat(){
        hitung = 0;
    }
    public Buku_alamat(String nama, String alamat, String no_telpon, String email) {
        this.nama = nama;
        this.alamat = alamat;
        this.no_telpon = no_telpon;
        this.email = email;
        hitung++;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getEmail() {
        return email;
    }

    public String getNama() {
        return nama;
    }

    public String getNo_telpon() {
        return no_telpon;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNama(String nama,String alamat,String no_telpon,String email) {
        this.nama = nama;
        this.alamat = alamat;
        this.no_telpon = no_telpon;
        this.email = email;
        hitung++;
        
    }

    public void setNo_telpon(String no_telpon) {
        this.no_telpon = no_telpon;
    }

    public static int getHitung() {
        return hitung;
    }

    public static void setHitung(int hitung) {
        Buku_alamat.hitung = hitung;
    }
    

}


   