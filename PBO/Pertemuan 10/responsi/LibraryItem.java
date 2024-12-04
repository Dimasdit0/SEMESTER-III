package responsi;

class LibraryItem {
    private String title;
    private String author;
    private String category;
    private String isbn;
    private boolean isAvailable;

    public LibraryItem(String title, String author, String category, String isbn) {
        this.title = title;
        this.author = author;
        this.category = category;
        this.isbn = isbn;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void displayInfo() {
        System.out.printf("| %-13s | %-20s | %-25s | %-15s | %-10s |\n", 
                          isbn, title, author, category, (isAvailable ? "Yes" : "No"));
    }
}