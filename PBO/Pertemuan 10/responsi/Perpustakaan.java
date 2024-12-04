package responsi;
import java.util.ArrayList;
import java.util.List;

class Perpustakaan {
    private List<LibraryItem> buku;
    private List<Anggota> anggota;

    public Perpustakaan() {
        buku = new ArrayList<>();
        anggota = new ArrayList<>();
    }

    public void tambahBuku(LibraryItem buku) {
        this.buku.add(buku);
    }

    public void tambahAnggota(Anggota anggota) {
        this.anggota.add(anggota);
    }

    public void tampilkanSemuaBuku() {
        System.out.println("\n===============================");
        System.out.println("          Daftar Buku          ");
        System.out.println("===============================");
        System.out.printf("| %-13s | %-20s | %-25s | %-15s | %-10s |\n", 
                          "ISBN", "Title", "Author", "Category", "Available");
        System.out.println("-------------------------------------------------------------");
        for (LibraryItem item : buku) {
            item.displayInfo();
        }
        System.out.println("===============================");
    }

    public void pinjamBuku(LibraryItem buku, Anggota anggota, String tanggalPinjam) {
        if (buku.isAvailable()) {
            PinjamBuku pinjam = new PinjamBuku(buku, anggota, tanggalPinjam);
            System.out.println("Buku berhasil dipinjam.");
            pinjam.displayInfoPinjamBuku(); // Call the method to display borrowing info
        } else {
            System.out.println("Buku tidak tersedia untuk dipinjam.");
        }
    }
}
