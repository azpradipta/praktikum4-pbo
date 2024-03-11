import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih Bangun Ruang:");
        System.out.println("1. Kubus");
        System.out.println("2. Balok");
        System.out.println("3. Tabung");
        System.out.print("Masukkan pilihan Anda: ");
        int pilihan = scanner.nextInt();

        float sisi, panjang, lebar, tinggi, jariTabung, tinggiTabung;
        float luasPermukaan, volume;

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan sisi kubus: ");
                sisi = scanner.nextFloat();
                Kubus kubus = new Kubus(sisi);
                luasPermukaan = kubus.hitungLuasPermukaan();
                volume = kubus.hitungVolume();
                System.out.printf("Luas Permukaan Kubus: %.2f%n", luasPermukaan);
                System.out.printf("Volume Kubus: %.2f%n", volume);
                break;
            case 2:
                System.out.print("Masukkan panjang balok: ");
                panjang = scanner.nextFloat();
                System.out.print("Masukkan lebar balok: ");
                lebar = scanner.nextFloat();
                System.out.print("Masukkan tinggi balok: ");
                tinggi = scanner.nextFloat();
                Balok balok = new Balok(panjang, lebar, tinggi);
                luasPermukaan = balok.hitungLuasPermukaan();
                volume = balok.hitungVolume();
                System.out.printf("Luas Permukaan Balok: %.2f%n", luasPermukaan);
                System.out.printf("Volume Balok: %.2f%n", volume);
                break;
            case 3:
                System.out.print("Masukkan jari-jari tabung: ");
                jariTabung = scanner.nextFloat();
                System.out.print("Masukkan tinggi tabung: ");
                tinggiTabung = scanner.nextFloat();
                Tabung tabung = new Tabung(jariTabung, tinggiTabung);
                luasPermukaan = tabung.hitungLuasPermukaan();
                volume = tabung.hitungVolume();
                System.out.printf("Luas Permukaan Tabung: %.2f%n", luasPermukaan);
                System.out.printf("Volume Tabung: %.2f%n", volume);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}