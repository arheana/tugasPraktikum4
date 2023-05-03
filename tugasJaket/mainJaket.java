package tugasJaket;

import java.util.Scanner;

public class mainJaket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("===========================================");
        System.out.println("SELAMAT DATANG DI LABKOMDAS!\nSilakan pilih produk yang tersedia:");
        System.out.println("1. Jaket dengan bahan A\n2. JAket dengan bahan B\n3. Jaket dengan bahan C");
        System.out.print("Masukkan pilihan anda:");
        int pilihan = input.nextInt();
        System.out.println("===========================================");

        switch (pilihan){
            case 1:
            System.out.print("Anda telah memilih jaket berbahan A\nMasukkan jumlah jaket yang ingin dipesan:");
            int jumlahA = input.nextInt();
            Jaket jaketA = new Jaket();
            jaketA.totalHargaA(jumlahA);
            break;

            case 2:
            System.out.print("Anda telah memilih jaket berbahan B\nMasukkan jumlah jaket yang ingin dipesan:");
            int jumlahB = input.nextInt();
            Jaket jaketB = new Jaket();
            jaketB.totalHargaB(jumlahB);
            break;

            case 3:
            System.out.print("Anda telah memilih jaket berbahan C\nMasukkan jumlah jaket yang ingin dipesan:");
            int jumlahC = input.nextInt();
            Jaket jaketC = new Jaket();
            jaketC.totalHargaC(jumlahC);
            break;

            default:
            System.out.println("Pilihan anda tidak ditemukan, silakan masukkan kembali.");
        }
    }
}
