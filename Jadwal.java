import java.time.LocalTime;
import java.time.Duration;

public class Jadwal {
    private int idJadwal;
    private LocalTime jamMulai;
    private LocalTime jamSelesai;

    public Jadwal(int idJadwal, LocalTime jamMulai, LocalTime jamSelesai) {
        this.idJadwal = idJadwal;
        this.jamMulai = jamMulai;
        this.jamSelesai = jamSelesai;
    }

    public LocalTime getJamMulai() {
        return jamMulai;
    }

    public LocalTime getJamSelesai() {
        return jamSelesai;
    }

    public int getDurasiJam() {
        return (int) Duration.between(jamMulai, jamSelesai).toHours();
    }
}