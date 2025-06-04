package collections;

public class Book {
	int bookId;
	String bookName;
	String authorName;

	public Book(int bookId, String bookName, String authorName) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
	}

	public void displayBook() {
		System.out.println("BookId: " + bookId + " BookId: " + bookName + " BookId: " + authorName);
	}
}
