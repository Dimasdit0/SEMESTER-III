package responsi;

public class Main {
    public static void main(String[] args) {
        Perpustakaan perpustakaan = new Perpustakaan();

        // Menambahkan buku
        LibraryItem buku1 = new LibraryItem("Java Programming", "John Doe", "Programming", "123456789");
        LibraryItem buku2 = new LibraryItem("Data Structures", "Jane Smith", "Computer Science", "987654321");
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);

        // Menambahkan anggota
        Anggota anggota1 = new Anggota("Alice", "M001");
        perpustakaan.tambahAnggota(anggota1);

        // Menampilkan semua buku
        perpustakaan.tampilkanSemuaBuku();

        // Meminjam buku
        perpustakaan.pinjamBuku(buku1, anggota1, "2023-10-01");
        perpustakaan.tampilkanSemuaBuku(); // Menampilkan status buku setelah peminjaman
    }
}