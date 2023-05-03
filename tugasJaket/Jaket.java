package tugasJaket;

class Jaket{
    final int HARGA_JAKET_A = 100000;
    final int HARGA_JAKET_B = 125000;
    final int HARGA_JAKET_C = 175000;

    public void totalHargaA(int jumlahA){
        if(jumlahA <= 100) {
            int total = jumlahA * HARGA_JAKET_A;
            System.out.println("Total harga yang harus anda bayar sebesar : " + total);
        } else {
            int total = jumlahA * (HARGA_JAKET_A - 5000);
            System.out.println("Total harga yang harus anda bayar sebesar : " + total);
        }
    }

    public void totalHargaB(int jumlahB){
        if(jumlahB <= 100) {
            int total = jumlahB * HARGA_JAKET_B;
            System.out.println("Total harga yang harus anda bayar sebesar : " + total);
        } else {
            int total = jumlahB * (HARGA_JAKET_B - 5000);
            System.out.println("Total harga yang harus anda bayar sebesar : " + total);
        }
    }

    public void totalHargaC(int jumlahC){
        if(jumlahC <= 100) {
            int total = jumlahC * HARGA_JAKET_C;
            System.out.println("Total harga yang harus anda bayar sebesar : " + total);
        } else {
            int total = jumlahC * (HARGA_JAKET_C - 15000);
            System.out.println("Total harga yang harus anda bayar sebesar : " + total);
        }
    }
}