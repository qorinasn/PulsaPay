package uas.alpro.pkg1;

import java.util.Scanner;

public class UAS_ALPRO_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=====PENGISIAN PULSA=====");
        String kode;
        System.out.print("Masukan Kode Nomor Hp Anda : "); kode = input.next();   
             
        switch (kode){
            case "081": 
                System.out.println("Jenis Operator : Telkomsel");
                System.out.println(" ");
                break;
            case "085": 
                System.out.println("Jenis Operator : Indosat Oredoo");
                System.out.println(" ");
                break;
            case "089": 
                System.out.println("Jenis Operator : Three");
                System.out.println(" ");
                break;
            case "088":
                System.out.println("Jenis Operator : Smartfren");
                System.out.println(" ");
                break;
            default:
                System.out.println("Kode Tidak Terdaftar");
                System.out.println(" ");
            }
            String nomor;
            System.out.print("Masukan Nomor Telp Anda : "); nomor = input.next(); 
            
            int nominal;int detailbayar; int bonus;int bayar;
            System.out.print ("Masukan Nominal Pengisian Pulsa : Rp ");
            nominal = input.nextInt(); 
     
            if (nominal > 25000) {
            bonus = (int)(nominal * 0.1);  
            int pajak = (int) (nominal * 0.05);
            detailbayar = nominal+bonus+pajak;
            }else 
            bonus = 0;
            int pajak = (int) (nominal * 0.05);
            detailbayar = nominal+pajak;
            System.out.println("Bonus pulsa Anda Rp "+bonus);
            System.out.println("Total Pembayaran Anda Rp "+detailbayar);
            System.out.println(" ");
            
            System.out.print("Jumlah Uang yang dibayarkan : ");
            bayar = input.nextInt();
            while (bayar>detailbayar){ 
            int kembalian = bayar-detailbayar;
            System.out.println("Kembalian Anda Rp "+kembalian);
            System.out.println("Terima Kasih, Pulsa Anda Telah Dikirim ke Nomor "+nomor);
            break; 
            }
            while (bayar<detailbayar){
            int kurang = detailbayar-bayar;
            System.out.println("Maaf, Uang Anda Kurang Rp "+kurang);
            break;
        }  
    }
}