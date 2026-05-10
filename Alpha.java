import java.time.*;

public class Alpha extends Absensi {

    public Alpha(String idAbsensi, LocalDate tanggal) {
        super(idAbsensi, tanggal);
    }

    @Override
    public void checkIn(LocalTime jamMasuk) {
        System.out.println("Alpha tidak bisa check-in!");
    }

    @Override
    public void checkOut(LocalTime jamKeluar) {
        System.out.println("Alpha tidak punya jam kerja!");
    }

    @Override
    public void hitungTotalJam() {
        setTotalJam(0);
    }

    @Override
    public boolean validasiJamKerja() {
        return false;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("ID Absensi: " + getIdAbsensi());
        System.out.println("Tanggal: " + getTanggal());
        System.out.println("Status: ALPHA (tidak hadir)");
        System.out.println("----------------------");
    }
}