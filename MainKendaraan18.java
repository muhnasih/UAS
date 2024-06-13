import java.util.Scanner;

public class MainKendaraan18  {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            DLLKendaraan18 dll = new DLLKendaraan18();

            Kendaraan18 data1 = new Kendaraan18("S 4567 YV", "Basko", "Mobil", 2000, 1, 2012, 4, null, null);
            Kendaraan18 data2 = new Kendaraan18("AB 4321 A", "Wisnu", "Motor", 125, 2, 2010, 2, null, null);
            Kendaraan18 data3 = new Kendaraan18("N 4511 VS", "ARTA", "Mobil", 2500, 1, 2015, 4, null, null);
            Kendaraan18 data4 = new Kendaraan18("B 1234 AG", "SISA", "Motor", 150, 1, 2020, 4, null, null);


            dll.AddLast(data1);
            dll.AddLast(data2);

            System.out.println("=======================");
            System.out.println("Menu");
            System.out.println("=======================");
            System.out.println("1. Daftar Kendaraan");
            System.out.println("2. Bayar Pajak");
            System.out.println("3. Tampilkan Seluruh Transaksi");
            System.out.println("4. Urutkan Transaksi Berdasarkan Nama Pemilik");
            System.out.println("5. Keluar");
            int pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("=======================");
                    System.out.println("\nDaftar Kendaraan");
                    System.out.println("=======================");
                    dll.Print();
                    break;
                case 2:

                case 5:
                    System.exit(0);
                default:
                    System.out.println("Maaf, Anda salah memasukkan nomor!");
                    ;
            }
        }
    }
}