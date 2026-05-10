import java.time.*;

public class Absensi {
    private String idAbsensi;
    private LocalDate tanggal;
    private LocalTime jamMasuk;
    private LocalTime jamKeluar;
    private int totalJam;
    private Jadwal jadwal;

    public Absensi(String idAbsensi, LocalDate tanggal) {
        this.idAbsensi = idAbsensi;
        this.tanggal = tanggal;
    }

    // Getter
    public String getIdAbsensi() { return idAbsensi; }
    public LocalDate getTanggal() { return tanggal; }
    public LocalTime getJamMasuk() { return jamMasuk; }
    public LocalTime getJamKeluar() { return jamKeluar; }
    public int getTotalJam() { return totalJam; }
    public Jadwal getJadwal() { return jadwal; }

    // Setter
    public void setJadwal(Jadwal jadwal) {
        this.jadwal = jadwal;
    }

    protected void setTotalJam(int totalJam) {
        this.totalJam = totalJam;
    }

    // Method
    public void checkIn(LocalTime jamMasuk) {
        this.jamMasuk = jamMasuk;
    }

    public void checkOut(LocalTime jamKeluar) {
        if (jamMasuk != null && jamKeluar.isAfter(jamMasuk)) {
            this.jamKeluar = jamKeluar;
            hitungTotalJam();
        } else {
            System.out.println("Jam keluar tidak valid!");
        }
    }

    public void hitungTotalJam() {
        if (jamMasuk != null && jamKeluar != null) {
            long jam = Duration.between(jamMasuk, jamKeluar).toHours();
            setTotalJam((int) jam);
        }
    }

    public boolean validasiJamKerja() {
    
    if (jamMasuk == null || jamKeluar == null) {
        return false;
    }

    return totalJam <= 12;
}

    public void tampilkanInfo() {
        System.out.println("ID Absensi: " + idAbsensi);
        System.out.println("Tanggal: " + tanggal);
        System.out.println("Masuk: " + jamMasuk);
        System.out.println("Keluar: " + jamKeluar);
        System.out.println("Total Jam: " + totalJam);

        if (jadwal != null) {
            System.out.println("Jadwal: " + jadwal.getJamMulai() + " - " + jadwal.getJamSelesai());
        }
    }
}