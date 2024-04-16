public class Book extends Item {
    private String author;
    private String description;
    private String categoty;
    private String releaseDate;

    public Book(String bookId, String name, int unitPrice) {
        super(bookId, name, unitPrice);
    }

    public Book(String bookId, String name, int unitPrice, String author, String description, String category, String releaseDate) {
        super(bookId, name, unitPrice);
        this.author = author;
        this.description = description;
        this.categoty = category;
        this.releaseDate = releaseDate;
    } 
    // getter 함수 정의
    public String getBookId() { return bookId; }
    public String getName() { return name; }
    public int getUnitPrice() { return unitPrice; }
    public String getAuthor() { return author; }
    public String getDescription() { return description; }
    public String getCategory() { return categoty; }
    public String getReleaseDate() { return releaseDate; }

    // setter 함수 정의
    public void setBookId(String bookId) { this.bookId = bookId; } 
    public void setName(String name) { this.name = name; }
    public void setUnitPrice(int unitPrice) { this.unitPrice = unitPrice; }
    public void setAuthor(String author) { this.author = author; }
    public void setDescription(String description) { this.description = description; }
    public void setCategory(String category) { this.categoty = category; }
    public void setReleaseDate(String releaseDate) { this.releaseDate; }
}
