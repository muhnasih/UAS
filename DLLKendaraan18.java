public class DLLKendaraan18 {
    int kode, bulan_bayar, size, data;
    long nominal_bayar, denda;
    Kendaraan18 head;

    public DLLKendaraan18() {
        head = null;
        size = 0;
    }

    boolean IsEmpty() {
        return head == null;
    }

    void AddFirst(Kendaraan18 kendaraan) {
        if (IsEmpty()) {
            head = kendaraan;
        } else {
            kendaraan.next = head;
            head.prev = kendaraan;
            head = kendaraan;
        }
        size++;
    }

    void AddLast(Kendaraan18 kendaraan) {
        if (IsEmpty()) {
            head = kendaraan;
        } else {
            Kendaraan18 current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = kendaraan;
            kendaraan.prev = current;
        }
        size++;
    }

    void Add(Kendaraan18 kendaraan, int index) throws Exception {
        if (IsEmpty()) {
            if (index != 0) {
                throw new Exception("Indeks diluar batas!");
            }
            head = kendaraan;
        } else if (index == 0) {
            AddFirst(kendaraan);
        } else {
            Kendaraan18 current = head;
            int i = 0;
            while (i < index - 1 && current.next != null) {
                current = current.next;
                i++;
            }
            if (current.next != null) {
                kendaraan.next = current.next;
                current.next.prev = kendaraan;
            }
            current.next = kendaraan;
            kendaraan.prev = current;
        }
        size++;
    }

    int Size() {
        return size;
    }

    void Clear() {
        head = null;
        size = 0;
    }

    void Print() {
        if (!IsEmpty()) {
            Kendaraan18 current = head;
            int count = 1;
            while (current != null) {
                System.out.println("Data " + count + ":");
                System.out.println("Nomor TNKB: " + current.no_tnkb);
                System.out.println("Nama Pemilik: " + current.nama);
                System.out.println("Jenis: " + current.jenis);
                System.out.println("CC Kendaraan: " + current.cc);
                System.out.println("Tahun: " + current.tahun);
                System.out.println("Bulan Harus Bayar: " + current.bulan_harus_bayar);
                System.out.println();
                current = current.next;
                count++;
            }
        } else {
            System.out.println("Linked List masih kosong.");
        }
    }
}