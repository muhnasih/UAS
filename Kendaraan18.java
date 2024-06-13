public class Kendaraan18 {
    String no_tnkb, nama, jenis;
    int cc, tahun, bulan_harus_bayar, data;
    Kendaraan18 prev, next;

    Kendaraan18(String no_tnkb, String nama, String jenis, int cc, int data, int tahun, int bulan_harus_bayar, Kendaraan18 prev, Kendaraan18 next) {
        this.no_tnkb = no_tnkb;
        this.nama = nama;
        this.jenis = jenis;
        this.cc = cc;
        this.tahun = tahun;
        this.bulan_harus_bayar = bulan_harus_bayar;
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}