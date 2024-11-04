package pertemuan6;
import java.util.Scanner;

public class latihan19_tabunganSaldo {
  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan saldo awal: Rp. ");
        double saldoAwal = input.nextDouble();
        System.out.print("Masukkan bunga per bulan (%): ");
        double bunga = input.nextDouble();
        System.out.print("Masukkan lama tabungan (bulan): ");
        int lama = input.nextInt();

        System.out.println("Saldo tabungan per bulan:");
        for (int i = 1; i <= lama; i++) {
            saldoAwal += saldoAwal * (bunga / 100);
            System.out.printf("Saldo di bulan ke-%d: Rp. %.2f%n", i, saldoAwal);
        }
    }

}
