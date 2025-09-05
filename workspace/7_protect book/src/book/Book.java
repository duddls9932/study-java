package book;

import java.util.Objects;

//요구사항
//Book 클래스
//
//title (책 제목)
//
//author (저자)
//
//isbn (고유 식별번호)
//
//isAvailable (대출 가능 여부)
//
//LibraryService 클래스 (내부에 ArrayList<Book> 보유)
//
//해야 할 기능 (메소드)

public class Book {
	private String title;
	private String author;
	private int isbn;
	private boolean isAvailable;
	public Book() {;}
	public Book(String title, String author, int isbn, boolean isAvailable) {
		super();
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.isAvailable = isAvailable;
	}
	@Override
	public int hashCode() {
		return Objects.hash(author, isAvailable, isbn, title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && isAvailable == other.isAvailable && isbn == other.isbn
				&& Objects.equals(title, other.title);
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", isbn=" + isbn + ", isAvailable=" + isAvailable + "]";
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
	

}
