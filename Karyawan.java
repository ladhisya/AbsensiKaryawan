public class Karyawan {
    private String idKaryawan;
    private String nama;
    private String alamat;
    private String jabatan;

    public Karyawan(String idKaryawan, String nama, String alamat, String jabatan) {
        this.idKaryawan = idKaryawan;
        this.nama = nama;
        this.alamat = alamat;
        this.jabatan = jabatan;
    }

    public void tampilkanInfo() {
        System.out.println("ID Karyawan: " + idKaryawan);
        System.out.println("Nama: " + nama);
        System.out.println("Jabatan: " + jabatan);
        System.out.println("Alamat: " + alamat);
        System.out.println("----------------------");
    }
}