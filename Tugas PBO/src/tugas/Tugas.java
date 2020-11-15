package tugas;

import java.util.Scanner;

/* Ini objek */
class Mahasiswa{
    String NIM, nama;
    int umur, IPK;
    
    /* Ini constructor */
    public Mahasiswa(String NIM, String nama, int umur, int IPK){
        this.NIM = NIM;
        this.nama = nama;
        this.umur = umur;
        this.IPK = IPK;
    }
    /* end constructor */
    
    /* Ini metode */
    void IPKberubah(int IPK){
        this.IPK = IPK;
    }
    
    void tampil_data(){
        System.out.println("NIM\t: " + this.NIM);
        System.out.println("Nama\t: " + this.nama);
        System.out.println("Umur\t: " + this.umur);
        System.out.println("IPK\t: " + this.IPK);
        System.out.println();
    }
    /* end metode */
}
/* end objek */

public class Tugas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  //import objek scanner
        
        System.out.print("Banyak mahasiswa\t: ");
        int banyak_mahasiswa = scan.nextInt();
        
        String NIM, nama;
        int umur, IPK; 
        Mahasiswa mhs[] = new Mahasiswa[banyak_mahasiswa];
        
        for(int i = 0; i < banyak_mahasiswa; i++){
            /* input data */
            System.out.print("NIM\t: ");
            NIM = scan.next();
            
            scan.nextLine(); //clear buffer
            
            System.out.print("Nama\t: ");
            nama = scan.nextLine();
            
            System.out.print("Umur\t: ");
            umur = scan.nextInt();
            
            System.out.print("IPK\t: ");
            IPK = scan.nextInt();
            /* end input */
            
            
            mhs[i] = new Mahasiswa(NIM, nama, umur, IPK);
            System.out.println();
        }
        
        System.out.println("Output :");
        /* output */
        for(int i = 0; i < banyak_mahasiswa; i++){
            mhs[i].tampil_data();
            System.out.println();
        }
        /* end output */
    }
}
