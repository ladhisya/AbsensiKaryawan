import java.time.*;

public class Hadir extends Absensi {

    public Hadir(String idAbsensi, LocalDate tanggal) {
        super(idAbsensi, tanggal);
    }

    @Override
    public void hitungTotalJam() {
        LocalTime masuk = getJamMasuk();
        LocalTime keluar = getJamKeluar();

        if (masuk != null && keluar != null) {
            long jam = Duration.between(masuk, keluar).toHours();
            setTotalJam((int) jam);
        }
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Status: HADIR");
        System.out.println("----------------------");
    }
}