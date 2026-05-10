import java.util.Scanner;
import java.time.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("ID Karyawan: ");
        String idK = input.nextLine();

        System.out.print("Nama: ");
        String nama = input.nextLine();

        System.out.print("Alamat: ");
        String alamat = input.nextLine();

        System.out.print("Jabatan: ");
        String jabatan = input.nextLine();

        Karyawan k1 = new Karyawan(idK, nama, alamat, jabatan);

        System.out.print("Status (hadir/alpha): ");
        String status = input.nextLine();

        System.out.print("ID Absensi: ");
        String id = input.nextLine();

        Absensi a1;

        if (status.equalsIgnoreCase("hadir")) {
            System.out.print("Jam Masuk (HH:mm): ");
            LocalTime jamMasuk = LocalTime.parse(input.nextLine());

            System.out.print("Jam Keluar (HH:mm): ");
            LocalTime jamKeluar = LocalTime.parse(input.nextLine());

            a1 = new Hadir(id, LocalDate.now());

            Jadwal j1 = new Jadwal(1, jamMasuk, jamKeluar);
            a1.setJadwal(j1);

            a1.checkIn(jamMasuk);
            a1.checkOut(jamKeluar);

        } else {
            a1 = new Alpha(id, LocalDate.now());
        }

        System.out.println("\n=== DATA KARYAWAN ===");
        k1.tampilkanInfo();

        System.out.println("=== DATA ABSENSI ===");
        a1.tampilkanInfo();

        if (a1.validasiJamKerja()) {
            System.out.println("Status: Valid");
        } else {
            System.out.println("Status: Tidak Valid");
        }

        input.close();
    }
}