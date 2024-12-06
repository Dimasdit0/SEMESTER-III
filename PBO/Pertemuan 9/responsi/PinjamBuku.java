package responsi;
import java.util.ArrayList;
import java.util.List;

class PinjamBuku {
    private LibraryItem book;
    private Anggota member;
    private String borrowDate;

    public PinjamBuku(LibraryItem book, Anggota member, String borrowDate) {
        this.book = book;
        this.member = member;
        this.borrowDate = borrowDate;
        book.setAvailable(false); // Mark the book as borrowed
    }

    public void displayInfoPinjamBuku() {
        System.out.printf("%s has borrowed the book: \"%s\" on %s.\n", 
                          member.getName(), book.getTitle(), borrowDate);
    }
}