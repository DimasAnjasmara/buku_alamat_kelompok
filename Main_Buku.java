
package buku_alamat;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author Dimas
 */

public class Main_Buku {
    public static void main(String[] args) {
        Buku_alamat Data = new Buku_alamat();
        BufferedReader DataIn = new BufferedReader(new InputStreamReader(System.in));
        String [] Nama =new String[100];
    String [] Alamat =new String[100];
    String [] Telepon =new String[100];
    String [] Email =new String[100];
    String pilih="";
    String N="";
    String yesno="";
    int no;
    int jumlah=0;
    do {
                try {
    System.out.println("MENU");
    System.out.println("1. INSERT DATA");
    System.out.println("2. UPDATE DATA");
    System.out.println("3. VIEW DATA");
    System.out.println("4. DELETE DATA");
    System.out.println("5. KELUAR");
    System.out.println();
    System.out.print("MASUKAN PILIHAN ANDA :");
               try{
                pilih=DataIn.readLine();
               }catch(IOException e){
               System.out.println("Salah!");
               }
                switch(Integer.parseInt(pilih)){
      case 1:
        System.out.print("Masukkan Data Baru :");
               try{
               N=DataIn.readLine();
               }catch(IOException e){
               System.out.println("Salah!");
               }
          jumlah=Integer.parseInt(N);
        for(int i=0; i<jumlah; i++ ){
        System.out.println("Data ke: "+(i+1));
        System.out.print("Masukan Nama: ");
            try{
                Nama[i]=DataIn.readLine();
               }catch(IOException e){
               System.out.println("Salah!");
               }
        System.out.print("Masukan Alamat: ");
            try{
                Alamat[i]=DataIn.readLine();
               }catch(IOException e){
               System.out.println("Salah!");
               }
        System.out.print("Masukan Telepon: ");
            try{
                Telepon[i]=DataIn.readLine();
               }catch(IOException e){
               System.out.println("Erorr!");
               }
        System.out.print("Masukan Email: ");
            try{
                Email[i]=DataIn.readLine();
               }catch(IOException e){
               System.out.println("Salah!");
               }
        }
          for(int i=0; i<jumlah; i++ ){
        Data.setNama(Nama[i],Alamat[i],Telepon[i],Email[i]);
        System.out.println("Nama       :"+Data.getNama() );
        System.out.println("Alamat     :"+Data.getAlamat() );
        System.out.println("Telepon    :"+Data.getNo_telpon() );
        System.out.println("Email      :"+Data.getEmail() );
        System.out.println();
        }
      System.out.println("Berhasil Di Input");
        break;
      case 2:
                System.out.println("UPDATE DATA");
        System.out.print("Masukan Nomor Yang Akan di Ubah: Input [1-"+jumlah+"]: ");
        System.out.println();
               try{
               N=DataIn.readLine();
               }catch(IOException e){
               System.out.println("Salah!");
               }
        no=Integer.parseInt(N);
        System.out.println("Ditemukan Data ke- "+no);
        System.out.println();
        no=no-1;
        Data.setNama(Nama[no],Alamat[no],Telepon[no],Email[no]);
        System.out.println("Nama       :"+Data.getNama() );
        System.out.println("Alamat     :"+Data.getAlamat() );
        System.out.println("Telepon    :"+Data.getNo_telpon() );
        System.out.println("Email      :"+Data.getEmail() );
        System.out.println();
        System.out.print("Yakin Akan Di Ubah? y/t] :");
        System.out.println();
               try{
               yesno=DataIn.readLine();
               }catch(IOException e){
               System.out.println("Erorr!");
               }
        if ((yesno=="tidak")||(yesno=="t")||(yesno=="T")){
            System.out.println("Data Tidak Jadi di ubah");
        }else{
     System.out.println("Proses Ubah Data ke: "+(no+1));
        System.out.print("Input Nama: ");
               try{
                Nama[no]=DataIn.readLine();
               }catch(IOException e){
               System.out.println("Erorr!");
               }
        System.out.print("Input Alamat: ");
               try{
                Alamat[no]=DataIn.readLine();
               }catch(IOException e){
               System.out.println("Erorr!");
               }
        System.out.print("Input telpon: ");
               try{
                Telepon[no]=DataIn.readLine();
               }catch(IOException e){
               System.out.println("Erorr!");
               }
        System.out.print("Input Email: ");
               try{
                Email[no]=DataIn.readLine();
               }catch(IOException e){
               System.out.println("Erorr!");
               }
        Data.setNama(Nama[no],Alamat[no],Telepon[no],Email[no]);
        System.out.println("Nama       :"+Data.getNama() );
        System.out.println("Alamat     :"+Data.getAlamat() );
        System.out.println("Telepon    :"+Data.getNo_telpon() );
        System.out.println("Email      :"+Data.getEmail() );
        System.out.println();
        System.out.println("Data Berhasil Diubah");
        System.out.println();
        }
        break;
          case 3:
            System.out.println("VIEW DATA");
            for(int i=0; i<jumlah; i++ ){
                Data.setNama(Nama[i],Alamat[i],Telepon[i],Email[i]);
                System.out.println("Nama       :"+Data.getNama() );
                System.out.println("Alamat     :"+Data.getAlamat() );
                System.out.println("Telepon    :"+Data.getNo_telpon() );
                System.out.println("Email      :"+Data.getEmail() );
                System.out.println();
           }
            break;
            case 4:
              System.out.println("DELETE DATA");
        System.out.print("Masukan Nomor Siswa yang akan di hapus: Input [1-"+jumlah+"]: ");
               try{
               N=DataIn.readLine();
               }catch(IOException e){
               System.out.println("Salah!");
               }
        no=Integer.parseInt(N);
        System.out.println("Data Ke- "+no);
        no=no-1;
        Data.setNama(Nama[no],Alamat[no],Telepon[no],Email[no]);
        System.out.println("Nama       :"+Data.getNama() );
        System.out.println("Alamat     :"+Data.getAlamat() );
        System.out.println("Telepon    :"+Data.getNo_telpon() );
        System.out.println("Email      :"+Data.getEmail() );
        System.out.println();
        System.out.print("Apakah akan dihapus? y/t :");
        System.out.println();
               try{
               yesno=DataIn.readLine();
               }catch(IOException e){
               System.out.println("salah!");
               }
        if ((yesno=="tidak")||(yesno=="t")||(yesno=="T")){
            System.out.println("Data Tidak Jadi di hapus");
        }else{
            Nama[no]="";
            Alamat[no]="";
            Telepon[no]="";
            Email[no]="";
        Data.setNama(Nama[no],Alamat[no],Telepon[no],Email[no]);
        System.out.println("Nama       :"+Data.getNama() );
        System.out.println("Alamat     :"+Data.getAlamat() );
        System.out.println("Telepon    :"+Data.getNo_telpon() );
        System.out.println("Email      :"+Data.getEmail() );
        System.out.println("Data Berhasil Dihapus");
        System.out.println();
        }
        break;
                default:
        System.out.println("Terima Kasih");
    }
           } catch (Exception e) {
                    System.out.println("tidak sesuai!");
             }
         } while (Integer.parseInt(pilih) != 5);
    
    
}
}
