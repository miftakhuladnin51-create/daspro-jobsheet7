import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int HARGA = 50000;

        int totalTiket = 0;
        double totalPenjualan = 0;
        int jumlah;

        do {
            System.out.print("Jumlah tiket pelanggan (0 untuk selesai): ");
            jumlah = sc.nextInt();

            if (jumlah < 0) {
                System.out.println("Input tidak valid, silakan ulangi!");
                continue;
            }

            if (jumlah > 0) {
                double harga = jumlah * HARGA;
                double diskon = 0;

                if (jumlah > 10) {
                    diskon = 0.15;
                } else if (jumlah > 4) {
                    diskon = 0.10;
                }

                double bayar = harga - (harga * diskon);
                System.out.println("Diskon      : " + (int) (diskon * 100) + "%");
                System.out.println("Total bayar : Rp " + (long) bayar);

                totalTiket += jumlah;
                totalPenjualan += bayar;
            }
        } while (jumlah != 0);

        System.out.println("\n=== Rekap Penjualan Hari Ini ===");
        System.out.println("Total tiket terjual : " + totalTiket);
        System.out.println("Total penjualan     : Rp " + (long) totalPenjualan);
        sc.close();
    }
}
