import java.util.Random;
import java.util.Scanner;

public class TebakAngka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int angkaRahasia = rand.nextInt(100) + 1; // angka 1-100
        int tebakan;
        int percobaan = 0;

        System.out.println("🎮 Selamat datang di Game Tebak Angka!");
        System.out.println("Saya sudah memilih angka antara 1 dan 100.");
        System.out.println("Coba tebak angkanya!");

        do {
            System.out.print("Masukkan tebakanmu: ");
            tebakan = input.nextInt();
            percobaan++;

            if (tebakan > angkaRahasia) {
                System.out.println("Terlalu besar! Coba lagi.");
            } else if (tebakan < angkaRahasia) {
                System.out.println("Terlalu kecil! Coba lagi.");
            } else {
                System.out.println("🎉 Selamat! Kamu berhasil menebak angka " + angkaRahasia +
                        " dalam " + percobaan + " percobaan.");
            }
        } while (tebakan != angkaRahasia);

        input.close();
        System.out.println("Game selesai. Terima kasih telah bermain!");
    }
}
